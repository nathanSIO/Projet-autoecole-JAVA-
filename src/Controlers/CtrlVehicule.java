/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Vehicule;
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
public class CtrlVehicule {
    private Connection Macnx;
    private PreparedStatement ps;
    private ResultSet rs;
    public CtrlVehicule(){
        Macnx = ConnexionBDD.getCnx();
    }
    public ArrayList<Vehicule> getAllVehicule(){
        ArrayList<Vehicule> lesVehicules= new ArrayList<>();
        try {
            ps=Macnx.prepareCall("Select Immatriculation ,Marque,Modele,Annee,CodeCategorie From vehicule");
            rs=ps.executeQuery();
            while(rs.next()){
                Vehicule unVehicule= new Vehicule(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                lesVehicules.add(unVehicule);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesVehicules;
    }
    
    
    public ArrayList<Vehicule> getAllVehiculeByCateg(int codeCateg){
        ArrayList<Vehicule> lesVehiculesId= new ArrayList<>();
        try {
            ps=Macnx.prepareStatement("Select Immatriculation ,Marque,Modele,Annee,CodeCategorie From vehicule where CodeCategorie = ?");
            ps.setInt(1, codeCateg);
            rs=ps.executeQuery();
            while(rs.next()){
                Vehicule unVehicule= new Vehicule(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                lesVehiculesId.add(unVehicule);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesVehiculesId;
    }
     
     
    public String getImmatriculationByModele (String modele){
           String imma="";
        try {
            ps=Macnx.prepareStatement("Select immatriculation from vehicule where modele = ?");
            ps.setString(1, modele);
            rs=ps.executeQuery();
            rs.next();
            imma = rs.getString(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
            return imma;
    }
     
    public int getCodeCateByModele(String modele){
         int codeCate=0;
         try {
            ps=Macnx.prepareStatement("Select codeCategorie from vehicule where modele = ?");
            ps.setString(1, modele);
            rs=ps.executeQuery();
            rs.next();
            codeCate = rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
            return codeCate;
    }
     
    public void addVehicule(String immatriculation, String marque, String modele, int annee, int categorie) {
        try {
            ps = Macnx.prepareStatement("INSERT INTO vehicule VALUES (?,?,?,?,?);");
            ps.setString(1, immatriculation);
            ps.setString(2, marque);
            ps.setString(3, modele);
            ps.setInt(4, annee);
            ps.setInt(5, categorie);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
