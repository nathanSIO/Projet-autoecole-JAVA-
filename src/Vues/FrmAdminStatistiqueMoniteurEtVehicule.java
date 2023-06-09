/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlMoniteur;
import Controlers.CtrlVehicule;
import Tools.ModelJTable;

/**
 *
 * @author Rakotomalala Cédric
 */
public class FrmAdminStatistiqueMoniteurEtVehicule extends javax.swing.JFrame {
    ModelJTable mdl,mdl2,mdl3,mdl4;
    CtrlMoniteur ctrlMoniteur;
    CtrlVehicule ctrlVehicule;
    /**
     * Creates new form FrmAdminStatistiqueMoniteurEtVehicule
     */
    public FrmAdminStatistiqueMoniteurEtVehicule() {
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
        tblUnMoniteurSollicite = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLesMoniteursSollicites = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUnVehiculeSollicite = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLesVehiculesSollicites = new javax.swing.JTable();
        lblUnMoniteurSollicité = new javax.swing.JLabel();
        lblADminStatMoniteurVehicule = new javax.swing.JLabel();
        lblLesVehiculesSollicites = new javax.swing.JLabel();
        btnAdminGraphiqueLesMoniteurs = new javax.swing.JButton();
        lblUnVehiculeSollicité = new javax.swing.JLabel();
        lblLesMoniteursSollicites = new javax.swing.JLabel();
        btnAdminGraphiqueVehicule = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportView(tblUnMoniteurSollicite);

        jScrollPane2.setViewportView(tblLesMoniteursSollicites);

        jScrollPane3.setViewportView(tblUnVehiculeSollicite);

        jScrollPane4.setViewportView(tblLesVehiculesSollicites);

        lblUnMoniteurSollicité.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblUnMoniteurSollicité.setText("Le moniteur le plus sollicité");

        lblADminStatMoniteurVehicule.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblADminStatMoniteurVehicule.setText("Statistiques des moniteurs et véhicules les plus sollicités ");

        lblLesVehiculesSollicites.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblLesVehiculesSollicites.setText("Les véhicules les plus sollicités");

        btnAdminGraphiqueLesMoniteurs.setText("Voir le Graphique des moniteurs");
        btnAdminGraphiqueLesMoniteurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminGraphiqueLesMoniteursMouseClicked(evt);
            }
        });

        lblUnVehiculeSollicité.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblUnVehiculeSollicité.setText("Le véhicule le plus sollicité");

        lblLesMoniteursSollicites.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblLesMoniteursSollicites.setText("Classement des moniteurs les plus sollicités");

        btnAdminGraphiqueVehicule.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAdminGraphiqueVehicule.setText("Voir le graphique des véhicules");
        btnAdminGraphiqueVehicule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminGraphiqueVehiculeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblUnVehiculeSollicité)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdminGraphiqueVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUnMoniteurSollicité)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLesMoniteursSollicites)
                                    .addComponent(btnAdminGraphiqueLesMoniteurs, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLesVehiculesSollicites)
                        .addGap(429, 429, 429))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblADminStatMoniteurVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblADminStatMoniteurVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnMoniteurSollicité)
                    .addComponent(lblLesMoniteursSollicites))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnAdminGraphiqueLesMoniteurs)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnVehiculeSollicité)
                    .addComponent(lblLesVehiculesSollicites, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdminGraphiqueVehicule)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminGraphiqueLesMoniteursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminGraphiqueLesMoniteursMouseClicked
        FrmAdminGraphiqueMoniteur frm = new FrmAdminGraphiqueMoniteur();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminGraphiqueLesMoniteursMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        mdl = new ModelJTable();
        mdl2 = new ModelJTable();
        mdl3 = new ModelJTable();
        mdl4 = new ModelJTable();
        ctrlMoniteur = new CtrlMoniteur();
        ctrlVehicule = new CtrlVehicule();
        
        // Moniteur
        mdl.loadDatasMoniteurLePlusSollicite(ctrlMoniteur.getMoniteurLePlusSolicité());
        tblUnMoniteurSollicite.setModel(mdl);
        
        mdl2.loadDatasLesMoniteursLePlusSollicites(ctrlMoniteur.getLesMoniteursSolicités());
        tblLesMoniteursSollicites.setModel(mdl2);
        
        //Vehicule
        mdl3.loadDatasVehiculeLePlusSollicite(ctrlVehicule.getLeVehiculeLePlusSollicite());
        tblUnVehiculeSollicite.setModel(mdl3);
        
        mdl4.loadDatasLesVehiculeLesPlusSollicites(ctrlVehicule.getLesVehiculesLesPlusSollicites());
        tblLesVehiculesSollicites.setModel(mdl4);
    }//GEN-LAST:event_formWindowOpened

    private void btnAdminGraphiqueVehiculeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminGraphiqueVehiculeMouseClicked
        // TODO add your handling code here:
        FrmAdminGraphiqueVehicule frm= new FrmAdminGraphiqueVehicule();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminGraphiqueVehiculeMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAdminStatistiqueMoniteurEtVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminStatistiqueMoniteurEtVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminStatistiqueMoniteurEtVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminStatistiqueMoniteurEtVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminStatistiqueMoniteurEtVehicule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminGraphiqueLesMoniteurs;
    private javax.swing.JButton btnAdminGraphiqueVehicule;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblADminStatMoniteurVehicule;
    private javax.swing.JLabel lblLesMoniteursSollicites;
    private javax.swing.JLabel lblLesVehiculesSollicites;
    private javax.swing.JLabel lblUnMoniteurSollicité;
    private javax.swing.JLabel lblUnVehiculeSollicité;
    private javax.swing.JTable tblLesMoniteursSollicites;
    private javax.swing.JTable tblLesVehiculesSollicites;
    private javax.swing.JTable tblUnMoniteurSollicite;
    private javax.swing.JTable tblUnVehiculeSollicite;
    // End of variables declaration//GEN-END:variables
}
