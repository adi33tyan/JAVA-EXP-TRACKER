package com.expensetracker.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/expensetracker";
        
        // Database credentials
        String username ="root";
        String password = "dhoni123";
        
        // Establishing Connection
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");
            // Use the connection here
            // Don't forget to close the connection when done
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}