package project.pbo;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Hard extends javax.swing.JFrame {
    
    private practice practice;
    private int questionCount = 0;
    
    public Hard(){
        practice = new practice(0, 0, 0, 0, 0, 0, 0);
        initComponents(); 
        generateNewQuestion(); 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCek = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbBenar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbSalah = new javax.swing.JLabel();
        lbsoal1 = new javax.swing.JLabel();
        lbOp = new javax.swing.JLabel();
        lbsoal2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtjawab = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(452, 341));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCek.setBackground(new java.awt.Color(255, 255, 0));
        btnCek.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnCek.setText("Cek");
        btnCek.setBorder(null);
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        getContentPane().add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 70, 30));

        btnBack.setBackground(new java.awt.Color(255, 255, 0));
        btnBack.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 30));

        jLabel2.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel2.setText("B : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 30, -1));

        lbBenar.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        lbBenar.setText("0");
        getContentPane().add(lbBenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel6.setText("S :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        lbSalah.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        lbSalah.setText("0");
        getContentPane().add(lbSalah, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        lbsoal1.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        lbsoal1.setText("67");
        getContentPane().add(lbsoal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 175, -1, -1));

        lbOp.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        lbOp.setText("+");
        getContentPane().add(lbOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 185, -1, 30));

        lbsoal2.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        lbsoal2.setText("56");
        getContentPane().add(lbsoal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, -1, 50));

        jLabel5.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        jLabel5.setText("=");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 20));

        txtjawab.setBackground(new java.awt.Color(255, 204, 255));
        txtjawab.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        getContentPane().add(txtjawab, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 90, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/Soal.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        data();
    }//GEN-LAST:event_btnCekActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menuPractice mp = new menuPractice();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed
                                      
 private void generateNewQuestion() {
        int num1 = practice.generateRandomNumbereasy();
        int num2 = practice.generateRandomNumbereasy();
        lbsoal1.setText(String.valueOf(num1));
        lbsoal2.setText(String.valueOf(num2));  
        txtjawab.setText("");
    }
     public void data(){
       try {
            practice.num1 = Integer.parseInt(lbsoal1.getText());
            practice.num2 = Integer.parseInt(lbsoal2.getText());
            practice.answer = Integer.parseInt(txtjawab.getText());

            if (practice.checkAnswer(practice.num1, practice.num2, practice.answer)){
                practice.setCorrectAnswers(practice.getCorrectAnswers() + 1);
                lbBenar.setText(String.valueOf(practice.correctAnswers));
                JOptionPane.showMessageDialog(this, "Correct!");
            } else {
                practice.setWrongAnswers(practice.getWrongAnswers() + 1);
                lbSalah.setText(String.valueOf(practice.WrongAnswers));
                JOptionPane.showMessageDialog(this, "Wrong answer!");
            }
            questionCount++;
            generateNewQuestion();
             if (questionCount >= 10) {
            JOptionPane.showMessageDialog(this, "You have completed 10 questions");
            btnCek.setEnabled(false); 
            }
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
       }
    }
    public boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbBenar;
    private javax.swing.JLabel lbOp;
    private javax.swing.JLabel lbSalah;
    private javax.swing.JLabel lbsoal1;
    private javax.swing.JLabel lbsoal2;
    private javax.swing.JTextField txtjawab;
    // End of variables declaration//GEN-END:variables
}
