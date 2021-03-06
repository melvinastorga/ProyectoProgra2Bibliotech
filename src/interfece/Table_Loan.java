/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfece;

import domain.Loan;
import file.Loan_File;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melvin
 */
public class Table_Loan extends javax.swing.JFrame {

    Loan_File fileLoan;
    ArrayList<Loan> loanArray;

    /**
     * Creates new form Table_Loan
     */
    public Table_Loan() throws IOException {
        initComponents();
        matrizLoan();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Loan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Report of loan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 19, 239, -1));

        table_Loan = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        table_Loan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Record", "Student Code", "Material Code", "Delivery Date", "Return Date", "Pending", "Fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Loan.setRowHeight(30);
        table_Loan.getTableHeader().setResizingAllowed(false);
        table_Loan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_Loan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 95, 939, 317));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void matrizLoan() throws IOException {

        File file = new File("Loans.dat");

        try {
            fileLoan = new Loan_File(file);

            loanArray = fileLoan.getAllLoans();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Table_Books.class.getName()).log(Level.SEVERE, null, ex);
        }

        String matriz_Loan[][] = new String[loanArray.size()][7];

        for (int i = 0; i < loanArray.size(); i++) {

            matriz_Loan[i][0] = loanArray.get(i).getRecord();
            matriz_Loan[i][1] = loanArray.get(i).getStudentCode();
            matriz_Loan[i][2] = loanArray.get(i).getMaterialCode();
            matriz_Loan[i][3] = loanArray.get(i).getDeliveryDate();
            matriz_Loan[i][4] = loanArray.get(i).getReturnDate();
            matriz_Loan[i][5] = loanArray.get(i).getPending();
            matriz_Loan[i][6] = loanArray.get(i).getFine() + "";

        }
        table_Loan.setModel(new javax.swing.table.DefaultTableModel(
                matriz_Loan,
                new String[]{
                    "Record", "Student Code", "Material Code", "Delivery Date", "Return Date", "Pending", "Fine"
                }
        ));
    }

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
            java.util.logging.Logger.getLogger(Table_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Table_Loan().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Table_Loan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Loan;
    // End of variables declaration//GEN-END:variables
}
