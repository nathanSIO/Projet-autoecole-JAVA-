/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Categorie;
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
public class CtrlCategorie {
    private Connection maCnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlCategorie(){
        maCnx=ConnexionBDD.getCnx();
    }
    public ArrayList<Categorie> getAllCategorie(){
        ArrayList<Categorie>lesCategories = new ArrayList<>();
        try {
            ps=maCnx.prepareStatement("Select CodeCategorie,libelle,prix from Categorie");
            rs=ps.executeQuery();
            while(rs.next()){
                Categorie uneCategorie= new Categorie(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                lesCategories.add(uneCategorie);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lesCategories;
    }

    public int getIdCategorie(String libelle){ // Recuperer l'ID CATEGORIE par Libelle
        int idCat=0;
        try{
            ps=maCnx.prepareStatement("SELECT CodeCategorie FROM categorie WHERE Libelle = ?");
            ps.setString(1, libelle);
            rs=ps.executeQuery();
            
            rs.next();
            idCat = rs.getInt(1);
            
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idCat;
    }
    
    public Categorie getCategorie(int id) {
        Categorie categorie = null;

        try {
            ps = maCnx.prepareStatement("SELECT CodeCategorie, libelle, prix FROM categorie WHERE CodeCategorie = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            
            categorie = new Categorie(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return categorie;
    }
    
    public void addCategorie(String libelle, Double prix) {
        try {
            int lastCodeCategorie = this.getLastCodeCategorie();
            
            ps = maCnx.prepareStatement("INSERT INTO categorie VALUES (?,?,?);");
            ps.setInt(1, lastCodeCategorie);
            ps.setString(2, libelle);
            ps.setDouble(3, prix);
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getLastCodeCategorie() {;
        int lastCodeCategorie = 0;
        try {
            ps = maCnx.prepareStatement("SELECT codeCategorie + 1 AS CodeCategorie FROM categorie ORDER BY codeCategorie DESC LIMIT 1;");
            rs = ps.executeQuery();
            rs.next();
            lastCodeCategorie = rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastCodeCategorie;
    }
    
    public void editCategorie(String ancienLibelle ,String libelle, Double prix) {
        int codeCategorie = this.getIdCategorie(ancienLibelle);

        try {
            ps = maCnx.prepareStatement("UPDATE categorie SET libelle = ?, prix = ? WHERE codeCategorie = ?;");
            ps.setString(1, libelle);
            ps.setDouble(2, prix);
            ps.setInt(3, codeCategorie);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public ArrayList<Categorie> getCategorieNotMoniteur(int codeMoniteur){ // Fonction qui renvoie les catégories où le moniteur n'a pas de licence
        ArrayList<Categorie> lesCategories = new ArrayList<>();
        try {
            ps=maCnx.prepareStatement("SELECT DISTINCT(categorie.CodeCategorie), libelle, prix\n" +
                                      "from categorie\n" +
                                      "WHERE categorie.CodeCategorie NOT IN ( SELECT CodeCategorie \n" +
                                      "from licence\n" +
                                      "WHERE codeMoniteur = ?);");
            ps.setInt(1, codeMoniteur);
            rs=ps.executeQuery();
            while(rs.next()){
                Categorie uneCategorie= new Categorie(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                lesCategories.add(uneCategorie);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lesCategories;
    }
}
