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
public class Eleve {
    private int numEleve;
    private String nom,prenom;
    private int sexe;
    private Date dateDeNaissance;
    private String Adresse1;
    private int CodePostal;
    private String Ville,Telephone;
   
    public Eleve(int numEleve,String nom, String prenom,int sexe,Date DateDeNaissance, String Adresse1,int CodePostal,String Ville,String Telephone){
        this.numEleve=numEleve;
        this.nom=nom;
        this.prenom=prenom;
        this.sexe=sexe;
        this.dateDeNaissance=DateDeNaissance;
        this.Adresse1=Adresse1;
        this.CodePostal=CodePostal;
        this.Ville=Ville;
        this.Telephone=Telephone;
    }

    /**
     * @return the numEleve
     */
    public int getNumEleve() {
        return numEleve;
    }

    /**
     * @param numEleve the numEleve to set
     */
    public void setNumEleve(int numEleve) {
        this.numEleve = numEleve;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the sexe
     */
    public int getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the dateDeNaissance
     */
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @param dateDeNaissance the dateDeNaissance to set
     */
    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    /**
     * @return the Adresse1
     */
    public String getAdresse1() {
        return Adresse1;
    }

    /**
     * @param Adresse1 the Adresse1 to set
     */
    public void setAdresse1(String Adresse1) {
        this.Adresse1 = Adresse1;
    }

    /**
     * @return the CodePostal
     */
    public int getCodePostal() {
        return CodePostal;
    }

    /**
     * @param CodePostal the CodePostal to set
     */
    public void setCodePostal(int CodePostal) {
        this.CodePostal = CodePostal;
    }

    /**
     * @return the Ville
     */
    public String getVille() {
        return Ville;
    }

    /**
     * @param Ville the Ville to set
     */
    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    /**
     * @return the Telephone
     */
    public String getTelephone() {
        return Telephone;
    }

    /**
     * @param Telephone the Telephone to set
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }
            
}
