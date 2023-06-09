/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlLecon;
import Tools.ModelJTable;
import Controlers.CtrlEleve;

/**
 *
 * @author ninou
 */
public class FrmAdminElevePlanning extends javax.swing.JFrame {

    ModelJTable mdl;
    CtrlLecon ctrlLecon;
    CtrlEleve ctrlEleve;
    
            
    /**
     * Creates new form FrmMoniteurPlanning
     */
    public FrmAdminElevePlanning() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdminPlanningEleve = new javax.swing.JTable();
        lblChoisirEleve = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdminChoisirEleve = new javax.swing.JTable();
        lblPlanningEleve = new javax.swing.JLabel();
        lblTitreEleve = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblAdminPlanningEleve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAdminPlanningEleve);

        lblChoisirEleve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblChoisirEleve.setText("Choissisez un élève :");

        tblAdminChoisirEleve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAdminChoisirEleve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminChoisirEleveMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAdminChoisirEleve);

        lblPlanningEleve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlanningEleve.setText("Voici son planning :");

        lblTitreEleve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitreEleve.setText("Voir le planning d'un élève");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(lblChoisirEleve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 504, Short.MAX_VALUE)
                .addComponent(lblPlanningEleve)
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitreEleve)
                .addGap(450, 450, 450))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitreEleve)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChoisirEleve)
                    .addComponent(lblPlanningEleve))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         ctrlEleve = new CtrlEleve();
         ctrlLecon = new CtrlLecon();
         mdl = new ModelJTable();
         
         mdl.loadDatasAllEleve(ctrlEleve.getAllEleve());
         tblAdminChoisirEleve.setModel(mdl);
    }//GEN-LAST:event_formWindowOpened

    private void tblAdminChoisirEleveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminChoisirEleveMouseClicked
        // TODO add your handling code here:
        int numeroEleve= Integer.parseInt(tblAdminChoisirEleve.getValueAt(tblAdminChoisirEleve.getSelectedRow(), 0).toString());
        
        mdl = new ModelJTable();
        mdl.LoadDatasLecon(ctrlLecon.GetLeconByIdEleve(numeroEleve));
        tblAdminPlanningEleve.setModel(mdl);
    }//GEN-LAST:event_tblAdminChoisirEleveMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAdminElevePlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminElevePlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminElevePlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminElevePlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminElevePlanning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChoisirEleve;
    private javax.swing.JLabel lblPlanningEleve;
    private javax.swing.JLabel lblTitreEleve;
    private javax.swing.JTable tblAdminChoisirEleve;
    private javax.swing.JTable tblAdminPlanningEleve;
    // End of variables declaration//GEN-END:variables
}
