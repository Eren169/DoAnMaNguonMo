/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dangt
 */
public class MySQLConnectionThemNhaCungCapMoi {
    private static final String URL = "jdbc:mysql://localhost:3306/quanlikho";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    public static boolean ThemNhaCungCapMoi(String IDNCC,String TenNhaCungCap, String DiaChi, String Email, String SoDienThoai ){
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "INSERT INTO nhacungcap (IDNCC,TenNhaCungCap ,DiaChi, Email, SoDienThoai) VALUES (?, ?, ?,?,?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, IDNCC);
            statement.setString(2, TenNhaCungCap);
            statement.setString(3, DiaChi);
            statement.setString(4,  Email);
            statement.setString(5,  SoDienThoai);
           
            int rowsInserted = statement.executeUpdate();

            return rowsInserted > 0; // Kiểm tra xem có kết quả trả về hay không
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }  
        
    }

