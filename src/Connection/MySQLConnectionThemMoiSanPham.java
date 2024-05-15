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
public class MySQLConnectionThemMoiSanPham {
    private static final String URL = "jdbc:mysql://localhost:3306/quanlikho";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    public static boolean ThemMoiSanPham(String IDHangHoa,String TenHangHoa, String Mota, String GiaBan , int IDNCC){
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "INSERT INTO hanghoa (IDHangHoa,TenHangHoa ,Mota, GiaBan,IDNCC, SoLuongTonKho) VALUES (?, ?, ?,?,?,0)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, IDHangHoa);
            statement.setString(2, TenHangHoa);
            statement.setString(3, Mota);
            statement.setString(4,  GiaBan);
            statement.setInt(5,  IDNCC);
            int rowsInserted = statement.executeUpdate();

            return rowsInserted > 0; // Kiểm tra xem có kết quả trả về hay không
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }  

    public static boolean ThemNhaCungCapMoi(String IDNCC, String TenNhaCungCap, String Mail, String DiaChi, String SoDienThoai) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static com.sun.jdi.connect.spi.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    }

