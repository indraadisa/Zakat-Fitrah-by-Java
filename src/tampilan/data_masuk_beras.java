package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import java.io.File;
import java.io.InputStream;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ASUS
 */
public class data_masuk_beras extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();

    /**
     * Creates new form data_masuk_beras
     */
    public data_masuk_beras() throws SQLException {
        initComponents();
        tanggal();
        autoNumber();
        Locale locale = new Locale("id","ID");
        Locale.setDefault(locale);
    }
    
    private void autoNumber() throws SQLException
    {
        String noNota = "ZKT000";
        int i = 0;
        try{
            Statement st = conn.createStatement();
            String sql = "select kd_zkt from tb_zkt";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                noNota = rs.getString("kd_zkt");
            }
            noNota = noNota.substring(4);
            i = Integer.parseInt(noNota)+1;
            noNota = "00" +i;
            noNota = "ZKT" + noNota.substring(noNota.length()-3);
            txt_kode.setText(noNota);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
}
    
    public void tanggal()
    {
        Date ys=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd - MM - yyyy");
    }
    
    protected void kosong(){
        txt_nama.setText("");
        txt_info.setText("");
        txt_jumlah.setText("");
        txt_total.setText("");
    }
    
    protected void kosong_info(){
        txt_info.setText("");
    }


    @SuppressWarnings("unchecked")
    double beras = 0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_judul = new javax.swing.JLabel();
        lb_satuan = new javax.swing.JLabel();
        lb_uang = new javax.swing.JLabel();
        lb_back = new javax.swing.JLabel();
        lb_angka = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_tanggal = new javax.swing.JLabel();
        txt_tanggal = new com.toedter.calendar.JDateChooser();
        lb_nama = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        lb_jumlah = new javax.swing.JLabel();
        txt_jumlah = new javax.swing.JTextField();
        lb_total = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_info = new javax.swing.JTextArea();
        btn_cetak = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        lb_kode = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zakat Beras");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 67, 50));

        lb_judul.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        lb_judul.setForeground(new java.awt.Color(216, 243, 220));
        lb_judul.setText("Input Data Muzaki");

        lb_satuan.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_satuan.setForeground(new java.awt.Color(216, 243, 220));
        lb_satuan.setText("Liter");

        lb_uang.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_uang.setForeground(new java.awt.Color(216, 243, 220));
        lb_uang.setText("Zakat Beras");

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_rev1.png"))); // NOI18N
        lb_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_backMouseClicked(evt);
            }
        });

        lb_angka.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_angka.setForeground(new java.awt.Color(216, 243, 220));
        lb_angka.setText("3,5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lb_back)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lb_uang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_angka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_satuan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lb_judul)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_back)
                    .addComponent(lb_judul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_uang)
                    .addComponent(lb_angka)
                    .addComponent(lb_satuan))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 130));

        jPanel2.setBackground(new java.awt.Color(64, 145, 108));

        lb_tanggal.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_tanggal.setForeground(new java.awt.Color(216, 243, 220));
        lb_tanggal.setText("Tanggal");

        lb_nama.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_nama.setForeground(new java.awt.Color(216, 243, 220));
        lb_nama.setText("Nama");

        lb_jumlah.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_jumlah.setForeground(new java.awt.Color(216, 243, 220));
        lb_jumlah.setText("Jumlah");

        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyReleased(evt);
            }
        });

        lb_total.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_total.setForeground(new java.awt.Color(216, 243, 220));
        lb_total.setText("Total");

        txt_info.setColumns(20);
        txt_info.setRows(5);
        jScrollPane1.setViewportView(txt_info);

        btn_cetak.setBackground(new java.awt.Color(183, 228, 199));
        btn_cetak.setFont(new java.awt.Font("Swis721 Hv BT", 0, 11)); // NOI18N
        btn_cetak.setForeground(new java.awt.Color(8, 28, 21));
        btn_cetak.setText("Cetak Bukti");
        btn_cetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(183, 228, 199));
        btn_simpan.setFont(new java.awt.Font("Swis721 Hv BT", 0, 11)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(8, 28, 21));
        btn_simpan.setText("Simpan");
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        lb_kode.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lb_kode.setForeground(new java.awt.Color(216, 243, 220));
        lb_kode.setText("Kode Zakat");

        txt_kode.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_nama)
                            .addComponent(lb_tanggal)
                            .addComponent(lb_jumlah)
                            .addComponent(lb_total)
                            .addComponent(lb_kode))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nama)
                            .addComponent(txt_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_jumlah, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_kode)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_cetak)
                        .addGap(54, 54, 54)
                        .addComponent(btn_simpan)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kode)
                    .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_tanggal)
                    .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nama)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_jumlah)
                    .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_total)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cetak)
                    .addComponent(btn_simpan))
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 570, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_backMouseClicked
        this.dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_lb_backMouseClicked

    private void txt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyReleased
        // TODO add your handling code here:
        double beras;
        beras = Double.parseDouble(txt_jumlah.getText())* 3.5;
        txt_total.setText(String.valueOf(beras));
    }//GEN-LAST:event_txt_jumlahKeyReleased

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String sql = "insert into tb_zkt values (?,?,?,?,?,?,?)";
        String sql1 = "SELECT kd_zkt FROM tb_zkt ORDER BY kd_zkt DESC LIMIT 1";
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");

        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,txt_kode.getText());
            stat.setString(2,tanggal.format(txt_tanggal.getDate()));
            stat.setString(3,txt_nama.getText());
            stat.setString(4,txt_jumlah.getText());
            double beras;
            stat.setString(5,lb_uang.getText());
            beras = Double.parseDouble(txt_jumlah.getText())* 3.5;
            stat.setString(6,String.valueOf(beras));
            stat.setString(7,lb_satuan.getText());

            stat.executeUpdate();
            //lb_nama1.setText("Berhasil Disimpan");
            JOptionPane.showMessageDialog(null,"Data Berhasil di simpan");
            txt_nama.requestFocus();
        }catch(SQLException e){
            //lb_nama1.setText("Gagal Menyimpan");
            JOptionPane.showMessageDialog(null,"Data Tidak di simpan"+e);
        }
        
        try {
            autoNumber();
        } catch (SQLException ex) {
            Logger.getLogger(data_masuk_uang.class.getName()).log(Level.SEVERE, null, ex);
        }

        txt_info.setText("Zakat Atas Nama : "+txt_nama.getText()+
            "\nJumlah Anggota Keluarga : " +txt_jumlah.getText()+ " Orang" +
            "\nMenggunakan : "+lb_uang.getText()+
            "\nDengan Total : "+txt_total.getText()+ " Liter");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        try{
            InputStream file = getClass().getResourceAsStream("/ireport/bayar_beras.jasper");
                    JasperPrint jp = JasperFillManager.fillReport(file, null, conn);
                    JasperViewer jv = new JasperViewer(jp,false);
                    jv.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        kosong();
        kosong_info();
    }//GEN-LAST:event_btn_cetakActionPerformed

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
            java.util.logging.Logger.getLogger(data_masuk_beras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_masuk_beras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_masuk_beras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_masuk_beras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new data_masuk_beras().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(data_masuk_beras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_angka;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_judul;
    private javax.swing.JLabel lb_jumlah;
    private javax.swing.JLabel lb_kode;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_satuan;
    private javax.swing.JLabel lb_tanggal;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_uang;
    private javax.swing.JTextArea txt_info;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    private com.toedter.calendar.JDateChooser txt_tanggal;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
