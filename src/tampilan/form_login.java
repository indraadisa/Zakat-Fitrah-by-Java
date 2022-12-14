package tampilan;
import java.awt.Color;
import java.sql.*;
import koneksi.koneksi;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class form_login extends javax.swing.JFrame {
    private final Connection conn = new koneksi().connect();
    PreparedStatement ps = null;
    ResultSet res = null;

    /**
     * Creates new form form_login
     */
    public form_login() {
        initComponents();
        addPlaceHolder(txt_user);
        addPlaceHolder(txt_pass);
        //empty();
    }
    public void addPlaceHolder(JTextField textfield){
        Font font = textfield.getFont();
        font = font.deriveFont(Font.PLAIN);
        textfield.setFont(font);
        textfield.setForeground(new Color(8,28,21));
    }
    
    public void removePlaceHolder(JTextField textfield){
        Font font = textfield.getFont();
        font = font.deriveFont(Font.PLAIN);
        textfield.setFont(font);
        textfield.setForeground(new Color(8,28,21));
    }
    /**protected void empty(){
    txt_user.setText("");
    txt_pass.setText("");
}*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_1 = new javax.swing.JPanel();
        judul_login = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        btn_regis = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        notif = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lb_judul_apk = new javax.swing.JLabel();
        lb_judul_apk1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Login");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_1.setBackground(new java.awt.Color(45, 106, 79));

        judul_login.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        judul_login.setForeground(new java.awt.Color(216, 243, 220));
        judul_login.setText("Form Login");

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_rev.png"))); // NOI18N

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock_rev.png"))); // NOI18N

        txt_user.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txt_user.setForeground(new java.awt.Color(8, 28, 21));
        txt_user.setText("Username");
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userFocusLost(evt);
            }
        });

        txt_pass.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(8, 28, 21));
        txt_pass.setText("Password");
        txt_pass.setEchoChar('\u0000');
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passFocusLost(evt);
            }
        });

        btn_regis.setBackground(new java.awt.Color(183, 228, 199));
        btn_regis.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        btn_regis.setForeground(new java.awt.Color(8, 28, 21));
        btn_regis.setText("Register");
        btn_regis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regisActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(183, 228, 199));
        btn_login.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        btn_login.setForeground(new java.awt.Color(8, 28, 21));
        btn_login.setText("Login");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        notif.setForeground(new java.awt.Color(216, 243, 220));

        javax.swing.GroupLayout bg_1Layout = new javax.swing.GroupLayout(bg_1);
        bg_1.setLayout(bg_1Layout);
        bg_1Layout.setHorizontalGroup(
            bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_1Layout.createSequentialGroup()
                .addGroup(bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(judul_login, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bg_1Layout.createSequentialGroup()
                                .addComponent(logo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bg_1Layout.createSequentialGroup()
                                .addComponent(logo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(notif)
                                    .addGroup(bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bg_1Layout.createSequentialGroup()
                                            .addComponent(btn_regis)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_login))
                                        .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        bg_1Layout.setVerticalGroup(
            bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(judul_login)
                .addGap(45, 45, 45)
                .addGroup(bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo1)
                    .addGroup(bg_1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo2))
                    .addGroup(bg_1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_regis)
                    .addComponent(btn_login))
                .addGap(42, 42, 42)
                .addComponent(notif)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(bg_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 350));

        jPanel2.setBackground(new java.awt.Color(116, 198, 157));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N

        lb_judul_apk.setFont(new java.awt.Font("Kozuka Mincho Pro L", 0, 14)); // NOI18N
        lb_judul_apk.setForeground(new java.awt.Color(8, 28, 21));
        lb_judul_apk.setText("Musollah Nurul Huda");

        lb_judul_apk1.setFont(new java.awt.Font("Kozuka Mincho Pro L", 0, 24)); // NOI18N
        lb_judul_apk1.setForeground(new java.awt.Color(8, 28, 21));
        lb_judul_apk1.setText("Aplikasi Zakat Fitrah");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_judul_apk, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_judul_apk1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(lb_judul_apk1)
                .addGap(11, 11, 11)
                .addComponent(lb_judul_apk)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 380, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String sql = "SELECT username FROM tb_user WHERE username ='"+txt_user.getText()+"' AND password ='"+txt_pass.getText()+"'";
        try{
            ps = conn.prepareStatement(sql);
            res = ps.executeQuery();
            while(res.next()){
                String username = res.getString("username");
            }
            res.last();
            if(txt_user.getText().equals("")||txt_pass.getText().equals(""))
            {
               notif.setText("Username atau Password Tidak Boleh Kosong");
            }
            else if(res.getRow()==1)
            {
                this.dispose();
                new menu().show();
            }
            else
            {
                notif.setText("Username atau Password Salah ");
                txt_user.requestFocus();
                txt_pass.requestFocus();
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regisActionPerformed
        this.dispose();
        new registrasi().setVisible(true);
    }//GEN-LAST:event_btn_regisActionPerformed

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        if(txt_user.getText().equals("Username")){
            txt_user.setText(null);
            txt_user.requestFocus();
            removePlaceHolder(txt_user);
        }
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        if(txt_pass.getText().equals("Password")){
            txt_pass.setText(null);
            txt_pass.requestFocus();
            txt_pass.setEchoChar('*');
            removePlaceHolder(txt_pass);
        }
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusLost
        if(txt_user.getText().length()==0){
            addPlaceHolder(txt_user);
            txt_user.setText("Username");
        }
    }//GEN-LAST:event_txt_userFocusLost

    private void txt_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusLost
        if(txt_pass.getText().length()==0){
            addPlaceHolder(txt_pass);
            txt_pass.setText("Password");
            //txt_pass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txt_passFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_1;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_regis;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judul_login;
    private javax.swing.JLabel lb_judul_apk;
    private javax.swing.JLabel lb_judul_apk1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel notif;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
