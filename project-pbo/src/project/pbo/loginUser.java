package project.pbo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class loginUser extends javax.swing.JFrame {

    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    private examMode examMode; 
    public static String login;
    
    public loginUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbCreate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("YOUR USERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        txtUsername.setBackground(new java.awt.Color(255, 204, 255));
        txtUsername.setFont(new java.awt.Font("RetroPix", 0, 14)); // NOI18N
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 160, 40));

        btnEnter.setBackground(new java.awt.Color(255, 255, 0));
        btnEnter.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.setBorder(null);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        jLabel3.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Don't have username? ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 204, -1, -1));

        lbCreate.setFont(new java.awt.Font("RetroPix", 0, 12)); // NOI18N
        lbCreate.setForeground(new java.awt.Color(255, 255, 0));
        lbCreate.setText("Create now");
        lbCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreateMouseClicked(evt);
            }
        });
        getContentPane().add(lbCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 204, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/Pilihan Exam .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String inputUsername = txtUsername.getText();
        try {
            if (inputUsername.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username cannot be empty!");
                return;
            }
            
            this.stat = k.getConnection().prepareStatement("select username from tbpengguna where username = ?");
            this.stat.setString(1, inputUsername);
            this.rs = this.stat.executeQuery();

            if (rs.next()) {
                String user = rs.getString("username");
                JOptionPane.showMessageDialog(this, "Login successful, welcome " + user);
                login = user; 
                menu menu = new menu(login);
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_btnEnterActionPerformed

    private void lbCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateMouseClicked
       pengguna pengguna = new pengguna(); 
       pengguna.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_lbCreateMouseClicked

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbCreate;
    public static javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
