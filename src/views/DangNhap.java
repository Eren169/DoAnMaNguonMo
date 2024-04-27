/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author dangt
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MatKhau = new javax.swing.JPasswordField();
        TenDangNhap = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NutDangNhap = new javax.swing.JButton();
        NutChuySangTranngDangKy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP");

        MatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatKhauActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tên Đăng Nhập");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mật Khẩu");

        NutDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NutDangNhap.setText("Đăng Nhập");
        NutDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutDangNhapActionPerformed(evt);
            }
        });

        NutChuySangTranngDangKy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NutChuySangTranngDangKy.setText("Đăng Ký");
        NutChuySangTranngDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutChuySangTranngDangKyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(MatKhau)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NutDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NutChuySangTranngDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NutDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NutChuySangTranngDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatKhauActionPerformed

    private void NutDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutDangNhapActionPerformed
        // TODO add your handling code here:
        String IDnhanvien = TenDangNhap.getText();
        String Password = new String(MatKhau.getPassword());

        // Kiểm tra thông tin đăng nhập
        if (validateLogin(IDnhanvien, Password)) {
            // Nếu đúng, hiển thị trang chủ và ẩn cửa sổ đăng nhập

            new TrangChu().setVisible(true);
            this.setVisible(false);
        } else {
            // Nếu sai, hiển thị thông báo lỗi
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng kiểm tra lại tên đăng nhập và mật khẩu.");
        }
    }//GEN-LAST:event_NutDangNhapActionPerformed

    private void NutChuySangTranngDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutChuySangTranngDangKyActionPerformed
        // TODO add your handling code here:

        // Chuyển sang trang đăng ký
        new DangKy().setVisible(true);

        // Ẩn cửa sổ hiện tại (cửa sổ đăng nhập)
        this.setVisible(false);

    }//GEN-LAST:event_NutChuySangTranngDangKyActionPerformed


    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField MatKhau;
    private javax.swing.JButton NutChuySangTranngDangKy;
    private javax.swing.JButton NutDangNhap;
    private javax.swing.JFormattedTextField TenDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private boolean validateLogin(String IDnhanvien, String Password) {
        try {
        // Kết nối đến cơ sở dữ liệu MySQL
        var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlikho", "root", "");

        // Chuẩn bị truy vấn SQL
        String sql = "SELECT * FROM nhanvien WHERE IDnhanvien=? AND Password=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, IDnhanvien);
        statement.setString(2, Password);

        // Thực hiện truy vấn
        ResultSet resultSet = statement.executeQuery();

        // Kiểm tra xem kết quả truy vấn có dòng dữ liệu nào không
        if (resultSet.next()) {
            // Nếu có, đăng nhập thành công
            return true;
        } else {
            // Nếu không, đăng nhập thất bại
            return false;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu!");
        return false;
    }
    }
}
