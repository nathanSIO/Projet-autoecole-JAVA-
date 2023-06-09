/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlMoniteur;
import Entities.Moniteur;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ninou
 */
public class FrmMoniteurCAetLecon extends javax.swing.JFrame {

    /**
     * Creates new form FrmMoniteurCAetLecon
     */
    CtrlMoniteur ctrlMoniteur;
    static Moniteur unMoniteur;
    public FrmMoniteurCAetLecon() {
        initComponents();
    }
    public FrmMoniteurCAetLecon(Moniteur moniteur) {
        initComponents();
        unMoniteur=moniteur;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitre = new javax.swing.JLabel();
        dcDateMoniteurCA = new com.toedter.calendar.JDateChooser();
        lblMoniteurDateCA = new javax.swing.JLabel();
        lblMoniteurCA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoniteurAfficheCA = new javax.swing.JTextPane();
        dcDateMoniteurCA2 = new com.toedter.calendar.JDateChooser();
        lblAu = new javax.swing.JLabel();
        btnVoirChiffreDAffaire = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitre.setText("Chiffre D'affaires sur une période ");

        lblMoniteurDateCA.setText("Choisir une Période:");

        lblMoniteurCA.setText("Ce jour là vous avez fait un chiffre d'affaires de : ");

        jScrollPane1.setViewportView(txtMoniteurAfficheCA);

        lblAu.setText("Au");

        btnVoirChiffreDAffaire.setText("Voir le chiffre d'affaires");
        btnVoirChiffreDAffaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoirChiffreDAffaireMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMoniteurDateCA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitre)
                                .addGap(131, 131, 131))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dcDateMoniteurCA, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dcDateMoniteurCA2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMoniteurCA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoirChiffreDAffaire)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitre)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcDateMoniteurCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcDateMoniteurCA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMoniteurDateCA)
                    .addComponent(lblAu))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoniteurCA)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnVoirChiffreDAffaire)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoirChiffreDAffaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoirChiffreDAffaireMouseClicked
        // TODO add your handling code here:
        if(dcDateMoniteurCA.getDate()== null){
            JOptionPane.showMessageDialog(this, "Sélectionner une première Date","Choix de la date 1",JOptionPane.WARNING_MESSAGE);
        }
        else if(dcDateMoniteurCA2.getDate()== null){
            JOptionPane.showMessageDialog(this, "Sélectionner une seconde Date","Choix de la date 2",JOptionPane.WARNING_MESSAGE);
        }
        else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(dcDateMoniteurCA.getDate());
            String date2 = sdf.format(dcDateMoniteurCA2.getDate());
            txtMoniteurAfficheCA.setText(String.valueOf(ctrlMoniteur.GetChiffreDAffaireMoni(date1,date2,unMoniteur.getCodeMoniteur())));
        }
        
    }//GEN-LAST:event_btnVoirChiffreDAffaireMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ctrlMoniteur = new CtrlMoniteur();
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
            java.util.logging.Logger.getLogger(FrmMoniteurCAetLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteurCAetLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteurCAetLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteurCAetLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMoniteurCAetLecon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoirChiffreDAffaire;
    private com.toedter.calendar.JDateChooser dcDateMoniteurCA;
    private com.toedter.calendar.JDateChooser dcDateMoniteurCA2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAu;
    private javax.swing.JLabel lblMoniteurCA;
    private javax.swing.JLabel lblMoniteurDateCA;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JTextPane txtMoniteurAfficheCA;
    // End of variables declaration//GEN-END:variables
}
