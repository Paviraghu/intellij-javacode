package com.pavi.learning.java.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSelectExample {

    public static void main(String[] args) {

        String selectQuery = "SELECT id,name,address,age FROM persons";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(selectQuery);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("Name");
                String address = resultSet.getString("Address");
                System.out.println("ID:" + id + "Name:" + name + "Address:" + address);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResources(connection, preparedStatement, resultSet);
        }
    }
}
