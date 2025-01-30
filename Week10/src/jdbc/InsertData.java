package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week10", "root", "admin");
        System.out.println("Connected!");
        String useSql = "USE week10";
        String sql = "INSERT INTO students(name, email, course) VALUES ('Ram', 'ram@gmail.com', 'BIT');";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(useSql);
        stmt.executeUpdate(sql);
        System.out.println("Data inserted successfully!");
        stmt.close();
    }
}
