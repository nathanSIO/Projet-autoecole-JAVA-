/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Rakotomalala Cédric
 */
public class Vehicule {
    private String Immatriculation,Marque,Modele;
    private int Annee,CodeCategorie,nbrLecons;
    
    public Vehicule(String uneImmatriculation,String uneMarque,String unModele,int Annee,int unCodeCategorie){
        this.Immatriculation=uneImmatriculation;
        this.Marque=uneMarque;
        this.Modele=unModele;
        this.Annee=Annee;
        this.CodeCategorie=unCodeCategorie;
    }
    
    public Vehicule(String uneImmatriculation,int nbrLecons,String uneMarque,String unModele,int Annee,int unCodeCategorie){
        this.Immatriculation=uneImmatriculation;
        this.Marque=uneMarque;
        this.Modele=unModele;
        this.Annee=Annee;
        this.CodeCategorie=unCodeCategorie;
        this.nbrLecons = nbrLecons;
    }


    /**
     * @return the Immatriculation
     */
    public String getImmatriculation() {
        return Immatriculation;
    }

    /**
     * @return the Marque
     */
    public String getMarque() {
        return Marque;
    }

    /**
     * @return the Modele
     */
    public String getModele() {
        return Modele;
    }

    /**
     * @return the Annee
     */
    public int getAnnee() {
        return Annee;
    }

    /**
     * @return the CodeCategorie
     */
    public int getCodeCategorie() {
        return CodeCategorie;
    }
    public int getnbrLecons(){
        return nbrLecons;
    }
}
