/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlEleve;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ninou
 */
public class FrmEleveInscription extends javax.swing.JFrame {

    /**
     * Creates new form FrmEleveInscription
     */
    CtrlEleve ctrlEleve;
    public FrmEleveInscription() {
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

        lblEleveInscription = new javax.swing.JLabel();
        lblElevePrenom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblEleveDateDeNaissance = new javax.swing.JLabel();
        lblEleveAdresse = new javax.swing.JLabel();
        lblEleveRue = new javax.swing.JLabel();
        lblEleveCodePostale = new javax.swing.JLabel();
        lblEleveVille = new javax.swing.JLabel();
        lblEleveNumeroTelephone = new javax.swing.JLabel();
        lblEleveMail = new javax.swing.JLabel();
        btnEleveInscription = new javax.swing.JButton();
        txtEleveNom = new javax.swing.JTextField();
        txtElevePrenom = new javax.swing.JTextField();
        txtEleveInfoRue = new javax.swing.JTextField();
        txtEleveCodePostale = new javax.swing.JTextField();
        txtEleveVille = new javax.swing.JTextField();
        txtEleveNumeroTelephone = new javax.swing.JTextField();
        dcDateDeNaiss = new com.toedter.calendar.JDateChooser();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMdp = new javax.swing.JTextField();
        cboSexe = new javax.swing.JComboBox<>();
        lblMdpConfirmer = new javax.swing.JLabel();
        txtMdpConfirmer = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblEleveInscription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEleveInscription.setText("S'inscrire");

        lblElevePrenom.setText("Nom :");

        jLabel1.setText("Prénom :");

        lblEleveDateDeNaissance.setText("Date de naissance :");

        lblEleveAdresse.setText("Adresse :");

        lblEleveRue.setText("Numéro et nom de la rue :");

        lblEleveCodePostale.setText("Code postale :");

        lblEleveVille.setText("Ville :");

        lblEleveNumeroTelephone.setText("Numéro de téléphone :");

        lblEleveMail.setText("Sexe :");

        btnEleveInscription.setText("S'inscrire");
        btnEleveInscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEleveInscriptionMouseClicked(evt);
            }
        });

        lblLogin.setText("Votre login :");

        jLabel2.setText("Votre mot de passe :");

        cboSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        lblMdpConfirmer.setText("Confirmer le mot de passe :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblElevePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEleveDateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEleveAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEleveMail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEleveNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblMdpConfirmer)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEleveRue, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEleveVille, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEleveCodePostale, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEleveNom)
                        .addComponent(txtElevePrenom)
                        .addComponent(txtEleveInfoRue)
                        .addComponent(txtEleveCodePostale)
                        .addComponent(txtEleveVille)
                        .addComponent(txtEleveNumeroTelephone)
                        .addComponent(dcDateDeNaiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addComponent(txtMdp)
                        .addComponent(txtMdpConfirmer))
                    .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(lblEleveInscription))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnEleveInscription)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEleveInscription)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblElevePrenom)
                            .addComponent(txtEleveNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtElevePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEleveDateDeNaissance))
                    .addComponent(dcDateDeNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEleveAdresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEleveRue)
                            .addComponent(txtEleveInfoRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEleveCodePostale)
                            .addComponent(txtEleveCodePostale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEleveVille)
                            .addComponent(txtEleveVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEleveNumeroTelephone)
                            .addComponent(txtEleveNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblEleveMail))
                    .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMdpConfirmer)
                    .addComponent(txtMdpConfirmer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEleveInscription)
                .addGap(9, 9, 9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEleveInscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEleveInscriptionMouseClicked
        // TODO add your handling code here:
        if(txtEleveNom.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir un Nom","Choix du nom",JOptionPane.WARNING_MESSAGE);
        }
        else if(dcDateDeNaiss.getDate()== null){
            JOptionPane.showMessageDialog(this, "Sélectionner une Date","Choix de la date",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtElevePrenom.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir un Prénom","Choix du Prénom",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtEleveInfoRue.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir une adresse","Choix de l'adresse",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtEleveCodePostale.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir un code postale","Choix du Code postale",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtEleveVille.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir une ville","Choix de la ville",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtEleveNumeroTelephone.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir un numéro de téléphone","Choix du numéro",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtLogin.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir un login","Choix du login",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtMdp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez Saisir un mdp","Choix du mdp",JOptionPane.WARNING_MESSAGE);
        }
        else if(!txtMdp.getText().equals(txtMdpConfirmer.getText())){
            JOptionPane.showMessageDialog(this, "L'un des mots de passe est incorrecte","Erreur saisie de mdp",JOptionPane.WARNING_MESSAGE);
        }
        else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateNaiss = sdf.format(dcDateDeNaiss.getDate());
            
            int numEleve = ctrlEleve.recupDernierIdEleve() +1 ;
            int sexe= 0 ;
            if("Femme".equals(cboSexe.getSelectedItem().toString())){
                sexe=1;
            }
            ctrlEleve.ajouterEleve(numEleve,txtEleveNom.getText(), txtElevePrenom.getText(),sexe, dateNaiss, txtEleveInfoRue.getText(), Integer.parseInt(txtEleveCodePostale.getText()), txtEleveVille.getText(), txtEleveNumeroTelephone.getText(),txtLogin.getText(), txtMdp.getText());
             JOptionPane.showMessageDialog(this, "Votre inscription est faite");
        }
    }//GEN-LAST:event_btnEleveInscriptionMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ctrlEleve = new CtrlEleve();
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
            java.util.logging.Logger.getLogger(FrmEleveInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEleveInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEleveInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEleveInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEleveInscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEleveInscription;
    private javax.swing.JComboBox<String> cboSexe;
    private com.toedter.calendar.JDateChooser dcDateDeNaiss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEleveAdresse;
    private javax.swing.JLabel lblEleveCodePostale;
    private javax.swing.JLabel lblEleveDateDeNaissance;
    private javax.swing.JLabel lblEleveInscription;
    private javax.swing.JLabel lblEleveMail;
    private javax.swing.JLabel lblEleveNumeroTelephone;
    private javax.swing.JLabel lblElevePrenom;
    private javax.swing.JLabel lblEleveRue;
    private javax.swing.JLabel lblEleveVille;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMdpConfirmer;
    private javax.swing.JTextField txtEleveCodePostale;
    private javax.swing.JTextField txtEleveInfoRue;
    private javax.swing.JTextField txtEleveNom;
    private javax.swing.JTextField txtEleveNumeroTelephone;
    private javax.swing.JTextField txtElevePrenom;
    private javax.swing.JTextField txtEleveVille;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtMdp;
    private javax.swing.JTextField txtMdpConfirmer;
    // End of variables declaration//GEN-END:variables
}
