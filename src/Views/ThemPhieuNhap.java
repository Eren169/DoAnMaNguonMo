/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dangt
 */
public class ThemPhieuNhap extends javax.swing.JFrame {

    private static final String URL = "jdbc:mysql://localhost:3306/quanlikho";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    private DefaultTableModel tableModelPhieuNhap;

    /**
     * Creates new form ThemPhieuNhap
     */
    public ThemPhieuNhap() {
        initComponents();
        setLocationRelativeTo(null);
        LoadSanPham();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ThemMoi = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        MaSanPhamComboBox = new javax.swing.JComboBox<>();
        TenSanPham = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MaPhieuNhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SoLuong = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        NutThemSanPham = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        GiaNhap = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MaNhaCungCap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Nhà Cung Cấp", "Số Lượng", "Giá Nhập"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ThemMoi.setText("Thêm Phiếu Mới");
        ThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemMoiActionPerformed(evt);
            }
        });

        jButton2.setText("Hủy Phiếu ");

        MaSanPhamComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Mã Sản Phẩm");

        jLabel3.setText("Tên Sản Phẩm");

        jLabel5.setText("Mã Phiếu Nhập");

        jLabel6.setText("Số Lượng");

        NutThemSanPham.setText("Thêm Sản Phẩm");
        NutThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutThemSanPhamActionPerformed(evt);
            }
        });

        jButton5.setText("Hủy");

        jLabel7.setText("Giá Nhập");

        jLabel4.setText("Mã Nhà Cung Cấp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ThemMoi)
                .addGap(78, 78, 78)
                .addComponent(jButton2)
                .addContainerGap(534, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(NutThemSanPham)
                        .addGap(41, 41, 41)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MaPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(MaSanPhamComboBox, 0, 179, Short.MAX_VALUE)
                            .addComponent(TenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(GiaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNhaCungCap))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MaSanPhamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TenSanPham)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NutThemSanPham)
                            .addComponent(jButton5))
                        .addGap(142, 142, 142))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemMoi)
                    .addComponent(jButton2))
                .addGap(0, 81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NutThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutThemSanPhamActionPerformed
        // TODO add your handling code here:
        String selectedProduct = (String) MaSanPhamComboBox.getSelectedItem();
        if (selectedProduct != null) {
            String[] parts = selectedProduct.split("-");
            String IDHangHoa = parts[0];
            String TenSanPham = parts[1];
            String IDNCC = MaNhaCungCap.getText();
            String giaNhap = GiaNhap.getText();
            int soLuong = (Integer) SoLuong.getValue();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{IDHangHoa, TenSanPham, IDHangHoa, soLuong, giaNhap});
        }
    }//GEN-LAST:event_NutThemSanPhamActionPerformed

    private void ThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemMoiActionPerformed
        // TODO add your handling code here:
        // Thu thập dữ liệu
        String maPhieuNhap = MaPhieuNhap.getText().trim();
        if (maPhieuNhap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã phiếu nhập không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Bảng không có sản phẩm nào để thêm", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Thêm phiếu nhập mới vào cơ sở dữ liệu
        try {
            java.sql.Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "INSERT INTO nhaphang (IDNhapHang,IDDonVi) VALUES (?,0)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            conn.setAutoCommit(false); // Bắt đầu transaction

            // Ví dụ giả định có bảng PhieuNhap để lưu trữ phiếu nhập
            pstmt.setString(1, maPhieuNhap);
            pstmt.executeUpdate();

            // Thêm từng sản phẩm từ jTable vào cơ sở dữ liệu
            for (int i = 0; i < model.getRowCount(); i++) {
                String maHangHoa = model.getValueAt(i, 0).toString();
                int soLuong = Integer.parseInt(model.getValueAt(i, 3).toString());
                String giaNhap = model.getValueAt(i, 4).toString();
                String idNCC = model.getValueAt(i, 2).toString();
                String insertChiTietSql = "INSERT INTO chitietnhaphang (IDNhapHang,IDNCC, IDHangHoa, SoLuong, GiaNhap) VALUES (?, ?,?, ?, ?)";

                pstmt.setString(1, maPhieuNhap);
                pstmt.setString(2, idNCC);
                pstmt.setString(3, maHangHoa);
                pstmt.setInt(4, soLuong);
                pstmt.setString(5, giaNhap);
                pstmt.executeUpdate();

            }

            conn.commit(); // Xác nhận giao dịch
            JOptionPane.showMessageDialog(this, "Phiếu nhập đã được thêm thành công!");
            clearFields(); // Xóa trường dữ liệu
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm phiếu nhập: " + ex.getMessage(), "Lỗi Cơ sở dữ liệu", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_ThemMoiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemPhieuNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GiaNhap;
    private javax.swing.JTextField MaNhaCungCap;
    private javax.swing.JTextField MaPhieuNhap;
    private javax.swing.JComboBox<String> MaSanPhamComboBox;
    private javax.swing.JButton NutThemSanPham;
    private javax.swing.JSpinner SoLuong;
    private javax.swing.JTextField TenSanPham;
    private javax.swing.JButton ThemMoi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void LoadSanPham() {
        MaSanPhamComboBox.removeAllItems();
        try {
            java.sql.Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "SELECT IDHangHoa, TenHangHoa FROM hanghoa";
            PreparedStatement statement = conn.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String item = resultSet.getInt("IDHangHoa") + "-" + resultSet.getString("TenHangHoa");
                MaSanPhamComboBox.addItem(item);
            }

            //
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(this, "Không thể lấy dữ liệu từ cơ sở dữ liệu.", "Lỗi Cơ sở dữ liệu", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void productSelected(java.awt.event.ActionEvent evt) {
        String selectedProduct = (String) MaSanPhamComboBox.getSelectedItem();
        if (selectedProduct != null) {
            String[] parts = selectedProduct.split("-");
            String IDHangHoa = parts[0];

            try {
                java.sql.Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                String query = "SELECT * FROM hanghoa WHERE IDHangHoa = ?";
                PreparedStatement statement = conn.prepareStatement(query);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    TenSanPham.setText(resultSet.getString("TenHangHoa"));

                    GiaNhap.setText(resultSet.getString("GiaNhap"));
                    MaNhaCungCap.setText(resultSet.getString("IDNCC"));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Không thể lấy dữ liệu sản phẩm.", "Lỗi Cơ sở dữ liệu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void addNewEntry(java.awt.event.ActionEvent evt) {
        String IDNhapHang = MaPhieuNhap.getText();
        String selectedProduct = (String) MaSanPhamComboBox.getSelectedItem();
        if (selectedProduct != null) {
            String[] parts = selectedProduct.split("-");
            String IDHangHoa = parts[0];
            String TenSanPham = parts[1];
            String IDNCC = MaNhaCungCap.getText();
            String giaNhap = GiaNhap.getText();
            int soLuong = (Integer) SoLuong.getValue();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{IDHangHoa, TenSanPham, IDNCC, soLuong, giaNhap});

            insertIntoDatabase(IDNhapHang, IDHangHoa, giaNhap, soLuong, IDNCC);
        }
    }

    private void clearFields() {
        MaPhieuNhap.setText("");
        MaSanPhamComboBox.setSelectedIndex(0);
        TenSanPham.setText("");
        MaNhaCungCap.setText("");
        GiaNhap.setText("");
        SoLuong.setValue(0);
    }

    private void insertIntoDatabase(String IDNhapHang, String IDHangHoa, String giaNhap, int soLuong, String MaNhaCungCap) {
        try {
            java.sql.Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "INSERT INTO ChiTietPhieuNhap (IDPhieuNhap, IDHangHoa, SoLuong, GiaNhap,IDNCC) VALUES (?, ?, ?, ?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, IDNhapHang);
            pstmt.setString(2, IDHangHoa);
            pstmt.setInt(3, soLuong);
            pstmt.setString(4, giaNhap);
            pstmt.setString(5, MaNhaCungCap);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Không thể thêm dữ liệu vào cơ sở dữ liệu.", "Lỗi Cơ sở dữ liệu", JOptionPane.ERROR_MESSAGE);
        }
    }
}
