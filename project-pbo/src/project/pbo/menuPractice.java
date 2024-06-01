package project.pbo;

public class menuPractice extends javax.swing.JFrame {

    public menuPractice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnEasy = new javax.swing.JButton();
        btnHard = new javax.swing.JButton();
        btnMiddle = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRACTICE MODE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        btnEasy.setBackground(new java.awt.Color(236, 177, 255));
        btnEasy.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnEasy.setText("EASY");
        btnEasy.setBorder(null);
        btnEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEasyActionPerformed(evt);
            }
        });
        getContentPane().add(btnEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, 50));

        btnHard.setBackground(new java.awt.Color(236, 177, 255));
        btnHard.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnHard.setText("HARD");
        btnHard.setBorder(null);
        btnHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardActionPerformed(evt);
            }
        });
        getContentPane().add(btnHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 130, 50));

        btnMiddle.setBackground(new java.awt.Color(236, 177, 255));
        btnMiddle.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnMiddle.setText("MIDDLE");
        btnMiddle.setBorder(null);
        btnMiddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiddleActionPerformed(evt);
            }
        });
        getContentPane().add(btnMiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 130, 50));

        btnBack.setBackground(new java.awt.Color(236, 177, 255));
        btnBack.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/Pilihan Exam .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardActionPerformed
        Hard hard = new Hard();
        hard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menu menu = new menu("");
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEasyActionPerformed
        easy easy = new easy();
        easy.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEasyActionPerformed

    private void btnMiddleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiddleActionPerformed
        middle md = new middle();
        md.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMiddleActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPractice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEasy;
    private javax.swing.JButton btnHard;
    private javax.swing.JButton btnMiddle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
