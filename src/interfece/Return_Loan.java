/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfece;

import domain.Loan;
import file.Date_Methods;
import file.Loan_File;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melvin
 */
public class Return_Loan extends javax.swing.JFrame {

    Loan_File fileLoan;
    ArrayList<Loan> loanArray;
    Date_Methods metDates = new Date_Methods();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Date dateReturnMaterial;
    Date dateInitial;

    /**
     * Creates new form Return_Loan
     */
    public Return_Loan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ReturnLoan = new javax.swing.JLabel();
        lbl_CodeStudent = new javax.swing.JLabel();
        tft_CodeStudent = new javax.swing.JTextField();
        lbl_CodeMaterial = new javax.swing.JLabel();
        tft_CodeMaterial = new javax.swing.JTextField();
        btn_SeekLoan = new javax.swing.JButton();
        lbl_ReturnDate = new javax.swing.JLabel();
        lbl_showReturnDate = new javax.swing.JLabel();
        lbl_actualReturnDate = new javax.swing.JLabel();
        jdc_ReturnDate = new com.toedter.calendar.JDateChooser();
        lbl_Fine = new javax.swing.JLabel();
        lbl_ShowFine = new javax.swing.JLabel();
        btn_Fine = new javax.swing.JButton();
        btn_DeliveryMaterial = new javax.swing.JButton();
        lbl_message = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ReturnLoan.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lbl_ReturnLoan.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ReturnLoan.setText("Return Loan");
        getContentPane().add(lbl_ReturnLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 256, 29));

        lbl_CodeStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_CodeStudent.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CodeStudent.setText("Type the code of student to return");
        getContentPane().add(lbl_CodeStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 275, 33));

        tft_CodeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tft_CodeStudentActionPerformed(evt);
            }
        });
        getContentPane().add(tft_CodeStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 275, 31));

        lbl_CodeMaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_CodeMaterial.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CodeMaterial.setText("Type the code of the material to return");
        getContentPane().add(lbl_CodeMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, 300, 30));

        tft_CodeMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tft_CodeMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(tft_CodeMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 275, 30));

        btn_SeekLoan.setBackground(new java.awt.Color(0, 51, 51));
        btn_SeekLoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_SeekLoan.setForeground(new java.awt.Color(255, 255, 255));
        btn_SeekLoan.setText("SEEK LOAN");
        btn_SeekLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeekLoanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SeekLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 122, 39));

        lbl_ReturnDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ReturnDate.setText("Return Date:");
        getContentPane().add(lbl_ReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 337, 152, 31));

        lbl_showReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_showReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 339, 146, 30));

        lbl_actualReturnDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_actualReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualReturnDate.setText("Date of actual return");
        getContentPane().add(lbl_actualReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 387, 198, 31));
        getContentPane().add(jdc_ReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 436, 250, -1));

        lbl_Fine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Fine.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Fine.setText("THE STUDENT HAVE A FINE OF: ");
        getContentPane().add(lbl_Fine, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 529, 250, 33));

        lbl_ShowFine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ShowFine.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_ShowFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 573, 229, 32));

        btn_Fine.setBackground(new java.awt.Color(0, 51, 51));
        btn_Fine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Fine.setForeground(new java.awt.Color(255, 255, 255));
        btn_Fine.setText("Create Fine");
        btn_Fine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FineActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Fine, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 536, -1, -1));

        btn_DeliveryMaterial.setBackground(new java.awt.Color(0, 51, 51));
        btn_DeliveryMaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_DeliveryMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btn_DeliveryMaterial.setText("Delivery Material");
        getContentPane().add(btn_DeliveryMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 616, 171, -1));

        lbl_message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_message.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 644, 299, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tft_CodeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tft_CodeStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tft_CodeStudentActionPerformed

    private void tft_CodeMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tft_CodeMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tft_CodeMaterialActionPerformed

    private void btn_SeekLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeekLoanActionPerformed
        File file = new File("Loans.dat");
        try {
            fileLoan = new Loan_File(file);
            loanArray = fileLoan.getAllLoans();

            for (int i = 0; i < loanArray.size(); i++) {
                if (loanArray.get(i).getStudentCode().equalsIgnoreCase(tft_CodeStudent.getText())
                        && loanArray.get(i).getMaterialCode().equalsIgnoreCase(tft_CodeMaterial.getText())) {
//                    lbl_dateMustDeliver.setVisible(true);
//                    lbl_returnDate.setVisible(true);
//                    lbl_actualReturn.setVisible(true);
//                    jdc_dateReturn.setVisible(true);
//                    lbl_fine.setVisible(true);
//                    lbl_showFine.setVisible(true);
//                    btn_deliverMaterial.setVisible(true);
                    lbl_message.setText("");
                    lbl_showReturnDate.setText(loanArray.get(i).getReturnDate());
                    dateReturnMaterial = metDates.StringToDate(jdc_ReturnDate.getDateFormatString(), "dd-MM-yyyy");
                    dateInitial = metDates.StringToDate(loanArray.get(i).getDeliveryDate(), "dd-MM-yyyy");
                    System.out.println(" ENTRO AQUII");
                    break;
                } else {
                    lbl_message.setText("The loan could not be found!");
                }
            }
        } catch (IOException ex) {
            lbl_message.setText("Error reading the file!");
        }

    }//GEN-LAST:event_btn_SeekLoanActionPerformed

    private void btn_FineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FineActionPerformed

        System.out.println(" ENTRO AQUII*2");
        System.out.println(dateInitial.toString());
        System.out.println(dateReturnMaterial.toString());
        int countDays;
        try {
            sdf.format(dateReturnMaterial);
            sdf.format(dateInitial);
            countDays = metDates.dateDifferent(dateReturnMaterial, dateInitial);
            if (countDays > 7) {
                System.out.println(" ENTRO AQUII*3");
                int fine = (countDays - 7) * 100;
                lbl_ShowFine.setText(fine + "");
            }

        } catch (ParseException ex) {
            Logger.getLogger(Return_Loan.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_FineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Return_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return_Loan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DeliveryMaterial;
    private javax.swing.JButton btn_Fine;
    private javax.swing.JButton btn_SeekLoan;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jdc_ReturnDate;
    private javax.swing.JLabel lbl_CodeMaterial;
    private javax.swing.JLabel lbl_CodeStudent;
    private javax.swing.JLabel lbl_Fine;
    private javax.swing.JLabel lbl_ReturnDate;
    private javax.swing.JLabel lbl_ReturnLoan;
    private javax.swing.JLabel lbl_ShowFine;
    private javax.swing.JLabel lbl_actualReturnDate;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JLabel lbl_showReturnDate;
    private javax.swing.JTextField tft_CodeMaterial;
    private javax.swing.JTextField tft_CodeStudent;
    // End of variables declaration//GEN-END:variables
}
