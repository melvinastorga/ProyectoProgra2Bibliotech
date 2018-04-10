/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfece;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Melvin
 */
public class Main_Interfeces extends javax.swing.JFrame {

    /**
     * Creates new form Book_Interfeces
     */
    public Main_Interfeces() {
        initComponents();
        this.setTitle("BiblioTech Melvin-Josue");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Fondo = new javax.swing.JLabel();
        MenuBarBiblioTech = new javax.swing.JMenuBar();
        menuBook = new javax.swing.JMenu();
        menuAddBook = new javax.swing.JMenuItem();
        menu_ModifyDeleteBook = new javax.swing.JMenuItem();
        menuAudioVisual = new javax.swing.JMenu();
        menuAddAudioVisual = new javax.swing.JMenuItem();
        menuModifyDeleteAudioVisual = new javax.swing.JMenuItem();
        menuStudent = new javax.swing.JMenu();
        menuAddStudent = new javax.swing.JMenuItem();
        menuModifyDeleteStudent = new javax.swing.JMenuItem();
        menuLoan = new javax.swing.JMenu();
        menu_NewLoan = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_ReturnLoan = new javax.swing.JMenuItem();
        menuInformation = new javax.swing.JMenu();
        menu_TableBook = new javax.swing.JMenuItem();
        menu_TableAudioVisual = new javax.swing.JMenuItem();
        menu_TableStudentComputing = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_TableStudentEducation = new javax.swing.JMenuItem();
        menu_TableStudentAgronomy = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N

        MenuBarBiblioTech.setBackground(new java.awt.Color(0, 102, 51));
        MenuBarBiblioTech.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuBook.setForeground(new java.awt.Color(0, 0, 102));
        menuBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melvin\\Desktop\\biblioteca-1.png")); // NOI18N
        menuBook.setText("Book");
        menuBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuAddBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuAddBook.setForeground(new java.awt.Color(0, 0, 204));
        menuAddBook.setText("Add");
        menuAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddBookActionPerformed(evt);
            }
        });
        menuBook.add(menuAddBook);

        menu_ModifyDeleteBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_ModifyDeleteBook.setForeground(new java.awt.Color(51, 0, 204));
        menu_ModifyDeleteBook.setText("Modify & Delete");
        menu_ModifyDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ModifyDeleteBookActionPerformed(evt);
            }
        });
        menuBook.add(menu_ModifyDeleteBook);

        MenuBarBiblioTech.add(menuBook);

        menuAudioVisual.setForeground(new java.awt.Color(0, 0, 102));
        menuAudioVisual.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melvin\\Desktop\\contrasena.png")); // NOI18N
        menuAudioVisual.setText("  AudioVisual");
        menuAudioVisual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuAddAudioVisual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuAddAudioVisual.setForeground(new java.awt.Color(51, 0, 255));
        menuAddAudioVisual.setText("Add");
        menuAddAudioVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddAudioVisualActionPerformed(evt);
            }
        });
        menuAudioVisual.add(menuAddAudioVisual);

        menuModifyDeleteAudioVisual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuModifyDeleteAudioVisual.setForeground(new java.awt.Color(51, 0, 204));
        menuModifyDeleteAudioVisual.setText("Modify & Delete");
        menuModifyDeleteAudioVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModifyDeleteAudioVisualActionPerformed(evt);
            }
        });
        menuAudioVisual.add(menuModifyDeleteAudioVisual);

        MenuBarBiblioTech.add(menuAudioVisual);

        menuStudent.setForeground(new java.awt.Color(0, 0, 102));
        menuStudent.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melvin\\Desktop\\pensamiento.png")); // NOI18N
        menuStudent.setText("  Student");
        menuStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuAddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuAddStudent.setForeground(new java.awt.Color(0, 0, 204));
        menuAddStudent.setText("Add");
        menuAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddStudentActionPerformed(evt);
            }
        });
        menuStudent.add(menuAddStudent);

        menuModifyDeleteStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuModifyDeleteStudent.setForeground(new java.awt.Color(51, 0, 255));
        menuModifyDeleteStudent.setText("Modify & Delete");
        menuModifyDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModifyDeleteStudentActionPerformed(evt);
            }
        });
        menuStudent.add(menuModifyDeleteStudent);

        MenuBarBiblioTech.add(menuStudent);

        menuLoan.setBackground(new java.awt.Color(255, 0, 0));
        menuLoan.setForeground(new java.awt.Color(0, 0, 102));
        menuLoan.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melvin\\Desktop\\empleado.png")); // NOI18N
        menuLoan.setText("  Loan");
        menuLoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menu_NewLoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_NewLoan.setForeground(new java.awt.Color(51, 0, 204));
        menu_NewLoan.setText("Loan Book");
        menu_NewLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_NewLoanActionPerformed(evt);
            }
        });
        menuLoan.add(menu_NewLoan);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem1.setText("Loan AudioVisual");
        menuLoan.add(jMenuItem1);

        menu_ReturnLoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_ReturnLoan.setForeground(new java.awt.Color(0, 0, 204));
        menu_ReturnLoan.setText("Return Loan");
        menu_ReturnLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ReturnLoanActionPerformed(evt);
            }
        });
        menuLoan.add(menu_ReturnLoan);

        MenuBarBiblioTech.add(menuLoan);

        menuInformation.setForeground(new java.awt.Color(0, 0, 102));
        menuInformation.setText("  Information");
        menuInformation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menu_TableBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_TableBook.setForeground(new java.awt.Color(0, 0, 153));
        menu_TableBook.setText("Reports of Book");
        menu_TableBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_TableBookActionPerformed(evt);
            }
        });
        menuInformation.add(menu_TableBook);

        menu_TableAudioVisual.setBackground(new java.awt.Color(255, 255, 255));
        menu_TableAudioVisual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_TableAudioVisual.setForeground(new java.awt.Color(0, 0, 204));
        menu_TableAudioVisual.setText("Reports of AudioVisual");
        menu_TableAudioVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_TableAudioVisualActionPerformed(evt);
            }
        });
        menuInformation.add(menu_TableAudioVisual);

        menu_TableStudentComputing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_TableStudentComputing.setForeground(new java.awt.Color(0, 0, 204));
        menu_TableStudentComputing.setText("Reports of Student Computing");
        menu_TableStudentComputing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_TableStudentComputingActionPerformed(evt);
            }
        });
        menuInformation.add(menu_TableStudentComputing);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem2.setText("Report of Loan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuInformation.add(jMenuItem2);

        menu_TableStudentEducation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_TableStudentEducation.setForeground(new java.awt.Color(0, 0, 153));
        menu_TableStudentEducation.setText("Reports of Student Education");
        menu_TableStudentEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_TableStudentEducationActionPerformed(evt);
            }
        });
        menuInformation.add(menu_TableStudentEducation);

        menu_TableStudentAgronomy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_TableStudentAgronomy.setForeground(new java.awt.Color(0, 0, 153));
        menu_TableStudentAgronomy.setText("Reports of Student Agronomy");
        menu_TableStudentAgronomy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_TableStudentAgronomyActionPerformed(evt);
            }
        });
        menuInformation.add(menu_TableStudentAgronomy);

        MenuBarBiblioTech.add(menuInformation);

        setJMenuBar(MenuBarBiblioTech);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 993, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuModifyDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModifyDeleteStudentActionPerformed
        Modify_Student modifystudent = new Modify_Student();
        modifystudent.show();
        modifystudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuModifyDeleteStudentActionPerformed

    private void menu_NewLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_NewLoanActionPerformed

        Insert_LoanBook insertLoan = new Insert_LoanBook();
        insertLoan.show();
        insertLoan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_NewLoanActionPerformed

    private void menuAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddBookActionPerformed

        Insert_Book insertbook = new Insert_Book();
        insertbook.show();
        insertbook.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuAddBookActionPerformed

    private void menu_ModifyDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ModifyDeleteBookActionPerformed

        Modify_Delete_Book modifybook = new Modify_Delete_Book();
        modifybook.show();
        modifybook.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_ModifyDeleteBookActionPerformed

    private void menuAddAudioVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddAudioVisualActionPerformed

        Insert_AudioVisual insertaudiovisual = new Insert_AudioVisual();
        insertaudiovisual.show();
        insertaudiovisual.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuAddAudioVisualActionPerformed

    private void menuModifyDeleteAudioVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModifyDeleteAudioVisualActionPerformed

        Modify_AudioVisual modifyaudiovisual = new Modify_AudioVisual();
        modifyaudiovisual.show();
        modifyaudiovisual.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuModifyDeleteAudioVisualActionPerformed

    private void menuAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddStudentActionPerformed
        Insert_Student inserestudent = new Insert_Student();
        inserestudent.show();
        inserestudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuAddStudentActionPerformed

    private void menu_TableBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_TableBookActionPerformed
        Table_Books tablebook = new Table_Books();
        tablebook.show();
        tablebook.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_TableBookActionPerformed

    private void menu_TableAudioVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_TableAudioVisualActionPerformed
        Table_AudioVisual tableAudioVisual = new Table_AudioVisual();
        tableAudioVisual.show();
        tableAudioVisual.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_TableAudioVisualActionPerformed

    private void menu_TableStudentComputingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_TableStudentComputingActionPerformed
        try {
            Table_StudentComputing tableStudent = new Table_StudentComputing();
            tableStudent.show();
            tableStudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (IOException ex) {
            Logger.getLogger(Main_Interfeces.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menu_TableStudentComputingActionPerformed

    private void menu_ReturnLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ReturnLoanActionPerformed
        Return_Loan loanReturn = new Return_Loan();
        loanReturn.show();
        loanReturn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_ReturnLoanActionPerformed

    private void menu_TableStudentEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_TableStudentEducationActionPerformed
        Table_StudentEducation tableStudentEducation;

        try {
            tableStudentEducation = new Table_StudentEducation();
            tableStudentEducation.show();
            tableStudentEducation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (IOException ex) {
            Logger.getLogger(Main_Interfeces.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menu_TableStudentEducationActionPerformed

    private void menu_TableStudentAgronomyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_TableStudentAgronomyActionPerformed
        Table_StudentAgronomy tableStudentAgronomy;
        try {
            tableStudentAgronomy = new Table_StudentAgronomy();
            tableStudentAgronomy.show();
            tableStudentAgronomy.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (IOException ex) {
            Logger.getLogger(Main_Interfeces.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menu_TableStudentAgronomyActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Table_Loan tableLoan;
        try {
            tableLoan = new Table_Loan();
            tableLoan.show();
            tableLoan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (IOException ex) {
            Logger.getLogger(Main_Interfeces.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Interfeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Interfeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Interfeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Interfeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Interfeces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarBiblioTech;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JMenuItem menuAddAudioVisual;
    private javax.swing.JMenuItem menuAddBook;
    private javax.swing.JMenuItem menuAddStudent;
    private javax.swing.JMenu menuAudioVisual;
    private javax.swing.JMenu menuBook;
    private javax.swing.JMenu menuInformation;
    private javax.swing.JMenu menuLoan;
    private javax.swing.JMenuItem menuModifyDeleteAudioVisual;
    private javax.swing.JMenuItem menuModifyDeleteStudent;
    private javax.swing.JMenu menuStudent;
    private javax.swing.JMenuItem menu_ModifyDeleteBook;
    private javax.swing.JMenuItem menu_NewLoan;
    private javax.swing.JMenuItem menu_ReturnLoan;
    private javax.swing.JMenuItem menu_TableAudioVisual;
    private javax.swing.JMenuItem menu_TableBook;
    private javax.swing.JMenuItem menu_TableStudentAgronomy;
    private javax.swing.JMenuItem menu_TableStudentComputing;
    private javax.swing.JMenuItem menu_TableStudentEducation;
    // End of variables declaration//GEN-END:variables
}