package com.pavi.learning.java.filetest;

import com.pavi.learning.java.database.DBUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UsedCarApp {

    static ArrayList<UsedCar> usedCars = new ArrayList<>();

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();

        long startTime = System.currentTimeMillis();
        String startTimeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date(startTime));
        System.out.println(startTimeStamp);

        try {
            BufferedReader br = new BufferedReader(new FileReader(cwd + "/data/csv file/used_car_data.csv"));

            String line;

            int lineCnt = 0;
            while ((line = br.readLine()) != null) {

                if (lineCnt == 0) {
                    System.out.println(line);
                    lineCnt++;
                    continue;
                }

                String[] lineStrArr = line.split(",");

                UsedCar car = new UsedCar();

                car.setId(Integer.parseInt(lineStrArr[0]));
                car.setName(lineStrArr[1]);
                car.setLocation(lineStrArr[2]);
                car.setYear(Integer.parseInt(lineStrArr[3]));
                car.setKilometerDriven(Integer.parseInt(lineStrArr[4]));
                car.setFuelType(lineStrArr[5]);
                car.setTransmission(lineStrArr[6]);
                car.setOwnerType(lineStrArr[7]);
                car.setMileage(lineStrArr[8]);
                car.setEngine(lineStrArr[9]);
                car.setPower(lineStrArr[10]);
                if (!lineStrArr[11].isEmpty()) {
                    car.setSeats((int) Double.parseDouble(lineStrArr[11]));
                }
                car.setNewPrice(lineStrArr[12]);
                car.setPrice(Double.parseDouble(lineStrArr[13]));

                usedCars.add(car);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found:" + e.getMessage());
        } catch (IOException ioe) {
            System.out.println("There was problem in reading a data from file:" + ioe.getMessage());
        }

        insert();

        long endTime = System.currentTimeMillis();
        String endTimeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date(endTime));
        System.out.println(endTimeStamp);
    }

    public static void insert() {

        String insertQuery = "insert into usedcarsdata(Id,Name,Location,Year,KilometerDriven,fuelType,Transmission,ownerType,Mileage,Engine,Power,Seats,newPrice,Price)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try {

            connection = DBUtil.getConnection();

            int insertedcnt = 0;

            preparedStatement = connection.prepareStatement(insertQuery);

            for (UsedCar cars : usedCars) {

                preparedStatement.setInt(1, cars.getId());
                preparedStatement.setString(2, cars.getName());
                preparedStatement.setString(3, cars.getLocation());
                preparedStatement.setInt(4, cars.getYear());
                preparedStatement.setInt(5, cars.getKilometerDriven());
                preparedStatement.setString(6, cars.getFuelType());
                preparedStatement.setString(7, cars.getTransmission());
                preparedStatement.setString(8, cars.getOwnerType());
                preparedStatement.setString(9, cars.getMileage());
                preparedStatement.setString(10, cars.getEngine());
                preparedStatement.setString(11, cars.getPower());
                preparedStatement.setInt(12, cars.getSeats());
                preparedStatement.setString(13, cars.getNewPrice());
                preparedStatement.setDouble(14, cars.getPrice());

                preparedStatement.executeUpdate();

                insertedcnt++;
            }
            System.out.println("Insert successful! Rows affected: " + insertedcnt);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeResources(connection, preparedStatement);
        }
    }
}
