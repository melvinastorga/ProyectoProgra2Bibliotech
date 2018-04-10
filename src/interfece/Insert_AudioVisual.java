package interfece;

import domain.AudioVisual;
import file.AudioVisual_File;
import java.awt.Color;

/**
 *
 * @author Melvin
 */
public class Insert_AudioVisual extends javax.swing.JFrame {

    //Instancia del controlador de archivos de audioVisual
    AudioVisual_File fileAudiovisual;

    public Insert_AudioVisual() {
        initComponents();
        //Da color y un titulo a la ventana
        this.getContentPane().setBackground(Color.lightGray);
        this.setTitle("Add a new AudioVisual");
        btn_InsertAudioVisual.setEnabled(false);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_InsertAudioVisual = new javax.swing.JLabel();
        lb_NameInsertAudioVisual = new javax.swing.JLabel();
        lb_CodeInsertAudioVisual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_BrandInsertAudioVisual = new javax.swing.JLabel();
        lb_FuntionInsertAudioVisual = new javax.swing.JLabel();
        tf_NameInsertAudioVisual = new javax.swing.JTextField();
        tf_YearAudioVisual = new javax.swing.JTextField();
        tf_BrandAudioVisual = new javax.swing.JTextField();
        tf_FuntionAudioVisual = new javax.swing.JTextField();
        btn_InsertAudioVisual = new javax.swing.JButton();
        lbl_Message = new javax.swing.JLabel();
        btn_CreateCode = new javax.swing.JButton();
        lbl_Code = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_InsertAudioVisual.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        lb_InsertAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_InsertAudioVisual.setText("Insert AudioVisual");
        getContentPane().add(lb_InsertAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 291, -1));

        lb_NameInsertAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_NameInsertAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_NameInsertAudioVisual.setText("Name");
        getContentPane().add(lb_NameInsertAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 142, -1, -1));

        lb_CodeInsertAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_CodeInsertAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_CodeInsertAudioVisual.setText("Code");
        getContentPane().add(lb_CodeInsertAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 215, -1, -1));

        lb_BrandInsertAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_BrandInsertAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_BrandInsertAudioVisual.setText("Brand");
        getContentPane().add(lb_BrandInsertAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 296, -1, -1));

        lb_FuntionInsertAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_FuntionInsertAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_FuntionInsertAudioVisual.setText("Funtion");
        getContentPane().add(lb_FuntionInsertAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        tf_NameInsertAudioVisual.setBackground(new java.awt.Color(0, 0, 0));
        tf_NameInsertAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_NameInsertAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf_NameInsertAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 139, 241, 35));

        tf_YearAudioVisual.setBackground(new java.awt.Color(0, 0, 0));
        tf_YearAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf_YearAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf_YearAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 213, 241, 32));

        tf_BrandAudioVisual.setBackground(new java.awt.Color(0, 0, 0));
        tf_BrandAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf_BrandAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf_BrandAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 241, 32));

        tf_FuntionAudioVisual.setBackground(new java.awt.Color(0, 0, 0));
        tf_FuntionAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf_FuntionAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf_FuntionAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 241, 33));

        btn_InsertAudioVisual.setBackground(new java.awt.Color(0, 51, 51));
        btn_InsertAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_InsertAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        btn_InsertAudioVisual.setText("Insert");
        btn_InsertAudioVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertAudioVisualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_InsertAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 601, 186, 52));

        lbl_Message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Message.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lbl_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 461, 448, 47));

        btn_CreateCode.setBackground(new java.awt.Color(0, 51, 51));
        btn_CreateCode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_CreateCode.setForeground(new java.awt.Color(255, 255, 255));
        btn_CreateCode.setText("Create Code");
        btn_CreateCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateCodeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CreateCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 526, 241, 44));

        lbl_Code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Code.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 421, 241, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Acciones del boton Agregar AudioVisual
    private void btn_InsertAudioVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertAudioVisualActionPerformed
        //valida que sea un numero
        try {
            Integer.parseInt(tf_YearAudioVisual.getText());
            //valida que la fecha sea valida
            if (tf_YearAudioVisual.getText().length() == 4) {
                //valida que los campos no esten vacios
                if (!tf_NameInsertAudioVisual.getText().equals("") && !tf_BrandAudioVisual.getText().equals("")
                        && !tf_YearAudioVisual.getText().equals("") && !tf_FuntionAudioVisual.getText().equals("")) {
                    btn_InsertAudioVisual.setEnabled(true);
                    fileAudiovisual = new AudioVisual_File();
                    AudioVisual newAudioVisual = new AudioVisual(tf_BrandAudioVisual.getText(),
                            tf_FuntionAudioVisual.getText(), tf_NameInsertAudioVisual.getText(),
                            lbl_Code.getText(), tf_YearAudioVisual.getText());
                    fileAudiovisual.writeAudioVisual(newAudioVisual, true);
                    //Limpia los campos de texto.
                    tf_BrandAudioVisual.setText("");
                    lbl_Code.setText("");
                    tf_FuntionAudioVisual.setText("");
                    tf_NameInsertAudioVisual.setText("");
                    tf_YearAudioVisual.setText("");

                    lbl_Message.setText("The audiovisual was add");
                    btn_InsertAudioVisual.setEnabled(false);

                } else {
                    lbl_Message.setText("You have to complete all the fields!");
                }
            } else {
                lbl_Message.setText("The year is incorrect.");
            }
        } catch (NumberFormatException nfe) {
            lbl_Message.setText("The year fields have to be in numbers");
        }

    }//GEN-LAST:event_btn_InsertAudioVisualActionPerformed

    private void btn_CreateCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateCodeActionPerformed
        if (!tf_NameInsertAudioVisual.getText().equals("") && !tf_BrandAudioVisual.getText().equals("")
                && !tf_YearAudioVisual.getText().equals("") && !tf_FuntionAudioVisual.getText().equals("")) {
            fileAudiovisual = new AudioVisual_File();
            lbl_Code.setText(fileAudiovisual.getAudiVisualCode(tf_NameInsertAudioVisual.getText()));
            lbl_Message.setText("");
            btn_InsertAudioVisual.setEnabled(true);
        } else {
            lbl_Message.setText("Complete all the filds");
        }
    }//GEN-LAST:event_btn_CreateCodeActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_AudioVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateCode;
    private javax.swing.JButton btn_InsertAudioVisual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_BrandInsertAudioVisual;
    private javax.swing.JLabel lb_CodeInsertAudioVisual;
    private javax.swing.JLabel lb_FuntionInsertAudioVisual;
    private javax.swing.JLabel lb_InsertAudioVisual;
    private javax.swing.JLabel lb_NameInsertAudioVisual;
    private javax.swing.JLabel lbl_Code;
    private javax.swing.JLabel lbl_Message;
    private javax.swing.JTextField tf_BrandAudioVisual;
    private javax.swing.JTextField tf_FuntionAudioVisual;
    private javax.swing.JTextField tf_NameInsertAudioVisual;
    private javax.swing.JTextField tf_YearAudioVisual;
    // End of variables declaration//GEN-END:variables
}
