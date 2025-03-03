package com.pavi.learning.java.database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class InserFileToDatabase {

    static ArrayList<MotorInsuranceData> list = new ArrayList<>();

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(cwd + "/motor/motor_insurance_data.csv"));

            String line;

            int lineNo = 1;
            while ((line = bufferedReader.readLine()) != null) {

                line = line + "0";
                if (lineNo == 1) {
                    lineNo++;
                    continue;
                }
                String[] lines = line.split(",");

                MotorInsuranceData data = new MotorInsuranceData();

                data.setSex(Integer.parseInt(lines[0]));
                data.setInsr_Begin(lines[1]);
                data.setInsr_End(lines[2]);
                data.setEffective_Yr((lines[3]));
                data.setInsr_Type(Integer.parseInt(lines[4]));
                data.setInsured_Value(Double.parseDouble(lines[5]));
                if (lines[6].isEmpty()) {
                    lines[6] = "0.0";
                }
                data.setPremium(Double.parseDouble(lines[6]));
                data.setObject_Id(Long.parseLong(lines[7]));
                if (lines[8].isEmpty()) {
                    lines[8] = "0";
                }
                data.setProd_Year(Integer.parseInt(lines[8]));
                if (lines[9].isEmpty()) {
                    lines[9] = "0";
                }
                data.setSeats_Num(Integer.parseInt(lines[9]));

                if (lines[10].isEmpty()) {
                    lines[10] = "0.0";
                }
                data.setCarrying_Capacity(Double.parseDouble(lines[10]));
                data.setType_Vehicle(lines[11]);

                if (lines[12].isEmpty()) {
                    lines[12] = "0.0";
                }
                data.setCcm_Ton(Double.parseDouble(lines[12]));
                data.setMake(lines[13]);
                data.setUsage(lines[14]);
                data.setClaim_Paid(lines[15]);

                list.add(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        insert();
    }

    public static void insert() {

        String insertQuery = "INSERT INTO Motor (SEX,INSR_BEGIN,INSR_END,EFFECTIVE_YR,INSR_TYPE,INSURED_VALUE,PREMIUM,OBJECT_ID,PROD_YEAR,SEATS_NUM,CARRYING_CAPACITY,TYPE_VEHICLE,CCM_TON,MAKE,`USEAGE`,CLAIM_PAID)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try {
            connection = DBUtil.getConnection();

            int insertedcnt = 0;

            preparedStatement = connection.prepareStatement(insertQuery);

            for (MotorInsuranceData x : list) {

                preparedStatement.setInt(1, x.getSex());
                preparedStatement.setString(2, x.getInsr_Begin());
                preparedStatement.setString(3, x.getInsr_End());
                preparedStatement.setString(4, x.getEffective_Yr());
                preparedStatement.setInt(5, x.getInsr_Type());
                preparedStatement.setDouble(6, x.getInsured_Value());
                preparedStatement.setDouble(7, x.getPremium());
                preparedStatement.setLong(8, x.getObject_Id());
                preparedStatement.setInt(9, x.getProd_Year());
                preparedStatement.setInt(10, x.getSeats_Num());
                preparedStatement.setDouble(11, x.getCarrying_Capacity());
                preparedStatement.setString(12, x.getType_Vehicle());
                preparedStatement.setDouble(13, x.getCcm_Ton());
                preparedStatement.setString(14, x.getMake());
                preparedStatement.setString(15, x.getUsage());
                preparedStatement.setString(16, x.getClaim_Paid());

                preparedStatement.executeUpdate();

                insertedcnt++;
            }
            System.out.println("Insert successful ! Rows affected : " + insertedcnt);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeResources(connection, preparedStatement);
        }
    }
}
