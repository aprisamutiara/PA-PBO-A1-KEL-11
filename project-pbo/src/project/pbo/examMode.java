package project.pbo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class examMode extends javax.swing.JFrame {
    
    private exam exam; 
    private String username;
    private Timer timer;
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    
    public examMode(String username){
        initComponents();
        this.username = username;
//        lbUser.setText(username);
        displayUsername(); 
        exam = new exam(0, 0, 0, 0, 0, 0, 0, 0, 0);
        generateNewQuestion();
        waktu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSoal1 = new javax.swing.JLabel();
        lbOp = new javax.swing.JLabel();
        lbSoal2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCek = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtJawab = new javax.swing.JTextField();
        lbTime = new javax.swing.JLabel();
        lbSkor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbBenar = new javax.swing.JLabel();
        lbSalah = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSoal1.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        lbSoal1.setText("45");
        getContentPane().add(lbSoal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        lbOp.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        lbOp.setText("+");
        getContentPane().add(lbOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 30));

        lbSoal2.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        lbSoal2.setText("45");
        getContentPane().add(lbSoal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 50));

        jLabel5.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        jLabel5.setText("=");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, 20));

        btnCek.setBackground(new java.awt.Color(255, 255, 0));
        btnCek.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnCek.setText("Cek");
        btnCek.setBorder(null);
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        getContentPane().add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 70, 30));

        btnBack.setBackground(new java.awt.Color(255, 255, 0));
        btnBack.setFont(new java.awt.Font("RetroPix", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, 30));

        txtJawab.setBackground(new java.awt.Color(255, 204, 255));
        txtJawab.setFont(new java.awt.Font("RetroPix", 1, 48)); // NOI18N
        getContentPane().add(txtJawab, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 90, 60));

        lbTime.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        getContentPane().add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 161, -1, 20));

        lbSkor.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        lbSkor.setText("0");
        getContentPane().add(lbSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 112, -1, 20));

        lbUser.setFont(new java.awt.Font("RetroPix", 1, 12)); // NOI18N
        lbUser.setText("Aprisa");
        getContentPane().add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel2.setText("B : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 112, 30, -1));

        lbBenar.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        lbBenar.setText("0");
        getContentPane().add(lbBenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 112, -1, -1));

        lbSalah.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        lbSalah.setText("0");
        getContentPane().add(lbSalah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 112, -1, -1));

        jLabel6.setFont(new java.awt.Font("RetroPix", 1, 18)); // NOI18N
        jLabel6.setText("S :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 112, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pbo/Soal Exam.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        saveResultsToDatabase(); 
        menuExam me = new menuExam(username);
        me.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        data();
    }//GEN-LAST:event_btnCekActionPerformed
    
    private void generateNewQuestion() {
        int num1 = exam.generateRandomNumber();
        int num2 = exam.generateRandomNumber();
        lbSoal1.setText(String.valueOf(num1));
        lbSoal2.setText(String.valueOf(num2));  
        txtJawab.setText("");
    }

    public void waktu(){
        exam.startTime = System.currentTimeMillis();
        exam.endTime = exam.startTime + 60000; 
        timer = new Timer(0000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                long currentTime = System.currentTimeMillis();
                long remainingTime = exam.endTime - currentTime;
                if (remainingTime <= 0) {
                    timer.stop();
                    lbTime.setText("0s");
                    JOptionPane.showMessageDialog(null, "Time's up!");
                    txtJawab.setEnabled(false);
                    btnCek.setEnabled(false);
                    saveResultsToDatabase(); 
                } else {
                    lbTime.setText(remainingTime / 1000 + "s");
                }  
            }
        });
        timer.start();
    }
    
    public void data(){
       try {
            exam.num1 = Integer.parseInt(lbSoal1.getText());
            exam.num2 = Integer.parseInt(lbSoal2.getText());
            exam.answer = Integer.parseInt(txtJawab.getText());

            if (exam.checkAnswer(exam.getNum1(), exam.getNum2(), exam.getAnswer())){
                exam.setCorrectAnswers(exam.getCorrectAnswers() + 1);
                lbBenar.setText(String.valueOf(exam.correctAnswers));
                
                exam.setScore(exam.getScore() + 10); 
                lbSkor.setText(String.valueOf(exam.score));
                JOptionPane.showMessageDialog(this, "Correct!");
            } else {
                exam.setWrongAnswers(exam.getWrongAnswers() + 1);
                lbSalah.setText(String.valueOf(exam.WrongAnswers));
                
                exam.setScore(exam.getScore() - 2); 
                lbSkor.setText(String.valueOf(exam.score));
                
                JOptionPane.showMessageDialog(this, "Wrong answer!");
            }
            generateNewQuestion();
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
       }
    }
    
    private void displayUsername() {
        String username = loginUser.login;
        if (username != null) {
            lbUser.setText(username);
        } else {
            JOptionPane.showMessageDialog(this, "No user logged in!");
        }
    }
    
    private void saveResultsToDatabase() {
        try {
            String query = "UPDATE tbpengguna SET skor = ?, benar = ?, salah = ? WHERE username = ?";
            stat = k.getConnection().prepareStatement(query);
            stat.setInt(1, exam.getScore());
            stat.setInt(2, exam.getCorrectAnswers());
            stat.setInt(3, exam.getWrongAnswers());
            stat.setString(4, username);

            stat.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saving results: " + e.getMessage());
        }
    }

    public static void main(String args[]) {

       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new examMode("DefaultUser").setVisible(true);
           }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbBenar;
    private javax.swing.JLabel lbOp;
    private javax.swing.JLabel lbSalah;
    private javax.swing.JLabel lbSkor;
    private javax.swing.JLabel lbSoal1;
    private javax.swing.JLabel lbSoal2;
    private javax.swing.JLabel lbTime;
    public static final javax.swing.JLabel lbUser = new javax.swing.JLabel();
    private javax.swing.JTextField txtJawab;
    // End of variables declaration//GEN-END:variables
}
