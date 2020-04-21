package Arsip_dokumen;

import com.alee.laf.WebLookAndFeel;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author lilissonia
 */
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 0));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(372, 198));
        jPanel2.setPreferredSize(new java.awt.Dimension(372, 198));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 77, -1, -1));

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 23, 160, 30));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 340, 10));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 70, 160, 30));

        jPanel1.add(jPanel2, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        if(txtUsername.getText().isEmpty()){
            txtUsername.requestFocus();
        }else{
            prosesLogin();
        }
    
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        prosesLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        if(txtPassword.getPassword().length == 0){
            txtPassword.requestFocus();
        }else{
            prosesLogin();
        }
    }//GEN-LAST:event_txtUsernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            //new Login().setVisible(true);
            Login L = new Login();
            L.setExtendedState(Frame.MAXIMIZED_BOTH);
            L.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void prosesLogin() {
        String user = txtUsername.getText();
        char[] pass = txtPassword.getPassword();
        
        if(user.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username Harus Diisi");
            txtUsername.requestFocus();
        }else if(pass.length == 0){
            JOptionPane.showMessageDialog(this, "Password Harus Diisi");
            txtPassword.requestFocus();
        }else{
           String password = new String(pass);
           btnLogin.setEnabled(false);
            try {
                Connection c = Koneksi.MySQL();
                Statement st = c.createStatement();
                String q = "SELECT * FROM tb_admin " + "WHERE admin_username='"+user+"'" + "AND admin_password=MD5('"+password+"')";
                System.out.println(q);
                ResultSet rs = st.executeQuery(q);
                if(rs.next()){
                    Home h = new Home();
                    h.setExtendedState(Frame.MAXIMIZED_BOTH);
                    this.setVisible(false);
                    h.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Username/Password Salah!");
                    txtUsername.requestFocus();
                }
                    btnLogin.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }
}
