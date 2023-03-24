/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author jacqu
 */
public class Lecon
{

    /**
     * @return the nomMoniteur
     */
    public String getNomMoniteur() {
        return nomMoniteur;
    }
    private int codeLecon;
    private Date Date;
    private String heure;
    private int CodeMoniteur,CodeEleve;
    private String immatriculation;
    private int Reglee;
    private String nomMoniteur;
    
    public Lecon(int codeLecon, Date uneDate, String heure, int codeMoniteur, int codeEleve,String immatriculation, int reglee)
    {
        this.codeLecon=codeLecon;
        this.Date=uneDate;
        this.heure=heure;
        this.CodeMoniteur=codeMoniteur;
        this.CodeEleve=codeEleve;
        this.immatriculation=immatriculation;
        this.Reglee=reglee;
        
    }
    /**
     * @return the codeLecon
     */
    public int getCodeLecon() {
        return codeLecon;
    }

    /**
     * @param codeLecon the codeLecon to set
     */
    public void setCodeLecon(int codeLecon) {
        this.codeLecon = codeLecon;
    }

    /**
     * @return the Date
     */
    public Date getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(Date Date) {
        this.Date = Date;
    }

    /**
     * @return the heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * @param heure the heure to set
     */
    public void setHeure(String heure) {
        this.heure = heure;
    }

    /**
     * @return the CodeMoniteur
     */
    public int getCodeMoniteur() {
        return CodeMoniteur;
    }

    /**
     * @param CodeMoniteur the CodeMoniteur to set
     */
    public void setCodeMoniteur(int CodeMoniteur) {
        this.CodeMoniteur = CodeMoniteur;
    }

    /**
     * @return the CodeEleve
     */
    public int getCodeEleve() {
        return CodeEleve;
    }

    /**
     * @param CodeEleve the CodeEleve to set
     */
    public void setCodeEleve(int CodeEleve) {
        this.CodeEleve = CodeEleve;
    }

    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @param immatriculation the immatriculation to set
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    /**
     * @return the Reglee
     */
    public int getReglee() {
        return Reglee;
    }

    /**
     * @param Reglee the Reglee to set
     */
    public void setReglee(int Reglee) {
        this.Reglee = Reglee;
    }
    
}
