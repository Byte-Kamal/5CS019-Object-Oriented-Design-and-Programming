package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week10", "root", "admin");
        String sql = "CREATE TABLE IF NOT EXISTS students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), " +
                "email VARCHAR(100), course VARCHAR(100));";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Table Student created successfully!");
        stmt.close();
    }
}
