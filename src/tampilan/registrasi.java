package tampilan;
import java.sql.*;
import koneksi.koneksi;

/**
 *
 * @author ASUS
 */
public class registrasi extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();

    /**
     * Creates new form registrasi
     */
    public registrasi() {
        initComponents();
    }
    
    protected void aktif (){
        txt_nama.setEnabled(true);
        txt_username.setEnabled(true);
        txt_password.setEnabled(true);
        txt_alamat.setEnabled(true);
        txt_nama.requestFocus();
    }
    protected void kosong(){
        txt_nama.setText("");
        txt_username.setText("");
        txt_password.setText("");
        txt_alamat.setText("");
        
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
        lb_judul = new javax.swing.JLabel();
        lb_back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_nama = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_alamat = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        btn_simpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrasi Admin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(82, 183, 136));

        lb_judul.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lb_judul.setForeground(new java.awt.Color(216, 243, 220));
        lb_judul.setText("Registrasi Data Petugas Zakat Fitrah");

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_rev.png"))); // NOI18N
        lb_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_back)
                .addGap(70, 70, 70)
                .addComponent(lb_judul)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_judul)
                    .addComponent(lb_back))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 90));

        jPanel2.setBackground(new java.awt.Color(64, 145, 108));

        lb_nama.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_nama.setForeground(new java.awt.Color(216, 243, 220));
        lb_nama.setText("Nama");

        lb_username.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_username.setForeground(new java.awt.Color(216, 243, 220));
        lb_username.setText("Username");

        lb_password.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_password.setForeground(new java.awt.Color(216, 243, 220));
        lb_password.setText("Password");

        lb_alamat.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_alamat.setForeground(new java.awt.Color(216, 243, 220));
        lb_alamat.setText("Alamat");

        txt_nama.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(8, 28, 21));

        txt_username.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N

        txt_password.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        btn_simpan.setBackground(new java.awt.Color(183, 228, 199));
        btn_simpan.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(8, 28, 21));
        btn_simpan.setText("Simpan");
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_simpan)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lb_nama)
                            .addGap(42, 42, 42)
                            .addComponent(txt_nama))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_username)
                                .addComponent(lb_password)
                                .addComponent(lb_alamat))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_username)
                                .addComponent(txt_password)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nama)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_username)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_alamat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_simpan)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 560, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_backMouseClicked
        this.dispose();
        new form_login().setVisible(true);
    }//GEN-LAST:event_lb_backMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String sql = "insert into tb_user values (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,txt_nama.getText());
            stat.setString(2,txt_username.getText());
            stat.setString(3,txt_password.getText());
            stat.setString(4,txt_alamat.getText());
            
            stat.executeUpdate();
            kosong();
            txt_nama.requestFocus();
        }catch(SQLException e){
            }
        this.dispose();
        new form_login().setVisible(true);
    }//GEN-LAST:event_btn_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_simpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_alamat;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_judul;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_username;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
