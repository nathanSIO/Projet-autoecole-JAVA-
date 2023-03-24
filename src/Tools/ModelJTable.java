/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;


import Controlers.CtrlEleve;
import Controlers.CtrlMoniteur;
import Entities.Eleve;
import Entities.Lecon;
import Entities.Moniteur;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rakotomalala Cédric
 */
public class ModelJTable extends AbstractTableModel
{
    String[] colonnes;
    Object[][] lignes; 
    CtrlMoniteur CtrlMoniteur;
    CtrlEleve CtrlEleve;
    
    @Override
    public int getRowCount() {
       return lignes.length;
    }

    @Override
    public int getColumnCount() {
       return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return lignes[rowIndex][columnIndex];
        
    }
    @Override
    public String getColumnName(int column){
        return colonnes[column];
    }
    
    public void LoadDatasLecon(ArrayList<Lecon> mesLecons) // Les leçons d'un élève
    {
        // Remplir tableaux colonnes
        CtrlMoniteur= new CtrlMoniteur();
        colonnes = new String []{" Moniteur" , "Date","Heure","Véhicule"};
        lignes = new  Object[mesLecons.size()][4];
        // Remplir le tableau lignes
        int i =0;
        for (Lecon uneLecon : mesLecons)
        {
            lignes[i][0]= CtrlMoniteur.getNomMoniteurById(uneLecon.getCodeMoniteur());
            lignes[i][1]= uneLecon.getDate();
            lignes[i][2]= uneLecon.getHeure();
            lignes[i][3]= uneLecon.getImmatriculation();
            i++;
        }
        //Mettre à jour le JTABLE dans l'interface graphique
        fireTableChanged(null);
    }
    
     public void loadDatasPlanningMoniteur(ArrayList<Lecon> mesLecons)
    {
        CtrlEleve = new CtrlEleve();
        colonnes = new String[]{"Eleve", "Date" , "Heure", "Véhicule"};
        lignes = new Object [mesLecons.size()][4];
        int i =0;
        for (Lecon uneLeconEleve : mesLecons)
        {
            lignes[i][0]= CtrlEleve.getNomEleveById(uneLeconEleve.getCodeEleve());
            lignes[i][1]= uneLeconEleve.getDate();
            lignes[i][2]= uneLeconEleve.getHeure();
            lignes[i][3]= uneLeconEleve.getImmatriculation();
            i++;
        }
        fireTableDataChanged();
    }
     public void loadDatasAllEleve (ArrayList<Eleve> lesEleves)
     {
        colonnes = new String[]{"CodeEleve","nom","prenom","Sexe","DateDeNaissance","Adresse","CodePostal","Ville","Telephone"};
        lignes = new Object [lesEleves.size()][9];
        int i =0;
        for (Eleve unEleve : lesEleves)
        {
            lignes[i][0]= unEleve.getNumEleve();
            lignes[i][1]= unEleve.getNom();
            lignes[i][2]= unEleve.getPrenom();
            lignes[i][3]= unEleve.getSexe();
            lignes[i][4]= unEleve.getDateDeNaissance();
            lignes[i][5]= unEleve.getAdresse1();
            lignes[i][6]= unEleve.getCodePostal();
            lignes[i][7]= unEleve.getVille();
            lignes[i][8]= unEleve.getTelephone();
            i++;
        }
        fireTableDataChanged();
     }
     
     public void loadDatasAllMoniteur (ArrayList<Moniteur> lesMoniteurs)
     {
        colonnes = new String[]{"CodeMoniteur","nom","prenom","Sexe","DateDeNaissance","Adresse","CodePostal","Ville","Telephone"};
        lignes = new Object [lesMoniteurs.size()][9];
        int i =0;
        for (Moniteur unMoniteur : lesMoniteurs)
        {
            lignes[i][0]= unMoniteur.getCodeMoniteur();
            lignes[i][1]= unMoniteur.getNom();
            lignes[i][2]= unMoniteur.getPrenom();
            lignes[i][3]= unMoniteur.getSexe();
            lignes[i][4]= unMoniteur.getDateDeNaissance();
            lignes[i][5]= unMoniteur.getAdresse();
            lignes[i][6]= unMoniteur.getCodePostal();
            lignes[i][7]= unMoniteur.getVille();
            lignes[i][8]= unMoniteur.getTelephone();
            i++;
        }
        fireTableDataChanged();
     }

}