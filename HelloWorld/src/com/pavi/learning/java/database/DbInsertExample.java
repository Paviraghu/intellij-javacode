package com.pavi.learning.java.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbInsertExample {

    public static void main(String[] args) {

        String insertQuery = "INSERT INTO persons(id,name,address,age)VALUES(?,?,?,?)";

        PreparedStatement preparedStatement = null;
        Connection conn = null;

        try {
            conn = DBUtil.getConnection();
            preparedStatement = conn.prepareStatement(insertQuery);
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Mahil Lab");
            preparedStatement.setString(3, "Knpty");
            preparedStatement.setInt(4, 25);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Insert successfully.!Rows affected:" + rowsAffected);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeResources(conn, preparedStatement);
        }
    }
}
