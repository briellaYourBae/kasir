/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toko;

import java.awt.Point;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author smart user
 */
public class DataBarang extends javax.swing.JFrame {

    private ResultSet rs;
    private Statement stat;
    private Connection con;
//    private String stok;
//    private String harga;
//    private String nmbarang;
//    private String kdbarang;
    Database db = new Database();

    /**
     * Creates new form DataBarang
     */
    public DataBarang() {
        initComponents();
        FullScreen();
        SetDataBarang();
        TblBrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBrgMouseClicked(evt);
            }
        });
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_kodeBarang = new javax.swing.JTextField();
        txt_namaBarang = new javax.swing.JTextField();
        txt_hargaBarang = new javax.swing.JTextField();
        txt_keterangan = new javax.swing.JTextField();
        txt_stokBarang = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        buttonUpdate = new java.awt.Button();
        buttonDelete = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblBrg = new javax.swing.JTable();
        btn_cari = new javax.swing.JButton();
        txt_cari = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setMaximumSize(new java.awt.Dimension(99999999, 99999999));

        jPanel2.setBackground(java.awt.Color.black);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("DATA BARANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.black);

        jlabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(255, 0, 255));
        jlabel2.setText("Kode Barang :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("Nama Barang :");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("Harga Barang :");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("Keterangan :");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("Stok :");

        txt_kodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodeBarangActionPerformed(evt);
            }
        });

        txt_hargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaBarangActionPerformed(evt);
            }
        });

        button1.setActionCommand("Add"); // NOI18N
        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setForeground(new java.awt.Color(255, 0, 255));
        button1.setLabel("Add");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setActionCommand("Kembali"); // NOI18N
        button2.setBackground(new java.awt.Color(0, 0, 0));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button2.setForeground(new java.awt.Color(255, 0, 255));
        button2.setLabel("Kembali");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        buttonUpdate.setBackground(new java.awt.Color(0, 0, 0));
        buttonUpdate.setForeground(new java.awt.Color(255, 0, 255));
        buttonUpdate.setLabel("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setActionCommand("Delete");
        buttonDelete.setBackground(new java.awt.Color(0, 0, 0));
        buttonDelete.setForeground(new java.awt.Color(255, 0, 255));
        buttonDelete.setLabel("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_stokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jlabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_kodeBarang)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 468, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2)
                    .addComponent(txt_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_stokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.Color.black);

        TblBrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode barang", "nama barang", "harga barang", "keterangan", "stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblBrg);
        if (TblBrg.getColumnModel().getColumnCount() > 0) {
            TblBrg.getColumnModel().getColumn(0).setResizable(false);
            TblBrg.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(97, 97, 97))
        );

        btn_cari.setText("cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        txt_cari.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_cari)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cari)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        String kodebarang = txt_kodeBarang.getText();
        String namabarang = txt_namaBarang.getText();
        String hargabarang = txt_hargaBarang.getText();
        String keterangan = txt_keterangan.getText();
        String stok = txt_stokBarang.getText();
        String query = "INSERT INTO barang (kode_barang, nama_barang, harga_barang, keterangan, stok) VALUES('" + kodebarang + "', '" + namabarang + "', '" + hargabarang + "', '" + keterangan + "','" + stok + "');";
        Database db = new Database();
        db.Query(query);
        db.AddData();
        
        loadData();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        AdminHome.main(null);
        dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void txt_kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodeBarangActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "UPDATE barang "
                    + "SET nama_barang=?, stok=?, harga_barang=?, keterangan=? "
                    + "WHERE kode_barang=?";
            con = Config.configDB();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, txt_namaBarang.getText());
            preparedStatement.setString(2, txt_stokBarang.getText());
            preparedStatement.setString(3, txt_hargaBarang.getText());
            preparedStatement.setString(4, txt_keterangan.getText());
            preparedStatement.setString(5, txt_kodeBarang.getText());

            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubahhhh!");

            loadData();
            kosong();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_buttonUpdateActionPerformed
    private void loadData() {
        DefaultTableModel tableModel = new DefaultTableModel();
        //utk memuat judul kolom tabel
        tableModel.addColumn("KODE");
        tableModel.addColumn("NAMA");
        tableModel.addColumn("HARGA");
        tableModel.addColumn("KETERANGAN");
        tableModel.addColumn("STOK");
        try {
            String sql = "SELECT * FROM barang";
            con = Config.configDB();
            stat = con.createStatement();
            ResultSet results = stat.executeQuery(sql);

            while (results.next()) {
                tableModel.addRow(new String[]{
                    results.getString("kode_barang"),
                    results.getString("nama_barang"),
                    results.getString("harga_barang"),
                    results.getString("keterangan"),
                    results.getString("stok"),});
            }
            TblBrg.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "EROR" + e.getMessage());
        }
    }

    private void kosong() {
        txt_namaBarang.setText(null);
        txt_stokBarang.setText(null);
        txt_hargaBarang.setText(null);
        txt_keterangan.setText(null);
        txt_kodeBarang.setText(null);
    }
    private void txt_hargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaBarangActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM barang WHERE kode_barang=?";
            con = Config.configDB();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, txt_kodeBarang.getText());
            preparedStatement.execute();

            loadData();
            kosong();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error: " + err.getMessage());
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        String keyword = txt_cari.getText().toLowerCase();
        
        DefaultTableModel model = (DefaultTableModel) TblBrg.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        TblBrg.setRowSorter(sorter);
        
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword));
    }//GEN-LAST:event_btn_cariActionPerformed

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
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBarang().setVisible(true);
            }
        });
    }

    private void FullScreen() {
        getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        pack();
        setResizable(false);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Point p = new Point(0, 0);
                SwingUtilities.convertPointToScreen(p, getContentPane());
                Point l = getLocation();
                l.x -= p.x;
                l.y -= p.y;
                setLocation(l);
            }
        });
    }

    private void SetDataBarang() {
//        Database db = new Database();
        String query = "SELECT * FROM barang";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
//            JOptionPane.showMessageDialog(null, rs.getString("email"));
            // Get database connection
            conn = Config.configDB();
            if (conn == null) {
                throw new SQLException("Unable to connect to the database.");
            }
            // Create a statement
            stmt = conn.createStatement();

            // Execute query
            rs = stmt.executeQuery(query);
            if (rs == null) {
                throw new SQLException("Failed to retrieve data from the database.");
            }

            // Get table model
            DefaultTableModel tbModel = (DefaultTableModel) TblBrg.getModel();

            // Clear existing rows (if any)
            tbModel.setRowCount(0);
            while (rs.next()) {
//                String kode_barang = String.valueOf(rs.getInt("kode_barang"));
                String kode_barang = rs.getString("kode_barang");
                String nama_barang = rs.getString("nama_barang");
                String harga_barang = rs.getString("harga_barang");
                String keterangan = rs.getString("keterangan");
                String stok = rs.getString("stok");

                String tbData[] = {kode_barang, nama_barang, harga_barang, keterangan, stok};
                tbModel = (DefaultTableModel) TblBrg.getModel();

                tbModel.addRow(tbData);
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void TblBrgMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int selectedRow = TblBrg.getSelectedRow();
        if (selectedRow != -1) {
            String id_barang = TblBrg.getValueAt(selectedRow, 0).toString();
            String nama_barang = TblBrg.getValueAt(selectedRow, 1).toString();
            String harga_barang = TblBrg.getValueAt(selectedRow, 2).toString();
            String keterangan = TblBrg.getValueAt(selectedRow, 3).toString();
            String stokk = TblBrg.getValueAt(selectedRow, 4).toString();

            txt_kodeBarang.setText(id_barang);
            txt_namaBarang.setText(nama_barang);
            txt_hargaBarang.setText(harga_barang);
            txt_stokBarang.setText(stokk);
            txt_keterangan.setText(keterangan);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblBrg;
    private javax.swing.JButton btn_cari;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button buttonDelete;
    private java.awt.Button buttonUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel2;
    private java.awt.TextField txt_cari;
    private javax.swing.JTextField txt_hargaBarang;
    private javax.swing.JTextField txt_keterangan;
    private javax.swing.JTextField txt_kodeBarang;
    private javax.swing.JTextField txt_namaBarang;
    private javax.swing.JTextField txt_stokBarang;
    // End of variables declaration//GEN-END:variables
}