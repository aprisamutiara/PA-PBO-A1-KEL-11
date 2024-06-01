package project.pbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class pengguna extends javax.swing.JFrame {

    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    String username;
    int benar = 0;
    int salah = 0; 
    int skor = 0;
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public pengguna() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE USERNAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        txtUser.setBackground(new java.awt.Color(236, 177, 255));
        txtUser.setFont(new java.awt.Font("RetroPix", 0, 14)); // NOI18N
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 160, 40));

        btnSend.setBackground(new java.awt.Color(255, 255, 0));
        btnSend.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnSend.setText("Send");
        btnSend.setBorder(null);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/Pilihan Exam .png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try{ 
            username = txtUser.getText();
            if (username.isEmpty()){
                JOptionPane.showMessageDialog(null, "Username cannot be empty!");
                return;
            }

            this.stat = k.getConnection().prepareStatement("SELECT COUNT(*) FROM tbpengguna WHERE username = ?");
            stat.setString(1, username);
            rs = stat.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Username already exists, use another username!");
                return;
            }
            
            this.stat = k.getConnection().prepareStatement("insert into tbpengguna (username, benar, salah, skor) VALUES (?, ?, ?, ?)");
            stat.setString(1, username);
            stat.setInt(2, benar);
            stat.setInt(3, salah);
            stat.setInt(4, skor);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Username added successfully");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        loginUser lu = new loginUser();
        lu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSendActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
