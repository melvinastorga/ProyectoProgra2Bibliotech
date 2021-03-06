package interfece;

import domain.Books;
import file.Books_File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Melvin
 */
public class Modify_Delete_Book extends javax.swing.JFrame {

    Books_File fileBook;
    ArrayList<Books> arrayBooks;

    public Modify_Delete_Book() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);
        this.setTitle("Modify a Book");
        lb_NameModifyBook.setVisible(false);
        lb_CodeModifyBook.setVisible(false);
        lb_AuthorModifyBook.setVisible(false);
        lb_YearModify.setVisible(false);
        lb_EditorialModifyBook.setVisible(false);
        lb_TypeModifyBook.setVisible(false);
        tft_Year.setVisible(false);
        tf_AuthorModifyBook.setVisible(false);
        tf_NameModifyBook.setVisible(false);
        cbx_Type.setVisible(false);
        btn_Modify.setVisible(false);
        btn_Delete.setVisible(false);
        tf_EditorialModifyBook.setVisible(false);
        btn_SeekOtherBook.setVisible(false);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_ModifyBook = new javax.swing.JLabel();
        lb_SeekModifyBook = new javax.swing.JLabel();
        tf_SeekModifyBook = new javax.swing.JTextField();
        btn_seekModifyBook = new javax.swing.JButton();
        lb_NameModifyBook = new javax.swing.JLabel();
        lb_CodeModifyBook = new javax.swing.JLabel();
        lb_AuthorModifyBook = new javax.swing.JLabel();
        lb_EditorialModifyBook = new javax.swing.JLabel();
        lb_TypeModifyBook = new javax.swing.JLabel();
        tf_NameModifyBook = new javax.swing.JTextField();
        tf_AuthorModifyBook = new javax.swing.JTextField();
        tf_EditorialModifyBook = new javax.swing.JTextField();
        btn_Modify = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        lb_YearModify = new javax.swing.JLabel();
        tft_Year = new javax.swing.JTextField();
        lbl_ShowCode = new javax.swing.JLabel();
        cbx_Type = new javax.swing.JCheckBox();
        btn_SeekOtherBook = new javax.swing.JButton();
        lbl_Message1 = new javax.swing.JLabel();
        lbl_Screen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_ModifyBook.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        lb_ModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_ModifyBook.setText("Modify or Delete Book");
        getContentPane().add(lb_ModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 21, 399, -1));

        lb_SeekModifyBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_SeekModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_SeekModifyBook.setText("Enter the name of the book to modify or Delete");
        getContentPane().add(lb_SeekModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 89, -1, -1));

        tf_SeekModifyBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_SeekModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 129, 323, 36));

        btn_seekModifyBook.setBackground(new java.awt.Color(0, 51, 51));
        btn_seekModifyBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_seekModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_seekModifyBook.setText("Seek");
        btn_seekModifyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seekModifyBookActionPerformed(evt);
            }
        });
        getContentPane().add(btn_seekModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 171, -1, 30));

        lb_NameModifyBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_NameModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_NameModifyBook.setText("Name");
        getContentPane().add(lb_NameModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 296, 48, -1));

        lb_CodeModifyBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_CodeModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_CodeModifyBook.setText("Code");
        getContentPane().add(lb_CodeModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 367, -1, -1));

        lb_AuthorModifyBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_AuthorModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_AuthorModifyBook.setText("Author");
        getContentPane().add(lb_AuthorModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 436, -1, -1));

        lb_EditorialModifyBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_EditorialModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_EditorialModifyBook.setText("Editorial");
        getContentPane().add(lb_EditorialModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 580, -1, -1));

        lb_TypeModifyBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_TypeModifyBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_TypeModifyBook.setText("Type");
        getContentPane().add(lb_TypeModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 669, -1, -1));

        tf_NameModifyBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_NameModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 292, 162, 28));

        tf_AuthorModifyBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_AuthorModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 432, 162, 28));

        tf_EditorialModifyBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_EditorialModifyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 576, 162, 28));

        btn_Modify.setBackground(new java.awt.Color(0, 51, 51));
        btn_Modify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Modify.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modify.setText("Modify");
        btn_Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 724, 104, 35));

        btn_Delete.setBackground(new java.awt.Color(0, 51, 51));
        btn_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 722, 104, 37));

        lb_YearModify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_YearModify.setForeground(new java.awt.Color(255, 255, 255));
        lb_YearModify.setText("Year");
        getContentPane().add(lb_YearModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 503, -1, -1));

        tft_Year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tft_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 503, 162, 28));

        lbl_ShowCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ShowCode.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_ShowCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 353, 162, 31));

        cbx_Type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbx_Type.setText("Digital");
        getContentPane().add(cbx_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 668, 162, -1));

        btn_SeekOtherBook.setBackground(new java.awt.Color(0, 51, 51));
        btn_SeekOtherBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_SeekOtherBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_SeekOtherBook.setText("Seek Other Book");
        btn_SeekOtherBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeekOtherBookActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SeekOtherBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 171, 200, 30));

        lbl_Message1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Message1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_Message1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 230, 323, 29));

        lbl_Screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        getContentPane().add(lbl_Screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Pregunta si existe el libro y llena los campos de texto
    private void btn_seekModifyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seekModifyBookActionPerformed
        lbl_Message1.setText("");
        fileBook = new Books_File();
        try {
            arrayBooks = fileBook.getArrayBooks();

            for (int i = 0; i < arrayBooks.size(); i++) {
                //Llena lo campos de texto con el valor del libro
                if (arrayBooks.get(i).getName().equalsIgnoreCase(tf_SeekModifyBook.getText())) {
                    lbl_Message1.setText("");
                    tf_NameModifyBook.setText(arrayBooks.get(i).getName());
                    tf_AuthorModifyBook.setText(arrayBooks.get(i).getAuthor());
                    lbl_ShowCode.setText(arrayBooks.get(i).getCode());
                    tf_EditorialModifyBook.setText(arrayBooks.get(i).getEditorial());
                    tft_Year.setText(arrayBooks.get(i).getYear());
                    if (arrayBooks.get(i).getType().equals("Digital")) {
                        cbx_Type.setSelected(true);
                    }

                    lb_NameModifyBook.setVisible(true);
                    lb_CodeModifyBook.setVisible(true);
                    lb_AuthorModifyBook.setVisible(true);
                    lb_YearModify.setVisible(true);
                    lb_EditorialModifyBook.setVisible(true);
                    lb_TypeModifyBook.setVisible(true);
                    tft_Year.setVisible(true);
                    tf_AuthorModifyBook.setVisible(true);
                    tf_NameModifyBook.setVisible(true);
                    cbx_Type.setVisible(true);
                    btn_Modify.setVisible(true);
                    btn_Delete.setVisible(true);
                    tf_EditorialModifyBook.setVisible(true);
                    tf_SeekModifyBook.setEnabled(false);
                    tf_SeekModifyBook.setEnabled(false);
                    btn_SeekOtherBook.setVisible(true);
                    btn_seekModifyBook.setEnabled(false);
                    break;

                } else {
                    lbl_Message1.setText("The book does not exist");
                }
            }

        } catch (FileNotFoundException ex) {
            lbl_Message1.setText("Error reading the file");
        }
    }//GEN-LAST:event_btn_seekModifyBookActionPerformed

    //Modifica un registro de libros
    private void btn_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifyActionPerformed
        if (!tf_NameModifyBook.getText().equalsIgnoreCase("") && !tf_AuthorModifyBook.getText().equalsIgnoreCase("")
                && !tft_Year.getText().equalsIgnoreCase("") && !tf_EditorialModifyBook.getText().equalsIgnoreCase("")) {
            fileBook = new Books_File();
            boolean flag = true;
            for (int i = 0; i < arrayBooks.size(); i++) {
                //pregunta si el libro existe en el array
                if (!arrayBooks.get(i).getName().equalsIgnoreCase(tf_SeekModifyBook.getText())) {
                    if (flag) {
                        fileBook.writeBooks(arrayBooks.get(i), false);
                        flag = false;
                    } else {
                        fileBook.writeBooks(arrayBooks.get(i), true);
                    }
                } else {
                    String type = "Physical";
                    if (cbx_Type.isSelected()) {
                        type = "Digital";
                    }
                    Books bookModify = new Books(tf_AuthorModifyBook.getText(), tf_EditorialModifyBook.getText(), tf_NameModifyBook.getText(),
                            lbl_ShowCode.getText(), tft_Year.getText(), type);
                    lbl_Message1.setText("The book was modify");
                    if (flag) {
                        fileBook.writeBooks(bookModify, false);
                        flag = false;
                    } else {
                        fileBook.writeBooks(bookModify, true);
                    }
                }
            }
            //Invisibiliza los componentes
            lb_NameModifyBook.setVisible(false);
            lb_CodeModifyBook.setVisible(false);
            lb_AuthorModifyBook.setVisible(false);
            lb_YearModify.setVisible(false);
            lb_EditorialModifyBook.setVisible(false);
            lb_TypeModifyBook.setVisible(false);
            tft_Year.setVisible(false);
            tf_AuthorModifyBook.setVisible(false);
            tf_NameModifyBook.setVisible(false);
            cbx_Type.setVisible(false);
            btn_Modify.setVisible(false);
            btn_Delete.setVisible(false);
            tf_EditorialModifyBook.setVisible(false);
            btn_SeekOtherBook.setVisible(false);
            lbl_ShowCode.setText("");
            tf_SeekModifyBook.setEnabled(true);
            btn_seekModifyBook.setEnabled(true);
            tf_SeekModifyBook.setText("");
        } else {
            lbl_Message1.setText("All fields must be filled");
        }
    }//GEN-LAST:event_btn_ModifyActionPerformed

    //Borra un registro de libros
    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        fileBook = new Books_File();
        boolean flag = true;
        for (int i = 0; i < arrayBooks.size(); i++) {
            if (!arrayBooks.get(i).getName().equalsIgnoreCase(tf_SeekModifyBook.getText())) {
                if (flag) {
                    fileBook.writeBooks(arrayBooks.get(i), false);
                    flag = false;
                } else {
                    fileBook.writeBooks(arrayBooks.get(i), true);
                }
            } else {
                lbl_Message1.setText("The book was delete");
            }
        }

        lb_NameModifyBook.setVisible(false);
        lb_CodeModifyBook.setVisible(false);
        lb_AuthorModifyBook.setVisible(false);
        lb_YearModify.setVisible(false);
        lb_EditorialModifyBook.setVisible(false);
        lb_TypeModifyBook.setVisible(false);
        tft_Year.setVisible(false);
        tf_AuthorModifyBook.setVisible(false);
        tf_NameModifyBook.setVisible(false);
        cbx_Type.setVisible(false);
        btn_Modify.setVisible(false);
        btn_Delete.setVisible(false);
        tf_EditorialModifyBook.setVisible(false);
        btn_SeekOtherBook.setVisible(false);
        lbl_ShowCode.setText("");
        tf_SeekModifyBook.setEnabled(true);
        btn_seekModifyBook.setEnabled(true);
        tf_SeekModifyBook.setText("");
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_SeekOtherBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeekOtherBookActionPerformed

        lb_NameModifyBook.setVisible(false);
        lb_CodeModifyBook.setVisible(false);
        lb_AuthorModifyBook.setVisible(false);
        lb_YearModify.setVisible(false);
        lb_EditorialModifyBook.setVisible(false);
        lb_TypeModifyBook.setVisible(false);
        tft_Year.setVisible(false);
        tf_AuthorModifyBook.setVisible(false);
        tf_NameModifyBook.setVisible(false);
        cbx_Type.setVisible(false);
        btn_Modify.setVisible(false);
        btn_Delete.setVisible(false);
        tf_EditorialModifyBook.setVisible(false);
        lbl_ShowCode.setText("");
        tf_SeekModifyBook.setEnabled(true);
        btn_seekModifyBook.setEnabled(true);
        btn_SeekOtherBook.setVisible(false);
        tf_SeekModifyBook.setText("");
    }//GEN-LAST:event_btn_SeekOtherBookActionPerformed

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
            java.util.logging.Logger.getLogger(Modify_Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_Delete_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify_Delete_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Modify;
    private javax.swing.JButton btn_SeekOtherBook;
    private javax.swing.JButton btn_seekModifyBook;
    private javax.swing.JCheckBox cbx_Type;
    private javax.swing.JLabel lb_AuthorModifyBook;
    private javax.swing.JLabel lb_CodeModifyBook;
    private javax.swing.JLabel lb_EditorialModifyBook;
    private javax.swing.JLabel lb_ModifyBook;
    private javax.swing.JLabel lb_NameModifyBook;
    private javax.swing.JLabel lb_SeekModifyBook;
    private javax.swing.JLabel lb_TypeModifyBook;
    private javax.swing.JLabel lb_YearModify;
    private javax.swing.JLabel lbl_Message1;
    private javax.swing.JLabel lbl_Screen;
    private javax.swing.JLabel lbl_ShowCode;
    private javax.swing.JTextField tf_AuthorModifyBook;
    private javax.swing.JTextField tf_EditorialModifyBook;
    private javax.swing.JTextField tf_NameModifyBook;
    private javax.swing.JTextField tf_SeekModifyBook;
    private javax.swing.JTextField tft_Year;
    // End of variables declaration//GEN-END:variables
}
