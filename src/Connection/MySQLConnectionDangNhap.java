/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

/**
 *
 * @author dangt
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnectionDangNhap {
    private static final String URL = "jdbc:mysql://localhost:3306/quanlikho";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static boolean validateLogin(String IDnhanvien, String Password) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "SELECT * FROM nhanvien WHERE IDnhanvien = ? AND Password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, IDnhanvien);
            statement.setString(2, Password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next(); // Kiểm tra xem có kết quả trả về hay không
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}

