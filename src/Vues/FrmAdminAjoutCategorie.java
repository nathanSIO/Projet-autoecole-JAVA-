/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlCategorie;
import Tools.ConnexionBDD;
import javax.swing.JOptionPane;

/**
 *
 * @author ninou
 */
public class FrmAdminAjoutCategorie extends javax.swing.JFrame {

    CtrlCategorie ctrlCategorie;
    ConnexionBDD maCnx;
    /**
     * Creates new form FrmMoniteurAjoutLicence
     */
    public FrmAdminAjoutCategorie() {
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

        lblAdminAjoutCategorie = new javax.swing.JLabel();
        lblMoniteurCategoriePermis = new javax.swing.JLabel();
        lblMoniteurDateObtention = new javax.swing.JLabel();
        btnAdminAjoutCatégorie = new javax.swing.JButton();
        txtAdminNomCategorie = new javax.swing.JTextField();
        txtAdminPrixCategorie = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblAdminAjoutCategorie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminAjoutCategorie.setText("Ajoutez une catégorie");

        lblMoniteurCategoriePermis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMoniteurCategoriePermis.setText("Le nom de la Catégorie :");

        lblMoniteurDateObtention.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMoniteurDateObtention.setText("Le prix de la Catégorie : ");

        btnAdminAjoutCatégorie.setText("Ajouter la catégorie");
        btnAdminAjoutCatégorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminAjoutCatégorieMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdminAjoutCatégorie)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMoniteurCategoriePermis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMoniteurDateObtention, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdminNomCategorie)
                            .addComponent(txtAdminPrixCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAdminAjoutCategorie)))
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblAdminAjoutCategorie)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoniteurCategoriePermis)
                    .addComponent(txtAdminNomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoniteurDateObtention)
                    .addComponent(txtAdminPrixCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnAdminAjoutCatégorie)
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminAjoutCatégorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminAjoutCatégorieMouseClicked
        if (txtAdminNomCategorie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Le champ libellé ne peut pas être vide !","Saisie d'une catégorie",JOptionPane.WARNING_MESSAGE);
        } else if (txtAdminPrixCategorie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Le champ prix ne peut pas être vide !","Saisie d'une catégorie",JOptionPane.WARNING_MESSAGE);
        } else {
            ctrlCategorie.addCategorie(txtAdminNomCategorie.getText(), Double.valueOf(txtAdminPrixCategorie.getText()));
            JOptionPane.showMessageDialog(this, "La catégorie a été ajoutée");
        }
    }//GEN-LAST:event_btnAdminAjoutCatégorieMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrlCategorie = new CtrlCategorie();
        maCnx = new ConnexionBDD();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmAdminAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminAjoutCategorie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAjoutCatégorie;
    private javax.swing.JLabel lblAdminAjoutCategorie;
    private javax.swing.JLabel lblMoniteurCategoriePermis;
    private javax.swing.JLabel lblMoniteurDateObtention;
    private javax.swing.JTextField txtAdminNomCategorie;
    private javax.swing.JTextField txtAdminPrixCategorie;
    // End of variables declaration//GEN-END:variables
}