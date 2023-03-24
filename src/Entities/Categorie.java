/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Rakotomalala Cédric
 */
public class Categorie {
    private int numCategorie;
    private String libelle;
    private double Prix;

    public Categorie(int unNumCategorie,String unLibelle,double unPrix){
        this.numCategorie=unNumCategorie;
        this.libelle=unLibelle;
        this.Prix=unPrix;
    }
    
    /**
     * @param numCategorie the numCategorie to set
     */
    public void setNumCategorie(int numCategorie) {
        this.numCategorie = numCategorie;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @param Prix the Prix to set
     */
    public void setPrix(double Prix) {
        this.Prix = Prix;
    }

    /**
     * @return the numCategorie
     */
    public int getNumCategorie() {
        return numCategorie;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @return the Prix
     */
    public double getPrix() {
        return Prix;
    }
    
}
