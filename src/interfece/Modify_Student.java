/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfece;

import domain.Student;
import file.Student_File;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Melvin
 */
public class Modify_Student extends javax.swing.JFrame {

    ArrayList<Student> arrayStudents;
    Student_File fileStudent;
    int position;

    /**
     * Creates new form Modify_Student
     */
    public Modify_Student() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);
        this.setTitle("Modify a Student");
        lb_NameModifyStudent.setVisible(false);
        lb_CodeModifyStudent.setVisible(false);
        lb_YearModifyStudent.setVisible(false);
        lb_CareerModifyStudent.setVisible(false);
        tf_CodeModifyStudent.setVisible(false);
        tf_NameModifyStudent.setVisible(false);
        tf_YearModifyStudent.setVisible(false);
        cb_CarrerModifyStudent.setVisible(false);
        btn_ModifyStudent.setVisible(false);
        btn_DeleteStudent.setVisible(false);
        btn_ChangeStudent.setVisible(false);
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

        lb_ModifyStudent = new javax.swing.JLabel();
        lb_SeekModifyStudent = new javax.swing.JLabel();
        tf_SeekModifyStudent = new javax.swing.JTextField();
        btn_SeekModifyStudent = new javax.swing.JButton();
        lb_NameModifyStudent = new javax.swing.JLabel();
        lb_CodeModifyStudent = new javax.swing.JLabel();
        lb_YearModifyStudent = new javax.swing.JLabel();
        lb_CareerModifyStudent = new javax.swing.JLabel();
        tf_NameModifyStudent = new javax.swing.JTextField();
        tf_CodeModifyStudent = new javax.swing.JTextField();
        tf_YearModifyStudent = new javax.swing.JTextField();
        cb_CarrerModifyStudent = new javax.swing.JComboBox<>();
        btn_ModifyStudent = new javax.swing.JButton();
        lbl_message2 = new javax.swing.JLabel();
        btn_DeleteStudent = new javax.swing.JButton();
        lbl_showCode = new javax.swing.JLabel();
        btn_ChangeStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_ModifyStudent.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        lb_ModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        lb_ModifyStudent.setText("Modify a Student");
        getContentPane().add(lb_ModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 26, 272, -1));

        lb_SeekModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_SeekModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        lb_SeekModifyStudent.setText("Enter the code of the student to modify");
        getContentPane().add(lb_SeekModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 100, -1, -1));

        tf_SeekModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_SeekModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 156, 353, 32));

        btn_SeekModifyStudent.setBackground(new java.awt.Color(0, 51, 51));
        btn_SeekModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_SeekModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_SeekModifyStudent.setText("Seek");
        btn_SeekModifyStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeekModifyStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SeekModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 215, 90, 40));

        lb_NameModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_NameModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        lb_NameModifyStudent.setText("Name");
        getContentPane().add(lb_NameModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 303, -1, -1));

        lb_CodeModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_CodeModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        lb_CodeModifyStudent.setText("Code");
        getContentPane().add(lb_CodeModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 403, -1, -1));

        lb_YearModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_YearModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        lb_YearModifyStudent.setText("Year");
        getContentPane().add(lb_YearModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 505, -1, -1));

        lb_CareerModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_CareerModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        lb_CareerModifyStudent.setText("Career");
        getContentPane().add(lb_CareerModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 611, -1, -1));

        tf_NameModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_NameModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 301, 120, 32));

        tf_CodeModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_CodeModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 393, 121, 32));

        tf_YearModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tf_YearModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 503, 121, 32));

        cb_CarrerModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_CarrerModifyStudent.setForeground(new java.awt.Color(204, 0, 0));
        cb_CarrerModifyStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a item", "Agronomy", "Computing", "Education" }));
        getContentPane().add(cb_CarrerModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 610, 121, 30));

        btn_ModifyStudent.setBackground(new java.awt.Color(0, 51, 51));
        btn_ModifyStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ModifyStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_ModifyStudent.setText("Modify");
        btn_ModifyStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifyStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ModifyStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 670, 125, 54));

        lbl_message2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_message2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_message2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 730, 320, 50));

        btn_DeleteStudent.setBackground(new java.awt.Color(0, 51, 51));
        btn_DeleteStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_DeleteStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_DeleteStudent.setText("Delete");
        btn_DeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DeleteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 673, 121, 54));

        lbl_showCode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_showCode.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_showCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 230, 40));

        btn_ChangeStudent.setBackground(new java.awt.Color(0, 51, 51));
        btn_ChangeStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ChangeStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_ChangeStudent.setText("Change Student");
        btn_ChangeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ChangeStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SeekModifyStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeekModifyStudentActionPerformed
        File file = new File("Students.dat");

        try {

            fileStudent = new Student_File(file);
            arrayStudents = fileStudent.getAllStudents();
            for (int i = 0; i < arrayStudents.size(); i++) {
                if (arrayStudents.get(i).getCode().equalsIgnoreCase(tf_SeekModifyStudent.getText())) {
                    lb_NameModifyStudent.setVisible(true);
                    lb_CodeModifyStudent.setVisible(true);
                    lb_YearModifyStudent.setVisible(true);
                    lb_CareerModifyStudent.setVisible(true);
                    lbl_showCode.setVisible(true);
                    tf_NameModifyStudent.setVisible(true);
                    tf_YearModifyStudent.setVisible(true);
                    cb_CarrerModifyStudent.setVisible(true);
                    btn_ModifyStudent.setVisible(true);
                    btn_DeleteStudent.setVisible(true);
                    btn_ChangeStudent.setVisible(true);
                    tf_SeekModifyStudent.setEnabled(false);
                    btn_SeekModifyStudent.setEnabled(false);
                    tf_NameModifyStudent.setText(arrayStudents.get(i).getName());
                    tf_YearModifyStudent.setText(arrayStudents.get(i).getYear());
                    lbl_showCode.setText(arrayStudents.get(i).getCode());
                    cb_CarrerModifyStudent.setSelectedItem(arrayStudents.get(i).getCareer());
                    lbl_message2.setText("");
                    position = i;
                    i = arrayStudents.size();
                } else {
                    lbl_message2.setText("The student does not exits");
                }
            }
        } catch (IOException ex) {
            lbl_message2.setText("Error reading the file");
        }

    }//GEN-LAST:event_btn_SeekModifyStudentActionPerformed

    private void btn_ChangeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChangeStudentActionPerformed
        lb_NameModifyStudent.setVisible(false);
        lb_CodeModifyStudent.setVisible(false);
        lb_YearModifyStudent.setVisible(false);
        lb_CareerModifyStudent.setVisible(false);
        tf_CodeModifyStudent.setVisible(false);
        tf_NameModifyStudent.setVisible(false);
        tf_YearModifyStudent.setVisible(false);
        cb_CarrerModifyStudent.setVisible(false);
        btn_ModifyStudent.setVisible(false);
        btn_DeleteStudent.setVisible(false);
        btn_ChangeStudent.setVisible(false);
        tf_SeekModifyStudent.setEnabled(true);
        btn_SeekModifyStudent.setEnabled(true);
        tf_SeekModifyStudent.setText("");
    }//GEN-LAST:event_btn_ChangeStudentActionPerformed

    private void btn_ModifyStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifyStudentActionPerformed
        Student modifyStuden = new Student(tf_NameModifyStudent.getText(), lbl_showCode.getText(),
                (String) cb_CarrerModifyStudent.getSelectedItem(), tf_YearModifyStudent.getText());
        File file = new File("Students.dat");
        try {
            fileStudent = new Student_File(file);
            if (fileStudent.putValue(position, modifyStuden)) {
                lbl_message2.setText("The student was modify!");
                lb_NameModifyStudent.setVisible(false);
                lb_CodeModifyStudent.setVisible(false);
                lb_YearModifyStudent.setVisible(false);
                lb_CareerModifyStudent.setVisible(false);
                lbl_showCode.setVisible(false);
                tf_NameModifyStudent.setVisible(false);
                tf_YearModifyStudent.setVisible(false);
                cb_CarrerModifyStudent.setVisible(false);
                btn_ModifyStudent.setVisible(false);
                btn_DeleteStudent.setVisible(false);
                btn_ChangeStudent.setVisible(false);
            } else {
                lbl_message2.setText("Error modifing the student");
            }
        } catch (IOException ex) {
            lbl_message2.setText("Error reading the file");
        }

    }//GEN-LAST:event_btn_ModifyStudentActionPerformed

    private void btn_DeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteStudentActionPerformed
        File file = new File("Students.dat");
        try {
            fileStudent = new Student_File(file);
            if (fileStudent.deleteStudent(lbl_showCode.getText())) {
                lbl_message2.setText("The student was delete!");
                lb_NameModifyStudent.setVisible(false);
                lb_CodeModifyStudent.setVisible(false);
                lb_YearModifyStudent.setVisible(false);
                lb_CareerModifyStudent.setVisible(false);
                lbl_showCode.setVisible(false);
                tf_NameModifyStudent.setVisible(false);
                tf_YearModifyStudent.setVisible(false);
                cb_CarrerModifyStudent.setVisible(false);
                btn_ModifyStudent.setVisible(false);
                btn_DeleteStudent.setVisible(false);
                btn_ChangeStudent.setVisible(false);

            } else {
                lbl_message2.setText("Error deleting the student");
            }
        } catch (IOException ex) {
            lbl_message2.setText("Error reading the file");
        }

    }//GEN-LAST:event_btn_DeleteStudentActionPerformed

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
            java.util.logging.Logger.getLogger(Modify_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChangeStudent;
    private javax.swing.JButton btn_DeleteStudent;
    private javax.swing.JButton btn_ModifyStudent;
    private javax.swing.JButton btn_SeekModifyStudent;
    private javax.swing.JComboBox<String> cb_CarrerModifyStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_CareerModifyStudent;
    private javax.swing.JLabel lb_CodeModifyStudent;
    private javax.swing.JLabel lb_ModifyStudent;
    private javax.swing.JLabel lb_NameModifyStudent;
    private javax.swing.JLabel lb_SeekModifyStudent;
    private javax.swing.JLabel lb_YearModifyStudent;
    private javax.swing.JLabel lbl_message2;
    private javax.swing.JLabel lbl_showCode;
    private javax.swing.JTextField tf_CodeModifyStudent;
    private javax.swing.JTextField tf_NameModifyStudent;
    private javax.swing.JTextField tf_SeekModifyStudent;
    private javax.swing.JTextField tf_YearModifyStudent;
    // End of variables declaration//GEN-END:variables
}
