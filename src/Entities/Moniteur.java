/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author ninou
 */
public class Moniteur {
    private int CodeMoniteur;
    private String nom,prenom;
    private int sexe;
    private Date DateDeNaissance;
    private String Adresse,CodePostal,Ville,Telephone;
    
    public Moniteur (int CodeMoniteur,String nom,String Prenom,int unSexe,Date uneDateDeNaissance,String uneAdresse,String unCodePostal,String uneVille,String unTelephone){
        this.CodeMoniteur=CodeMoniteur;
        this.nom=nom;
        this.prenom=Prenom;
        this.sexe=unSexe;
        this.DateDeNaissance=uneDateDeNaissance;
        this.Adresse=uneAdresse;
        this.CodePostal=unCodePostal;
        this.Ville=uneVille;
        this.Telephone=unTelephone;
    }

    /**
     * @return the CodeMoniteur
     */
    public int getCodeMoniteur() {
        return CodeMoniteur;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the sexe
     */
    public int getSexe() {
        return sexe;
    }

    /**
     * @return the DateDeNaissance
     */
    public Date getDateDeNaissance() {
        return DateDeNaissance;
    }

    /**
     * @return the Adresse
     */
    public String getAdresse() {
        return Adresse;
    }

    /**
     * @return the CodePostal
     */
    public String getCodePostal() {
        return CodePostal;
    }

    /**
     * @return the Ville
     */
    public String getVille() {
        return Ville;
    }

    /**
     * @return the Telephone
     */
    public String getTelephone() {
        return Telephone;
    }
}
