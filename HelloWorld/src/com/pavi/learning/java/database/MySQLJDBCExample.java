package com.pavi.learning.java.database;

import java.sql.*;

public class MySQLJDBCExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mahiltech";
        String user = "root";
        String password = "Pavi_54@7710";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the databases!");

            statement = connection.createStatement();

            String query = "" + "SELECT id,name,address,age FROM persons";

            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                int age = resultSet.getInt("age");
                System.out.println("ID:" + id + ",Name:" + name + ",Address:" + address + ",Age:" + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert resultSet != null;
                resultSet.close();
                connection.close();
                statement.close();

            } catch (SQLException e) {
                System.out.println("Exception occurred:" + e.getMessage());
            }
        }
    }
}
