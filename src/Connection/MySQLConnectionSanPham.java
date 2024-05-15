package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class MySQLConnectionSanPham {
   private static final String URL = "jdbc:mysql://localhost:3306/quanlikho";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

 private void capNhatBangDuLieuSanPham( ) {
    try {
       Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "SELECT * FROM quanlikho.hanghoa;";
            PreparedStatement statement = conn.prepareStatement(query);
            
            ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            String IDHangHoa = resultSet.getString("id_hang_hoa");
            String TenHangHoa = resultSet.getString("ten_hang_hoa");
            String MoTa = resultSet.getString("mo_ta");
            double GiaBan = resultSet.getDouble("gia_ban");
            int SoLuongTonKho = resultSet.getInt("so_luong_ton_kho");

            model.SanPham.addRow(new Object[]{IDHangHoa, TenHangHoa, MoTa, GiaBan, SoLuongTonKho});
        }

        // Đóng kết nối
        resultSet.close();
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    }    
    }
    
}