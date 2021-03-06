/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfece;

import domain.AudioVisual;
import file.AudioVisual_File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Melvin
 */
public class Modify_AudioVisual extends javax.swing.JFrame {

    AudioVisual_File fileAudioVisual;
    ArrayList<AudioVisual> arrayAudioVisual;

    //Inicializa los componentes
    public Modify_AudioVisual() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);
        this.setTitle("Modify AudioVisual");
        lbl_YearAudioVisual.setVisible(false);
        lb_NameModifyAudioVisual.setVisible(false);
        lb_FuntionModifyAudioVisual.setVisible(false);
        lb_CodeModifyAudioVisual.setVisible(false);
        lb_BrandModifyAudioVisual.setVisible(false);
        tft_YearAudioVisual.setVisible(false);
        tf_NameModifyAudioVisual.setVisible(false);
        tf_CodeModifyAudioVisual.setVisible(false);
        tf_BrandModifyAudioVisual.setVisible(false);
        tf_FuntionModifyAudioVisual.setVisible(false);
        btn_Delete.setVisible(false);
        btn_ModifyAudioVisual.setVisible(false);
        btn_OtherSeek.setVisible(false);
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

        lb_ModifyAudioVisual = new javax.swing.JLabel();
        lb_SeekModifyAudioVisual = new javax.swing.JLabel();
        tf_SeekModifyAudioVisual = new javax.swing.JTextField();
        btn_seekModifyAudioVisual = new javax.swing.JButton();
        lb_NameModifyAudioVisual = new javax.swing.JLabel();
        lb_CodeModifyAudioVisual = new javax.swing.JLabel();
        lbl_YearAudioVisual = new javax.swing.JLabel();
        lb_BrandModifyAudioVisual = new javax.swing.JLabel();
        lb_FuntionModifyAudioVisual = new javax.swing.JLabel();
        tf_NameModifyAudioVisual = new javax.swing.JTextField();
        tf_CodeModifyAudioVisual = new javax.swing.JTextField();
        tft_YearAudioVisual = new javax.swing.JTextField();
        tf_BrandModifyAudioVisual = new javax.swing.JTextField();
        tf_FuntionModifyAudioVisual = new javax.swing.JTextField();
        btn_ModifyAudioVisual = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_OtherSeek = new javax.swing.JButton();
        lb_Message = new javax.swing.JLabel();
        lbl_message = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_ModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        lb_ModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_ModifyAudioVisual.setText("Modify AudioVisual");
        getContentPane().add(lb_ModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 28, 300, -1));

        lb_SeekModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_SeekModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_SeekModifyAudioVisual.setText("Enter the code of the AudioVisual to modify");
        getContentPane().add(lb_SeekModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 99, -1, -1));

        tf_SeekModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_SeekModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 139, 250, 36));

        btn_seekModifyAudioVisual.setBackground(new java.awt.Color(0, 51, 51));
        btn_seekModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_seekModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        btn_seekModifyAudioVisual.setText("Seek");
        btn_seekModifyAudioVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seekModifyAudioVisualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_seekModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 193, 107, 38));

        lb_NameModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_NameModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_NameModifyAudioVisual.setText("Name");
        getContentPane().add(lb_NameModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lb_CodeModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_CodeModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_CodeModifyAudioVisual.setText("Code");
        getContentPane().add(lb_CodeModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        lbl_YearAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_YearAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_YearAudioVisual.setText("Year");
        getContentPane().add(lbl_YearAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        lb_BrandModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_BrandModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_BrandModifyAudioVisual.setText("Brand");
        getContentPane().add(lb_BrandModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        lb_FuntionModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_FuntionModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_FuntionModifyAudioVisual.setText("Funtion");
        getContentPane().add(lb_FuntionModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

        tf_NameModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_NameModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 200, 32));

        tf_CodeModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_CodeModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 200, 32));

        tft_YearAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tft_YearAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 200, 32));

        tf_BrandModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_BrandModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 200, 32));

        tf_FuntionModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_FuntionModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 200, 32));

        btn_ModifyAudioVisual.setBackground(new java.awt.Color(0, 51, 51));
        btn_ModifyAudioVisual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ModifyAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        btn_ModifyAudioVisual.setText("Modify");
        btn_ModifyAudioVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifyAudioVisualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ModifyAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 685, 106, 44));

        btn_Delete.setBackground(new java.awt.Color(0, 51, 51));
        btn_Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 685, 106, 44));

        btn_OtherSeek.setBackground(new java.awt.Color(0, 51, 51));
        btn_OtherSeek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_OtherSeek.setForeground(new java.awt.Color(255, 255, 255));
        btn_OtherSeek.setText("Seek other audioVisual");
        btn_OtherSeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OtherSeekActionPerformed(evt);
            }
        });
        getContentPane().add(btn_OtherSeek, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 196, -1, 38));

        lb_Message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_Message.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lb_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 735, 329, 38));
        getContentPane().add(lbl_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 360, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_seekModifyAudioVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seekModifyAudioVisualActionPerformed

        fileAudioVisual = new AudioVisual_File();
        try {
            arrayAudioVisual = fileAudioVisual.getArrayAudioVisual();

            for (int i = 0; i < arrayAudioVisual.size(); i++) {
                //Llena lo campos de texto con el valor del libro
                if (arrayAudioVisual.get(i).getCode().equalsIgnoreCase(tf_SeekModifyAudioVisual.getText())) {
                    tf_NameModifyAudioVisual.setText(arrayAudioVisual.get(i).getName());
                    tf_CodeModifyAudioVisual.setText(arrayAudioVisual.get(i).getCode());
                    tf_BrandModifyAudioVisual.setText(arrayAudioVisual.get(i).getBrand());
                    tf_FuntionModifyAudioVisual.setText(arrayAudioVisual.get(i).getFuntion());
                    tft_YearAudioVisual.setText(arrayAudioVisual.get(i).getYear());
                    lbl_YearAudioVisual.setVisible(true);
                    lb_NameModifyAudioVisual.setVisible(true);
                    lb_FuntionModifyAudioVisual.setVisible(true);
                    lb_CodeModifyAudioVisual.setVisible(true);
                    lb_BrandModifyAudioVisual.setVisible(true);
                    tft_YearAudioVisual.setVisible(true);
                    tf_NameModifyAudioVisual.setVisible(true);
                    tf_CodeModifyAudioVisual.setVisible(true);
                    tf_BrandModifyAudioVisual.setVisible(true);
                    tf_FuntionModifyAudioVisual.setVisible(true);
                    btn_Delete.setVisible(true);
                    btn_ModifyAudioVisual.setVisible(true);
                    btn_OtherSeek.setVisible(true);
                    btn_seekModifyAudioVisual.setEnabled(false);
                    tf_SeekModifyAudioVisual.setEnabled(false);
                    lbl_message.setText("");
                    break;

                } else {
                    lbl_message.setText("The audivisual does no t exist");
                }
            }

        } catch (FileNotFoundException ex) {
            lbl_message.setText("Error al leer el archivo");
        }

    }//GEN-LAST:event_btn_seekModifyAudioVisualActionPerformed
