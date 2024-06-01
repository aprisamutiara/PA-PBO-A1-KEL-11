package project.pbo;

import javax.swing.JOptionPane;

public class menuExam extends javax.swing.JFrame {
    
    private String username;
    private examMode examMode;
    
    public menuExam(String username) {
        this.username = username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EXAM MODE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(236, 177, 255));
        jButton1.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        jButton1.setText("START EXAM");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 50));

        jButton2.setBackground(new java.awt.Color(236, 177, 255));
        jButton2.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        jButton2.setText("LEADERBOARD");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, 50));

        jButton3.setBackground(new java.awt.Color(236, 177, 255));
        jButton3.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/Pilihan Exam .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 450, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        leaderBoard ld = new leaderBoard("");
        ld.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menu menu = new menu(username);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to start exam mode?", "Choose an option", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION){
            examMode em = new examMode(username);
            em.setVisible(true);
            this.setVisible(false);
        }else if (response == JOptionPane.NO_OPTION) {
            this.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuExam("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
