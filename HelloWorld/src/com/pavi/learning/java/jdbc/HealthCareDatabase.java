package com.pavi.learning.java.jdbc;

import com.pavi.learning.java.database.DBUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HealthCareDatabase {

    static ArrayList<HealthCare> list = new ArrayList<>();

    static Health health = new Health();

    public static void main(String[] args) {

        health.setStartTime(LocalDateTime.now());

        System.out.println("Data Parsing Starts:" + LocalDateTime.now());

        Path cwd = Path.of("").toAbsolutePath();

        try {

            BufferedReader br = new BufferedReader(new FileReader(cwd + "/data/csv file/healthcare_dataset.csv"));

            String line;

            int lineCnt = 0;
            while ((line = br.readLine()) != null) {

                if (lineCnt == 0) {
                    lineCnt++;
                    continue;
                }

                String[] lines = line.split(",");

                HealthCare data = new HealthCare();

                data.setName(lines[0]);
                data.setAge(Integer.parseInt(lines[1]));
                data.setGender(lines[2]);
                data.setBloodType(lines[3]);
                data.setMedicalCondition(lines[4]);
                data.setDateOfAdmission(lines[5]);
                data.setDoctor(lines[6]);
                data.setHospital(lines[7]);
                data.setInsuranceProvider(lines[8]);
                data.setBillingAmount(Float.parseFloat(lines[9]));
                data.setRoomNumber(Integer.parseInt(lines[10]));
                data.setAdmissionType(lines[11]);
                data.setDischargeDate(lines[12]);
                data.setMedication(lines[13]);
                data.setTestResults(lines[14]);

                list.add(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Parsed Count:" + list.size());

        System.out.println("Data Parsing Ends:" + LocalDateTime.now());

        System.out.println("Ingestion starts:" + LocalDateTime.now());

        HealthCareDatabase hcdb = new HealthCareDatabase();

        hcdb.startIngestion();

        health.setEndTime(LocalDateTime.now());
    }

    public void startIngestion() {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        int totalSize = list.size();
        int chunkSize = (int) Math.ceil((double) totalSize / 6);

        for (int i = 0; i < 6; i++) {

            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, totalSize);

            if (start < totalSize) {
                List<HealthCare> sublist = list.subList(start, end);
                executorService.submit(new PartDataProcessor(sublist));
            }
        }
        executorService.shutdown();
    }

    static class PartDataProcessor implements Runnable {


        List<HealthCare> partData;

        public PartDataProcessor(List<HealthCare> partData) {
            this.partData = partData;
        }

        @Override
        public void run() {

            System.out.println("PartData:" + partData.size());

            String insertQuery = "INSERT INTO healths(Name,Age,Gender,BloodType,MedicalCondition,DateOfAdmission,Doctor,Hospital,InsuranceProvider,BillingAmount,RoomNumber,AdmissionType,DischargeDate,Medication,TestResults)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            Connection connection = null;

            try {
                connection = DBUtil.getConnection();
                preparedStatement = connection.prepareStatement(insertQuery);


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {

                int insertCount = 0;

                for (HealthCare x : partData) {

                    preparedStatement.setString(1, x.getName());
                    preparedStatement.setInt(2, x.getAge());
                    preparedStatement.setString(3, x.getGender());
                    preparedStatement.setString(4, x.getBloodType());
                    preparedStatement.setString(5, x.getMedication());
                    preparedStatement.setString(6, x.getDateOfAdmission());
                    preparedStatement.setString(7, x.getDoctor());
                    preparedStatement.setString(8, x.getHospital());
                    preparedStatement.setString(9, x.getInsuranceProvider());
                    preparedStatement.setFloat(10, x.getBillingAmount());
                    preparedStatement.setInt(11, x.getRoomNumber());
                    preparedStatement.setString(12, x.getAdmissionType());
                    preparedStatement.setString(13, x.getDischargeDate());
                    preparedStatement.setString(14, x.getMedication());
                    preparedStatement.setString(15, x.getTestResults());

                    preparedStatement.executeUpdate();

                    insertCount++;

                }

                System.out.println("Inserted count:" + insertCount + " Completed:" + LocalDateTime.now());

            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                DBUtil.closeResources(connection, preparedStatement);
            }
        }
    }
}
