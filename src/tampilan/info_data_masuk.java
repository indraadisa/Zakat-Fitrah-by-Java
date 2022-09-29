package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import java.io.File;
import java.io.InputStream;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ASUS
 */
public class info_data_masuk extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    private String sql;

    /**
     * Creates new form info_data_masuk
     */
    public info_data_masuk()  
    {
        initComponents();
        tanggal();
        datatable();
        tampilTotalberas();
        tampilTotaluang();
        tampiltransaksizakatfitrah();
        tampiltransaksizakatfitrahberas();
        tampiltransaksizakatfitrahuang();
        tampiljumlahbayar();
        tampiltotalzakatuang();
        tampiljumlahseluruhbayarberas();
        kode();
    }
    
    public void tampiltransaksizakatfitrahberas(){
        try{
            Statement st = conn.createStatement();
            String sql = "SELECT COUNT(jenis) FROM tb_zkt WHERE jenis = \"Zakat Beras\"";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
             lb_transaksi_beras.setText(Integer.toString(rs.getInt(1)));
        }
    }catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }
    
    public void tampiljumlahbayar(){
        try{
            Statement st = conn.createStatement();
            String sql = "SELECT SUM(jumlah) FROM tb_zkt";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                lb_jumlah_total.setText(Integer.toString(rs.getInt(1)));
            }
        }catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public void tampiljumlahseluruhbayarberas(){
        try{
            Statement st = conn.createStatement();
            String sql = "SELECT SUM(jumlah) FROM tb_zkt WHERE jenis = \"Zakat Beras\"";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                lb_jumlah_beras.setText(Integer.toString(rs.getInt(1)));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void kode(){
        try{
            Statement st = conn.createStatement();
            String sql = "Select kd_zkt from tb_zkt ORDER by kd_zkt DESC limit 1";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                lb_jumlah_total1.setText(String.valueOf(rs.getString(1)));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void tampiltransaksizakatfitrahuang(){
     try {
         Statement st = conn.createStatement();
         String sql = "SELECT COUNT(jenis) FROM tb_zkt WHERE jenis = \"Zakat Uang\"";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             lb_transaksi_uang.setText(Integer.toString(rs.getInt(1)));
         }
     } catch (SQLException ex) {
         System.out.println(ex.getMessage());
     }
    }
    
    public void tampiltotalzakatuang(){
     try{
         Statement st = conn.createStatement();
         String sql = "SELECT SUM(jumlah) FROM tb_zkt WHERE jenis = \"Zakat Uang\"";
         ResultSet rs = st.executeQuery(sql);
         while (rs.next()){
             lb_jumlah_uang.setText(Integer.toString(rs.getInt(1)));
         }
     }catch (SQLException ex) {
         System.out.println(ex.getMessage());
     }
    }
    
    public void tampilTotalberas(){
     try {
         Statement st = conn.createStatement();
         String sql = "SELECT SUM(total) FROM tb_zkt WHERE jenis = \"Zakat Beras\"";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             txt_total_beras.setText(Double.toString(rs.getDouble(1)));
         }
     } catch (SQLException ex) {
         System.out.println(ex.getMessage());;
     }
    }
    
    public void tampiltransaksizakatfitrah(){
     try {
         Statement st = conn.createStatement();
         String sql = "SELECT COUNT(jenis) FROM tb_zkt";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             lb_ttl_transaksi.setText(Integer.toString(rs.getInt(1)));
         }
     } catch (SQLException ex) {
         System.out.println(ex.getMessage());;
     }
    }
    
    public void tampilTotaluang(){
     try {
         Statement st = conn.createStatement();
         String sql = "SELECT SUM(total) FROM tb_zkt WHERE jenis = \"Zakat Uang\"";
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             txt_total_uang.setText(Integer.toString(rs.getInt(1)));
         }
     } catch (SQLException ex) {
         System.out.println(ex.getMessage());;
     }
    }
    
    public void tanggal()
    {
        Date ys=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd - MM - yyyy");
    }
     
    
    
        protected void datatable(){
        Object [] data = {"Kode Zakat","Tanggal","Nama Muzaki","Jenis Zakat","Anggota Keluarga","Total"};
        tabmode = new DefaultTableModel(null,data);
        data_masuk.setModel(tabmode);
        String sql = "select * from tb_zkt";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet dataa = stat.executeQuery(sql);
            while(dataa.next()){
                String a = dataa.getString("kd_zkt");
                String b = dataa.getString("tgl");
                String c = dataa.getString("nama");
                String d = dataa.getString("jenis");
                String e = dataa.getString("jumlah");
                String f = dataa.getString("total");
                
                String[] getData = {a,b,c,d,e,f};
                tabmode.addRow(getData);
                tampilTotalberas();
                tampilTotaluang();
                tampiltransaksizakatfitrah();
                tampiltransaksizakatfitrahuang();
                tampiltransaksizakatfitrahberas();
                tampiljumlahbayar();
                tampiltotalzakatuang();
                tampiljumlahseluruhbayarberas();
                }
            } catch (SQLException ex){
                    JOptionPane.showMessageDialog(null,"Error di"+ex);
            }
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
        data_masuk = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txt_total1 = new javax.swing.JLabel();
        txt_total3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lb_ttl_transaksi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_transaksi_beras = new javax.swing.JLabel();
        lb_transaksi_uang = new javax.swing.JLabel();
        txt_total6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lb_jumlah_total = new javax.swing.JLabel();
        lb_jumlah_beras = new javax.swing.JLabel();
        lb_jumlah_uang = new javax.swing.JLabel();
        txt_total5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txt_total_uang = new javax.swing.JLabel();
        txt_total4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txt_total_beras = new javax.swing.JLabel();
        txt_total2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lb_jumlah_total1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Info Zakat Fitrah");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(149, 213, 178));

        data_masuk.setBackground(new java.awt.Color(45, 106, 79));
        data_masuk.setFont(new java.awt.Font("Swis721 Lt BT", 0, 11)); // NOI18N
        data_masuk.setForeground(new java.awt.Color(216, 243, 220));
        data_masuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Zakat", "Nama Muzaki", "Jenis Zakat", "Anggota Keluarga", "Total"
            }
        ));
        data_masuk.setSelectionForeground(new java.awt.Color(216, 243, 220));
        jScrollPane1.setViewportView(data_masuk);

        jButton3.setBackground(new java.awt.Color(183, 228, 199));
        jButton3.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(8, 28, 21));
        jButton3.setText("Cetak Semua Data Zakat Fitrah");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_total1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 11)); // NOI18N
        txt_total1.setForeground(new java.awt.Color(8, 28, 21));
        txt_total1.setText("Total Zakat Beras Sementara");

        txt_total3.setFont(new java.awt.Font("Swis721 Blk BT", 0, 11)); // NOI18N
        txt_total3.setForeground(new java.awt.Color(8, 28, 21));
        txt_total3.setText("Total Zakat Uang Sementara");

        jPanel4.setBackground(new java.awt.Color(183, 228, 199));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(105, 108));

        jPanel5.setBackground(new java.awt.Color(82, 183, 136));

        lb_ttl_transaksi.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lb_ttl_transaksi.setText("ddd");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lb_ttl_transaksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_ttl_transaksi)
                .addGap(31, 31, 31))
        );

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel3.setText("Beras :");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel4.setText("Uang :");

        lb_transaksi_beras.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lb_transaksi_beras.setText("Beras :");

        lb_transaksi_uang.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lb_transaksi_uang.setText("Beras :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_transaksi_beras))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_transaksi_uang)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_transaksi_beras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_transaksi_uang))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        txt_total6.setFont(new java.awt.Font("Swis721 Blk BT", 0, 11)); // NOI18N
        txt_total6.setForeground(new java.awt.Color(8, 28, 21));
        txt_total6.setText("Jumlah Muzaki");

        jPanel6.setBackground(new java.awt.Color(183, 228, 199));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setPreferredSize(new java.awt.Dimension(105, 108));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel5.setText("Beras :");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel6.setText("Uang :");

        jPanel7.setBackground(new java.awt.Color(82, 183, 136));
        jPanel7.setPreferredSize(new java.awt.Dimension(73, 59));

        lb_jumlah_total.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lb_jumlah_total.setText("00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_jumlah_total, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_jumlah_total, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lb_jumlah_beras.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lb_jumlah_beras.setText("Beras :");

        lb_jumlah_uang.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lb_jumlah_uang.setText("Beras :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lb_jumlah_beras))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_jumlah_uang)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lb_jumlah_uang)))
                    .addComponent(lb_jumlah_beras))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txt_total5.setFont(new java.awt.Font("Swis721 Blk BT", 0, 11)); // NOI18N
        txt_total5.setForeground(new java.awt.Color(8, 28, 21));
        txt_total5.setText("Jumlah Transaksi Zakat");

        jPanel2.setBackground(new java.awt.Color(183, 228, 199));

        jPanel8.setBackground(new java.awt.Color(82, 183, 136));
        jPanel8.setPreferredSize(new java.awt.Dimension(73, 59));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        txt_total_uang.setFont(new java.awt.Font("Swis721 Blk BT", 0, 11)); // NOI18N
        txt_total_uang.setForeground(new java.awt.Color(8, 28, 21));
        txt_total_uang.setText("ddd");

        txt_total4.setFont(new java.awt.Font("Swis721 Blk BT", 0, 11)); // NOI18N
        txt_total4.setForeground(new java.awt.Color(8, 28, 21));
        txt_total4.setText("Rupiah");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_total_uang)
                    .addComponent(txt_total4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_total_uang)
                .addGap(11, 11, 11)
                .addComponent(txt_total4)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(183, 228, 199));

        jPanel11.setBackground(new java.awt.Color(82, 183, 136));
        jPanel11.setPreferredSize(new java.awt.Dimension(73, 59));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        txt_total_beras.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12)); // NOI18N
        txt_total_beras.setForeground(new java.awt.Color(8, 28, 21));
        txt_total_beras.setText("ddd");

        txt_total2.setFont(new java.awt.Font("Swis721 Blk BT", 0, 11)); // NOI18N
        txt_total2.setForeground(new java.awt.Color(8, 28, 21));
        txt_total2.setText("Liter");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_total2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total_beras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_total_beras)
                .addGap(18, 18, 18)
                .addComponent(txt_total2)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(183, 228, 199));
        jButton4.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(8, 28, 21));
        jButton4.setText("Cetak Data Zakat Beras");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(183, 228, 199));
        jButton5.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(8, 28, 21));
        jButton5.setText("Cetak Data Zakat Uang");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(183, 228, 199));
        jButton6.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(8, 28, 21));
        jButton6.setText("Menu Utama");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lb_jumlah_total1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lb_jumlah_total1.setForeground(new java.awt.Color(149, 213, 178));
        lb_jumlah_total1.setText("00");

        jButton7.setBackground(new java.awt.Color(183, 228, 199));
        jButton7.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(8, 28, 21));
        jButton7.setText("Segarkan");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_total5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(txt_total6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(txt_total1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txt_total3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(lb_jumlah_total1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_jumlah_total1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(28, 28, 28)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total5)
                    .addComponent(txt_total6)
                    .addComponent(txt_total1)
                    .addComponent(txt_total3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            InputStream file = getClass().getResourceAsStream("/ireport/info_zakat_semua.jasper");
                    JasperPrint jp = JasperFillManager.fillReport(file, null, conn);
                    JasperViewer jv = new JasperViewer(jp,false);
                    jv.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            InputStream file = getClass().getResourceAsStream("/ireport/info_zakat_beras.jasper");
                    JasperPrint jp = JasperFillManager.fillReport(file, null, conn);
                    JasperViewer jv = new JasperViewer(jp,false);
                    jv.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            InputStream file = getClass().getResourceAsStream("/ireport/info_zakat_uang.jasper");
                    JasperPrint jp = JasperFillManager.fillReport(file, null, conn);
                    JasperViewer jv = new JasperViewer(jp,false);
                    jv.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    try{
            String sql ="update tb_info_semua set transaksi_semua=?,transaksi_beras=?,transaksi_uang=?,masuk_semua=?,masuk_beras=?,masuk_uang=?,total_beras=?,total_uang=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,lb_ttl_transaksi.getText());
            stat.setString(2,lb_transaksi_beras.getText());
            stat.setString(3,lb_transaksi_uang.getText());
            stat.setString(4,lb_jumlah_total.getText());
            stat.setString(5,lb_jumlah_beras.getText());
            stat.setString(6,lb_jumlah_uang.getText());
            stat.setString(7,txt_total_beras.getText());
            stat.setString(8,txt_total_uang.getText());
            
            stat.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null,"Data Gagal Di Ubah"+e);
        }
    
    try{
            String sql ="update tb_info_beras set jenis=?, transaksi_beras=?,masuk_beras=?,total_beras=? where jenis =\"Zakat Beras\"";
            String id = "Zakat Beras";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,id);
            stat.setString(2,lb_transaksi_beras.getText());
            stat.setString(3,lb_jumlah_beras.getText());
            stat.setString(4,txt_total_beras.getText());
            
            stat.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null,"Data Gagal Di Ubah"+e);
        }
    
    try{
            String sql ="update tb_info_uang set jenis=?, transaksi_uang=?,masuk_uang=?,total_uang=? where jenis =\"Zakat Uang\"";
            String id = "Zakat Uang";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,id);
            stat.setString(2,lb_transaksi_uang.getText());
            stat.setString(3,lb_jumlah_uang.getText());
            stat.setString(4,txt_total_uang.getText());
            
            stat.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null,"Data Gagal Di Ubah"+e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(info_data_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(info_data_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(info_data_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(info_data_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info_data_masuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data_masuk;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_jumlah_beras;
    private javax.swing.JLabel lb_jumlah_total;
    private javax.swing.JLabel lb_jumlah_total1;
    private javax.swing.JLabel lb_jumlah_uang;
    private javax.swing.JLabel lb_transaksi_beras;
    private javax.swing.JLabel lb_transaksi_uang;
    private javax.swing.JLabel lb_ttl_transaksi;
    private javax.swing.JLabel txt_total1;
    private javax.swing.JLabel txt_total2;
    private javax.swing.JLabel txt_total3;
    private javax.swing.JLabel txt_total4;
    private javax.swing.JLabel txt_total5;
    private javax.swing.JLabel txt_total6;
    private javax.swing.JLabel txt_total_beras;
    private javax.swing.JLabel txt_total_uang;
    // End of variables declaration//GEN-END:variables
}
