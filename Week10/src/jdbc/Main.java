package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        try{
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create a Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
            System.out.println("Connection Established!");

            // Creating Database
            String sql = "CREATE DATABASE IF NOT EXISTS week10";

            // Step 3: Create a statement
            Statement stmt = conn.createStatement();

            // Step 4: Execute the Query
            stmt.executeUpdate(sql);
            System.out.println("Database Created");

            // Step 5: Close Connection and Statement
            stmt.close();
            conn.close();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
