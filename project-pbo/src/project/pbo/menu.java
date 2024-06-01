package project.pbo;

public class menu extends javax.swing.JFrame {
    
    private String username;
    
    public menu(String username) {
        this.username = username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnPractice = new javax.swing.JButton();
        btnExam = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT OPTIONS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        btnPractice.setBackground(new java.awt.Color(236, 177, 255));
        btnPractice.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnPractice.setText("PRACTICE MODE");
        btnPractice.setBorder(null);
        btnPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 170, 50));

        btnExam.setBackground(new java.awt.Color(236, 177, 255));
        btnExam.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnExam.setText("EXAM MODE");
        btnExam.setBorder(null);
        btnExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamActionPerformed(evt);
            }
        });
        getContentPane().add(btnExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, 50));

        btnExit.setBackground(new java.awt.Color(236, 177, 255));
        btnExit.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnExit.setText("BACK");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/Pilihan Exam .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 450, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamActionPerformed
        menuExam me = new menuExam(username);
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExamActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        play play = new play();
        play.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPracticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPracticeActionPerformed
        menuPractice mp = new menuPractice();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPracticeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExam;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPractice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
