package Arsip_dokumen;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author lilissonia
 */
public class TambahData extends javax.swing.JPanel {
    String file = null;
    public TambahData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        txtTgl = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtKat = new javax.swing.JTextField();
        txtLok = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanggal");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Dokumen");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Dokumen");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kategori Dokumen");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lokasi Dokumen");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Deskripsi Dokumen");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 510, 10));

        btnBatal.setBackground(new java.awt.Color(204, 102, 0));
        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel2.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        btnSimpan.setBackground(new java.awt.Color(204, 102, 0));
        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        txtTgl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 230, -1));

        txtKode.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 230, -1));

        txtnama.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 230, -1));

        txtKat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtKat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 230, -1));

        txtLok.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtLok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 230, -1));

        txtDes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 230, -1));

        btnUpload.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 100, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(112, 112, 112, 112);
        jPanel1.add(jPanel2, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String kode = txtKode.getText();
        String nama = txtnama.getText();
        String kategori = txtKat.getText();
        String lok = txtLok.getText();
        String des = txtDes.getText();
        String tgl = txtTgl.getText();
        
        if(kode.isEmpty() || nama.isEmpty() || kategori.isEmpty() || lok.isEmpty() || des.isEmpty() || tgl.isEmpty()){
        JOptionPane.showMessageDialog(this, "Mohon Lengkapi Data!");
    }else{        
        
        String sql = "INSERT INTO data_arsip (kode_dokumen,nama_dokumen,kategori,"
                + "lokasi,deskripsi,tanggal)"
                + "VALUES (\""+kode+"\",\""+nama+"\","
                + "\""+kategori+"\",\""+lok+"\",\""+des+"\",\""+tgl+
                "\")";
        Connection con;
        Statement st;
        try {
            con = Koneksi.MySQL();
            st = con.createStatement();
            st.executeUpdate(sql);
            //st.close();
            //con.close();
            
           // st.execute(sql);
            JOptionPane.showMessageDialog(this, "Data telah disimpan!");
            Home.addComp(new Arsip_Dokumen());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
      }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
       Arsip_Dokumen d = new Arsip_Dokumen();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        file = f.getAbsolutePath();
        txtLok.setText(file);
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtKat;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtLok;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
