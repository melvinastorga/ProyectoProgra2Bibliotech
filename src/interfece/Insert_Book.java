package interfece;

import domain.Books;
import file.Books_File;
import java.awt.Color;
import javax.swing.JOptionPane;

//Creacion de la clase con JFrame para insertar Books
public class Insert_Book extends javax.swing.JFrame {

    //Instancia del controlador de archivos de Books
    Books_File fileBooks;

    public Insert_Book() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);
        this.setTitle("Add a new Book");
        btn_addBook.setEnabled(false);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lb_AddBook = new javax.swing.JLabel();
        lb_NameBook = new javax.swing.JLabel();
        tf_NameBook = new javax.swing.JTextField();
        lb_CodeBook = new javax.swing.JLabel();
        lb_AuthorBook = new javax.swing.JLabel();
        lb_EditorialBook = new javax.swing.JLabel();
        btn_addBook = new javax.swing.JButton();
        tft_AuthorBook = new javax.swing.JTextField();
        tft_EditorialBook = new javax.swing.JTextField();
        cb_Digital = new javax.swing.JCheckBox();
        lbl_YearBook = new javax.swing.JLabel();
        tft_YearBook = new javax.swing.JTextField();
        lb_Message = new javax.swing.JLabel();
        btn_CreateCode = new javax.swing.JButton();
        lb_CreateCode = new javax.swing.JLabel();
        lbl_screen = new javax.swing.JLabel();
        lbl_Message = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_AddBook.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        lb_AddBook.setForeground(new java.awt.Color(240, 240, 240));
        lb_AddBook.setText("Add New Book");
        lb_AddBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lb_AddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 310, 51));

        lb_NameBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_NameBook.setForeground(new java.awt.Color(240, 240, 240));
        lb_NameBook.setText("Name");
        getContentPane().add(lb_NameBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 126, 117, 39));

        tf_NameBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_NameBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 129, 347, 39));

        lb_CodeBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_CodeBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_CodeBook.setText("Code");
        getContentPane().add(lb_CodeBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 534, 83, 38));

        lb_AuthorBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_AuthorBook.setForeground(new java.awt.Color(255, 255, 255));
        lb_AuthorBook.setText("Author");
        getContentPane().add(lb_AuthorBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 296, 83, 36));

        lb_EditorialBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_EditorialBook.setForeground(new java.awt.Color(240, 240, 240));
        lb_EditorialBook.setText("Editorial");
        getContentPane().add(lb_EditorialBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 403, -1, -1));

        btn_addBook.setBackground(new java.awt.Color(0, 51, 51));
        btn_addBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_addBook.setForeground(new java.awt.Color(240, 240, 240));
        btn_addBook.setText("Add");
        btn_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBookActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 587, 110, 52));

        tft_AuthorBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tft_AuthorBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 299, 347, 36));

        tft_EditorialBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tft_EditorialBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 401, 347, 33));

        cb_Digital.setBackground(new java.awt.Color(51, 51, 51));
        cb_Digital.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb_Digital.setForeground(new java.awt.Color(255, 255, 255));
        cb_Digital.setText("  Is a Digital Book?");
        getContentPane().add(cb_Digital, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 463, 347, 40));

        lbl_YearBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_YearBook.setForeground(new java.awt.Color(255, 255, 255));
        lbl_YearBook.setText("Year");
        getContentPane().add(lbl_YearBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 220, -1, -1));

        tft_YearBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tft_YearBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 218, 347, 32));
        getContentPane().add(lb_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 576, 201, -1));

        btn_CreateCode.setBackground(new java.awt.Color(0, 51, 51));
        btn_CreateCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_CreateCode.setForeground(new java.awt.Color(240, 240, 240));
        btn_CreateCode.setText("Create Code");
        btn_CreateCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateCodeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CreateCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 541, 142, 35));

        lb_CreateCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lb_CreateCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 533, 130, 39));

        lbl_screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        lbl_screen.setText("jLabel1");
        getContentPane().add(lbl_screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 620, 710));

        lbl_Message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lbl_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 653, 401, 28));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Funciones del boton Agregar Book
    private void btn_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBookActionPerformed

        //Un condicional para ver si el libro es fisico o digital
        String digital = "Physical";

        if (cb_Digital.isSelected()) {
            digital = "Digital";
        }

        //Creacion de un libro nuevo tomando los valores del usuario por la interfaz
        Books book = new Books(tft_AuthorBook.getText(), tft_EditorialBook.getText(), tf_NameBook.getText(), lb_CreateCode.getText(), tft_YearBook.getText(), digital);

        fileBooks = new Books_File();
        //Llama al metodo  Write  para escribir el libro en el archivo serializado
        lbl_Message.setText(fileBooks.writeBooks(book, true));

        //Limpia los campos de texto
        tf_NameBook.setText("");
        lb_CreateCode.setText("");
        tft_EditorialBook.setText("");
        tft_YearBook.setText("");
        tft_AuthorBook.setText("");


    }//GEN-LAST:event_btn_addBookActionPerformed

    private void btn_CreateCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateCodeActionPerformed
        //valida que sea un numero
        try {
            Integer.parseInt(tft_YearBook.getText());
            //valida que la fecha sea valida
            if (tft_YearBook.getText().length() == 4) {
                if (tf_NameBook.getText().length() >= 2) {
                    if (tft_AuthorBook.getText().length() >= 3) {
                        //valida que los campos no esten vacios
                        if (!tft_EditorialBook.getText().equals("") && !tft_YearBook.getText().equals("")) {
                            btn_addBook.setEnabled(true);
                            fileBooks = new Books_File();

                            char type = 'P';

                            if (cb_Digital.isSelected()) {
                                type = 'D';
                            }

                            String code = fileBooks.getBooksCode(tf_NameBook.getText(), tft_AuthorBook.getText(), tft_EditorialBook.getText(), tft_YearBook.getText(), type);
                            lb_CreateCode.setText(code);
                            btn_addBook.setEnabled(true);

                        } else {
                            lbl_Message.setText("All fields must be filled!");
                        }
                    } else {
                        lbl_Message.setText("The autor name must be at least 3 letters!");
                    }
                } else {
                    lbl_Message.setText("The books name must be at least 2 letters!");
                }
            } else {
                lbl_Message.setText("The year have to be in four digits.");
            }
        } catch (NumberFormatException nfe) {
            lbl_Message.setText("The year fields have to be in numbers");
        }
    }//GEN-LAST:event_btn_CreateCodeActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateCode;
    private javax.swing.JButton btn_addBook;
    private javax.swing.JCheckBox cb_Digital;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lb_AddBook;
    private javax.swing.JLabel lb_AuthorBook;
    private javax.swing.JLabel lb_CodeBook;
    private javax.swing.JLabel lb_CreateCode;
    private javax.swing.JLabel lb_EditorialBook;
    private javax.swing.JLabel lb_Message;
    private javax.swing.JLabel lb_NameBook;
    private javax.swing.JLabel lbl_Message;
    private javax.swing.JLabel lbl_YearBook;
    private javax.swing.JLabel lbl_screen;
    private javax.swing.JTextField tf_NameBook;
    private javax.swing.JTextField tft_AuthorBook;
    private javax.swing.JTextField tft_EditorialBook;
    private javax.swing.JTextField tft_YearBook;
    // End of variables declaration//GEN-END:variables
}
