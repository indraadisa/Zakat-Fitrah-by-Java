package tampilan;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class menu extends javax.swing.JFrame {
  private int waktu = 0;
  
    public menu() {
        initComponents();
        Jam();
        /*Dimension sc = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frame = getSize();
        setLocation(
                (sc.width = frame.width)/2,
                (sc.height = frame.height)/2
        );*/
        
    }
    private void Jam(){
        new Thread(){
            @Override
            public void run(){
                while(waktu == 0){
                    Calendar kalender = new GregorianCalendar();
                    int jam = kalender.get(Calendar.HOUR);
                    int menit = kalender.get(Calendar.MINUTE);
                    int detik = kalender.get(Calendar.SECOND);
                    int ampm = kalender.get(Calendar.AM_PM);
                    String Siang_Malam;
                    if(ampm ==1){
                        Siang_Malam = "PM";
                    }else{
                        Siang_Malam = "AM";
                    }
                    String Jam = jam+" : "+menit+" : "+detik+" "+Siang_Malam;
                    lb_jam.setText(Jam);
                }
            }
        }.start();
    }
    /*public void jam(){
        try{
            Statement st = conn.createStatement();
            String sql = "SELECT CURTIME();";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            jam.setText(SimpleDateFormat.DATE_FIELD);
        }
    }catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }*/
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_input_data = new javax.swing.JLabel();
        lb_data_masuk = new javax.swing.JLabel();
        lb_input_mastahik = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_jam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Menu Zakat Fitrah");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 67, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/keluar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(216, 243, 220));
        jLabel3.setText("Menu Zakat Fitrah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(576, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(146, 146, 146)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(23, 23, 23)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 120));

        jPanel2.setBackground(new java.awt.Color(45, 106, 79));

        lb_input_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tambah.png"))); // NOI18N
        lb_input_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_input_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_input_dataMouseClicked(evt);
            }
        });

        lb_data_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/data_masuk.png"))); // NOI18N
        lb_data_masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_data_masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_data_masukMouseClicked(evt);
            }
        });

        lb_input_mastahik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/data_mustahik.png"))); // NOI18N
        lb_input_mastahik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_input_mastahik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_input_mastahikMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(216, 243, 220));
        jLabel5.setText("Input Data Muzaki");

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(216, 243, 220));
        jLabel6.setText("Data Masuk Muzaki");

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(216, 243, 220));
        jLabel7.setText("Input Data Mustahik");

        lb_jam.setFont(new java.awt.Font("Technology", 0, 18)); // NOI18N
        lb_jam.setForeground(new java.awt.Color(216, 243, 220));
        lb_jam.setText("Menu Zakat Fitrah");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_input_data)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_jam)
                            .addComponent(lb_data_masuk))
                        .addGap(31, 31, 31)
                        .addComponent(lb_input_mastahik)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_jam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_data_masuk)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_input_data)
                            .addComponent(lb_input_mastahik))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 640, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_input_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_input_dataMouseClicked
        this.dispose();
        new menu_pilihan().setVisible(true);
    }//GEN-LAST:event_lb_input_dataMouseClicked

    private void lb_data_masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_data_masukMouseClicked
        this.dispose();
        new info_data_masuk().setVisible(true);
    }//GEN-LAST:event_lb_data_masukMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        new form_login().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lb_input_mastahikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_input_mastahikMouseClicked
        this.dispose();
      try {
          new data_mustahik().setVisible(true);
      } catch (SQLException ex) {
          Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_lb_input_mastahikMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    /*public void jam(){
        Thread
}*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_data_masuk;
    private javax.swing.JLabel lb_input_data;
    private javax.swing.JLabel lb_input_mastahik;
    private javax.swing.JLabel lb_jam;
    // End of variables declaration//GEN-END:variables
}
