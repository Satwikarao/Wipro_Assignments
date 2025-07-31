package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q50 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username = "root";
        String password = "Prasadrao@1234"; // Replace with your real password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connection successful!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
        }
    }
}



