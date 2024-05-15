/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.SanPham;
import Views.GiaoDien;
/**
 *
 * @author dangt
 */



public class MysqlConnectionDangKy {
    private static final String URL = "jdbc:mysql://localhost:3306/quanlikho";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static boolean registerEmployee(String IDnhanvien,String TenNhanVien, String Password, String DiaChi, String SoDienThoai) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "INSERT INTO nhanvien (IDnhanvien,TenNhanVien ,DiaChi, SoDienThoai,Password) VALUES (?, ?, ?,?,?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, IDnhanvien);
            statement.setString(2, TenNhanVien);
            statement.setString(3, DiaChi);
            statement.setString(4, SoDienThoai);
            statement.setString(5, Password);
            int rowsInserted = statement.executeUpdate();

            return rowsInserted > 0; // Kiểm tra xem có kết quả trả về hay không
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }  
}

