package project.pbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class leaderBoard extends javax.swing.JFrame {
    
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public leaderBoard(String Username) {
        initComponents();
        refreshTable(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLeader = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LEADERBOARD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 0));
        btnBack.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 90, 30));

        tblLeader.setBackground(new java.awt.Color(255, 204, 255));
        tblLeader.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        tblLeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Skor"
            }
        ));
        jScrollPane1.setViewportView(tblLeader);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 410, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/leaderboard.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 450, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menuExam me = new menuExam("");
        me.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leaderBoard("").setVisible(true);
            }
        });
    }
    
     public void refreshTable(){
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("Username");
        model.addColumn("Correct");
        model.addColumn("Wrong");
        model.addColumn("Score");
        tblLeader.setModel(model);
        try{
            this.stat = k.getConnection().prepareStatement("select * from tbpengguna order by skor desc limit 10");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data = {
                    rs.getString("username"),
                    rs.getString("benar"),
                    rs.getString("salah"),
                    rs.getInt("skor"),    
                };
                model.addRow(data);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLeader;
    // End of variables declaration//GEN-END:variables
}