//bora audiovisua
    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        fileAudioVisual = new AudioVisual_File();
        boolean flag = true;
        for (int i = 0; i < arrayAudioVisual.size(); i++) {//recore el arreglo
            if (!arrayAudioVisual.get(i).getCode().equalsIgnoreCase(tf_SeekModifyAudioVisual.getText())) {
                if (flag) {
                    fileAudioVisual.writeAudioVisual(arrayAudioVisual.get(i), false);
                    flag = false;
                } else {
                    fileAudioVisual.writeAudioVisual(arrayAudioVisual.get(i), true);
                }
            }
        }
        //Oculta componentes
        lbl_message.setText("The audivisual was delted!");
        lbl_YearAudioVisual.setVisible(false);
        lb_NameModifyAudioVisual.setVisible(false);
        lb_FuntionModifyAudioVisual.setVisible(false);
        lb_CodeModifyAudioVisual.setVisible(false);
        lb_BrandModifyAudioVisual.setVisible(false);
        tft_YearAudioVisual.setVisible(false);
        tf_NameModifyAudioVisual.setVisible(false);
        tf_CodeModifyAudioVisual.setVisible(false);
        tf_BrandModifyAudioVisual.setVisible(false);
        tf_FuntionModifyAudioVisual.setVisible(false);
        btn_Delete.setVisible(false);
        btn_ModifyAudioVisual.setVisible(false);
        btn_OtherSeek.setVisible(false);
        btn_seekModifyAudioVisual.setEnabled(true);
        tf_SeekModifyAudioVisual.setEnabled(true);
        tf_SeekModifyAudioVisual.setText("");

    }//GEN-LAST:event_btn_DeleteActionPerformed

    //modifica audiovsual
    private void btn_ModifyAudioVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifyAudioVisualActionPerformed
        if (!tf_NameModifyAudioVisual.getText().equals("") && !tf_CodeModifyAudioVisual.getText().equals("")
                && !tft_YearAudioVisual.getText().equals("") && !tf_BrandModifyAudioVisual.getText().equals("")
                && !tf_FuntionModifyAudioVisual.getText().equals("")) {
            fileAudioVisual = new AudioVisual_File();
            boolean flag = true;
            for (int i = 0; i < arrayAudioVisual.size(); i++) {
                if (!arrayAudioVisual.get(i).getCode().equalsIgnoreCase(tf_CodeModifyAudioVisual.getText())) {
                    if (flag) {
                        fileAudioVisual.writeAudioVisual(arrayAudioVisual.get(i), false);
                        flag = false;
                    } else {
                        fileAudioVisual.writeAudioVisual(arrayAudioVisual.get(i), true);
                    }
                } else {
                    AudioVisual AudioVisualModify = new AudioVisual(tf_BrandModifyAudioVisual.getText(), tf_FuntionModifyAudioVisual.getText(),
                            tf_NameModifyAudioVisual.getText(), tf_CodeModifyAudioVisual.getText(), tft_YearAudioVisual.getText());
                    if (flag) {
                        fileAudioVisual.writeAudioVisual(AudioVisualModify, false);
                        flag = false;
                    } else {
                        fileAudioVisual.writeAudioVisual(AudioVisualModify, true);
                    }
                }
            }
            lbl_message.setText("The audivisual was modify!");
            //Oculta componentes
            lbl_YearAudioVisual.setVisible(false);
            lb_NameModifyAudioVisual.setVisible(false);
            lb_FuntionModifyAudioVisual.setVisible(false);
            lb_CodeModifyAudioVisual.setVisible(false);
            lb_BrandModifyAudioVisual.setVisible(false);
            tft_YearAudioVisual.setVisible(false);
            tf_NameModifyAudioVisual.setVisible(false);
            tf_CodeModifyAudioVisual.setVisible(false);
            tf_BrandModifyAudioVisual.setVisible(false);
            tf_FuntionModifyAudioVisual.setVisible(false);
            btn_Delete.setVisible(false);
            btn_ModifyAudioVisual.setVisible(false);
            btn_OtherSeek.setVisible(false);
            btn_seekModifyAudioVisual.setEnabled(true);
            tf_SeekModifyAudioVisual.setEnabled(true);
            tf_SeekModifyAudioVisual.setText("");
        } else {
            lbl_message.setText("Must fill all the fields!");
        }
    }//GEN-LAST:event_btn_ModifyAudioVisualActionPerformed

    private void btn_OtherSeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OtherSeekActionPerformed
        lbl_YearAudioVisual.setVisible(false);
        lb_NameModifyAudioVisual.setVisible(false);
        lb_FuntionModifyAudioVisual.setVisible(false);
        lb_CodeModifyAudioVisual.setVisible(false);
        lb_BrandModifyAudioVisual.setVisible(false);
        tft_YearAudioVisual.setVisible(false);
        tf_NameModifyAudioVisual.setVisible(false);
        tf_CodeModifyAudioVisual.setVisible(false);
        tf_BrandModifyAudioVisual.setVisible(false);
        tf_FuntionModifyAudioVisual.setVisible(false);
        btn_Delete.setVisible(false);
        btn_ModifyAudioVisual.setVisible(false);
        btn_OtherSeek.setVisible(false);
        btn_seekModifyAudioVisual.setEnabled(true);
        tf_SeekModifyAudioVisual.setEnabled(true);
        tf_SeekModifyAudioVisual.setText("");
    }//GEN-LAST:event_btn_OtherSeekActionPerformed

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
            java.util.logging.Logger.getLogger(Modify_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify_AudioVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_ModifyAudioVisual;
    private javax.swing.JButton btn_OtherSeek;
    private javax.swing.JButton btn_seekModifyAudioVisual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_BrandModifyAudioVisual;
    private javax.swing.JLabel lb_CodeModifyAudioVisual;
    private javax.swing.JLabel lb_FuntionModifyAudioVisual;
    private javax.swing.JLabel lb_Message;
    private javax.swing.JLabel lb_ModifyAudioVisual;
    private javax.swing.JLabel lb_NameModifyAudioVisual;
    private javax.swing.JLabel lb_SeekModifyAudioVisual;
    private javax.swing.JLabel lbl_YearAudioVisual;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JTextField tf_BrandModifyAudioVisual;
    private javax.swing.JTextField tf_CodeModifyAudioVisual;
    private javax.swing.JTextField tf_FuntionModifyAudioVisual;
    private javax.swing.JTextField tf_NameModifyAudioVisual;
    private javax.swing.JTextField tf_SeekModifyAudioVisual;
    private javax.swing.JTextField tft_YearAudioVisual;
    // End of variables declaration//GEN-END:variables
}
