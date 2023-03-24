/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;
import Entities.Eleve;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rakotomalala Cédric
 */
public class CtrlEleve {
    private Connection maCnx;
    private PreparedStatement ps ;
    private ResultSet rs;
    
public CtrlEleve() {
    maCnx = ConnexionBDD.getCnx();
}

public ArrayList<Eleve> getAllEleve(){
     ArrayList<Eleve> LesEleves = new ArrayList<>();
        try {
            ps = maCnx.prepareStatement("Select CodeEleve,nom,prenom,Sexe,DateDeNaissance,Adresse,CodePostal,Ville,Telephone from eleve");
            rs= ps.executeQuery();
            while(rs.next()){
                Eleve unEleve= new Eleve(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                LesEleves.add(unEleve);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LesEleves;
}

public void ajouterEleve(int numEleve,String nom,String prenom,int Sexe ,String dateDeNaiss,String Adresse,int CodePostal,String Ville,String Telephone,String login,String mdp){
        try {
            ps = maCnx.prepareStatement("Insert into eleve Values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setObject(1, numEleve);
            ps.setString(2, nom);
            ps.setString(3, prenom);
            ps.setInt(4, Sexe);
            ps.setString(5, dateDeNaiss);
            ps.setString(6, Adresse);
            ps.setInt(7, CodePostal);
            ps.setString(8, Ville);
            ps.setString(9, Telephone);
            ps.setString(10, login);
            ps.setString(11, mdp);
            ps.executeUpdate();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void modifierEleve(int numEleve,String nom,String prenom,String dateDeNaiss,String Adresse,int CodePostal,String Ville,String Telephone){
    try{
        ps=maCnx.prepareStatement("UPDATE eleve set nom = ?, prenom=?,dateDeNaissance= ?, Adresse = ?,CodePostal=?,Ville=?,telephone=? where codeEleve= ?");
        ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, dateDeNaiss);
            ps.setString(4, Adresse);
            ps.setInt(5, CodePostal);
            ps.setString(6, Ville);
            ps.setString(7, Telephone);
            ps.setInt(8, numEleve);
            ps.executeUpdate();
            ps.close();
             } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public Eleve verifEleve(String login , String mdp){
    Eleve moiEleve=null;
    try{
        ps=maCnx.prepareStatement("SELECT CodeEleve,NOM,Prenom,Sexe,DateDeNaissance,Adresse,CodePostal,Ville,Telephone\n" +
        "FROM `eleve`\n" +
        "WHERE Login=? and Password =? ;");
        ps.setString(1, login);
        ps.setString(2, mdp);
        rs= ps.executeQuery();
        if(rs.next()){
            moiEleve= new Eleve(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9) );
        }
        ps.close();
        rs.close();
         } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    return moiEleve;
}

public int recupDernierIdEleve(){
    int derNumEleve=0;
        try {
            ps=maCnx.prepareStatement("Select CodeEleve FROM eleve ORDER by CodeEleve DESC limit 1");
            rs = ps.executeQuery();
            rs.next();
            derNumEleve= rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    return derNumEleve;
}

public String getNomEleveById(int codeEleve){
        String nomEleve="";
        try {
            ps=maCnx.prepareStatement("SELECT nom FROM `eleve` WHERE CodeEleve=?;");
            ps.setInt(1, codeEleve);
            rs=ps.executeQuery();
            while(rs.next()){
                nomEleve=rs.getString(1);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
     return nomEleve; 
}

}