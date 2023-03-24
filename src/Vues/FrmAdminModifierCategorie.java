/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlCategorie;
import Entities.Categorie;
import javax.swing.JOptionPane;

/**
 *
 * @author ninou
 */
public class FrmAdminModifierCategorie extends javax.swing.JFrame {
    
    CtrlCategorie ctrlCategorie;
    /**
     * Creates new form FrmMoniteurAjoutLicence
     */
    public FrmAdminModifierCategorie() {
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
        cboAdminNomCategorie = new javax.swing.JComboBox<>();
        lblAdminCboCategorie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblAdminAjoutCategorie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminAjoutCategorie.setText("Modifiez une catégorie");

        lblMoniteurCategoriePermis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMoniteurCategoriePermis.setText("Le nom de la Catégorie :");

        lblMoniteurDateObtention.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMoniteurDateObtention.setText("Le prix de la Catégorie : ");

        btnAdminAjoutCatégorie.setText("Modifier la catégorie");
        btnAdminAjoutCatégorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminAjoutCatégorieMouseClicked(evt);
            }
        });

        cboAdminNomCategorie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAdminNomCategorieItemStateChanged(evt);
            }
        });

        lblAdminCboCategorie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAdminCboCategorie.setText("Choissisez une Catégorie :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnAdminAjoutCatégorie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdminAjoutCategorie)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMoniteurCategoriePermis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMoniteurDateObtention, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdminCboCategorie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboAdminNomCategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdminNomCategorie)
                    .addComponent(txtAdminPrixCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblAdminAjoutCategorie)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAdminNomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdminCboCategorie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoniteurCategoriePermis)
                    .addComponent(txtAdminNomCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoniteurDateObtention)
                    .addComponent(txtAdminPrixCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdminAjoutCatégorie)
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrlCategorie = new CtrlCategorie();
        
        for (Categorie categorie : ctrlCategorie.getAllCategorie()) {
            cboAdminNomCategorie.addItem(categorie.getLibelle());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAdminAjoutCatégorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminAjoutCatégorieMouseClicked
        ctrlCategorie.editCategorie(cboAdminNomCategorie.getSelectedItem().toString(), txtAdminNomCategorie.getText(), Double.valueOf(txtAdminPrixCategorie.getText()));
        JOptionPane.showMessageDialog(this, "Modification de la catégorie a été prise en compte");
    }//GEN-LAST:event_btnAdminAjoutCatégorieMouseClicked

    private void cboAdminNomCategorieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAdminNomCategorieItemStateChanged
        Categorie categorie = ctrlCategorie.getCategorie(ctrlCategorie.getIdCategorie(cboAdminNomCategorie.getSelectedItem().toString()));
        
        txtAdminNomCategorie.setText(categorie.getLibelle());
        txtAdminPrixCategorie.setText(Double.toString(categorie.getPrix()));
    }//GEN-LAST:event_cboAdminNomCategorieItemStateChanged

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
            java.util.logging.Logger.getLogger(FrmAdminModifierCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminModifierCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminModifierCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminModifierCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmAdminModifierCategorie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAjoutCatégorie;
    private javax.swing.JComboBox<String> cboAdminNomCategorie;
    private javax.swing.JLabel lblAdminAjoutCategorie;
    private javax.swing.JLabel lblAdminCboCategorie;
    private javax.swing.JLabel lblMoniteurCategoriePermis;
    private javax.swing.JLabel lblMoniteurDateObtention;
    private javax.swing.JTextField txtAdminNomCategorie;
    private javax.swing.JTextField txtAdminPrixCategorie;
    // End of variables declaration//GEN-END:variables
}
