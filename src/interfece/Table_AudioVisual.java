/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfece;

import domain.AudioVisual;
import file.AudioVisual_File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melvin
 */
public class Table_AudioVisual extends javax.swing.JFrame {

    AudioVisual fileAudiovisual;

    AudioVisual_File fileAudioVisual;
    ArrayList<AudioVisual> arrayAudioVisual;

    public Table_AudioVisual() {
        initComponents();
        matrizAudioVisual();
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

        lb_TableAudioVisual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_AudioVisual = new javax.swing.JTable();
        lbl_Screen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_TableAudioVisual.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        lb_TableAudioVisual.setForeground(new java.awt.Color(255, 255, 255));
        lb_TableAudioVisual.setText("Report of AudioVisual");
        getContentPane().add(lb_TableAudioVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 11, 425, 40));

        table_AudioVisual = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        table_AudioVisual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_AudioVisual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Code", "Year", "Brand", "Funtion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_AudioVisual.setRowHeight(30);
        table_AudioVisual.getTableHeader().setResizingAllowed(false);
        table_AudioVisual.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_AudioVisual);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 69, 962, 260));

        lbl_Screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/IMG_512577.jpg"))); // NOI18N
        getContentPane().add(lbl_Screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1010, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void matrizAudioVisual() {

        fileAudioVisual = new AudioVisual_File();

        try {
            arrayAudioVisual = fileAudioVisual.getArrayAudioVisual();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Table_Books.class.getName()).log(Level.SEVERE, null, ex);
        }

        String matriz_AudioVisual[][] = new String[arrayAudioVisual.size()][5];

        for (int i = 0; i < arrayAudioVisual.size(); i++) {

            matriz_AudioVisual[i][0] = arrayAudioVisual.get(i).getName();
            matriz_AudioVisual[i][1] = arrayAudioVisual.get(i).getCode();
            matriz_AudioVisual[i][2] = arrayAudioVisual.get(i).getYear();
            matriz_AudioVisual[i][3] = arrayAudioVisual.get(i).getBrand();
            matriz_AudioVisual[i][4] = arrayAudioVisual.get(i).getFuntion();
            ;

        }

        //Temporal para ordenar arreglo tipo burbuja
        String temp = "";
        //Ordena la matriz de audivisual
        for (int i = 0; i < matriz_AudioVisual.length; i++) {
            for (int j = i + 1; j < matriz_AudioVisual.length; j++) {
                if (matriz_AudioVisual[i][0].compareToIgnoreCase(matriz_AudioVisual[j][0]) > 0) {
                    System.out.println(matriz_AudioVisual[i][0] + " - " + matriz_AudioVisual[j][0]);
                    for (int k = 0; k < matriz_AudioVisual[0].length; k++) {
                        temp = matriz_AudioVisual[j][k];
                        matriz_AudioVisual[j][k] = matriz_AudioVisual[i][k];
                        matriz_AudioVisual[i][k] = temp;
                    }
                }
            }
        }

        table_AudioVisual.setModel(new javax.swing.table.DefaultTableModel(
                matriz_AudioVisual,
                new String[]{
                    "Name", "Code", "Year", "Brand", "Funtion"
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
            java.util.logging.Logger.getLogger(Table_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_AudioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_AudioVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_TableAudioVisual;
    private javax.swing.JLabel lbl_Screen;
    private javax.swing.JTable table_AudioVisual;
    // End of variables declaration//GEN-END:variables
}
