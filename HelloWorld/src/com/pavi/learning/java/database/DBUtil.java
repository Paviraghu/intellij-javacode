package com.pavi.learning.java.database;

import java.sql.*;

public class DBUtil {

    private static final String url = "jdbc:mysql://localhost:3306/testloan";
    private static final String user = "root";
    private static final String password = "Pavi_54@7710";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading com.pavi.learning.java.database driver:" + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeResources(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (resultSet != null) {
                statement.close();
            }
            if (resultSet != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing resources:" + e.getMessage());
        }
    }

    public static void closeResources(Connection connection, Statement statement) {
        closeResources(connection, statement, null);
    }

    public static void closeResources(Connection connection) {
        closeResources(connection, null, null);
    }
}
