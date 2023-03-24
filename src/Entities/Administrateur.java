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
public class Administrateur {
    private int numAdmin;
    private String nom,prenom;
    private int sexe;
    private Date dateDeNaissance;
    private String Adresse1;
    private int CodePostal;
    private String Ville,Telephone;
    public Administrateur(int codeAdmin,String nom, String prenom,int sexe,Date DateDeNaissance, String Adresse1,int CodePostal,String Ville,String Telephone){
        this.numAdmin=codeAdmin;
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
    
}
