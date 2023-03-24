/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Lecon;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.sql.Date;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rakotomalala Cédric
 */
public class CtrlLecon {
    private Connection maCnx;
    private PreparedStatement ps ;
    private ResultSet rs;
    
    public CtrlLecon()
    {
        maCnx = ConnexionBDD.getCnx();
    }
    public ArrayList<Lecon> GetLeconByIdEleve(int numEleve){
         ArrayList<Lecon> mesLecons =  new ArrayList<>();
        try {
            ps= maCnx.prepareStatement("SELECT codeLecon,Date,heure,CodeMoniteur,CodeEleve,Immatriculation,reglee\n" +
                    "FROM lecon\n" +
                    "Where CodeEleve=? \n"+
                     "Order by DATE Desc");
            ps.setInt(1, numEleve);
            rs= ps.executeQuery();
            while(rs.next()){
                Lecon uneLecon= new Lecon(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getInt(4),rs.getInt (5),rs.getString(6),rs.getInt(7));
                mesLecons.add(uneLecon);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLecons;
    }
    public void AjouterLecon(String date, String heure,int codeMoniteur,int codeEleve,String imma, int regl){
        try {
            ps = maCnx.prepareStatement("insert into lecon values(?,?,?,?,?,?,?)");
            ps.setObject(1, null);
            ps.setString(2, date);
            ps.setString(3, heure);
            ps.setInt(4, codeMoniteur);
            ps.setInt(5, codeEleve);
            ps.setString(6, imma);
            ps.setInt(7, regl);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public float MontantTotalPermis(int numEleve, int codeCate){
        float montantT=0;
        try {
            ps=maCnx.prepareStatement("SELECT  (SELECT Count(CodeLecon) FROM lecon join vehicule on lecon.Immatriculation= vehicule.Immatriculation where codeEleve = ? and vehicule.codeCategorie= ?) * prix as MontantTotal\n" +
                    "from categorie\n" +
                    "where CodeCategorie = ?;");
            ps.setInt(1, numEleve);
            ps.setInt(2, codeCate);
            ps.setInt(3,codeCate);
//            ps.setInt(4,numEleve);
            rs = ps.executeQuery();
            rs.next();
            montantT = rs.getFloat(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return montantT;
        
    }
    public float MontantTotalPermisARegler(int numEleve, int codeCate){
        float montantT=0;
        try {
            ps=maCnx.prepareStatement("""
                                      SELECT  (SELECT Count(CodeLecon) FROM lecon join vehicule on lecon.Immatriculation= vehicule.Immatriculation where codeEleve = ? and vehicule.codeCategorie= ? and reglee=0) * prix as MontantTotal
                                      from categorie
                                      where CodeCategorie = ?;""");
            ps.setInt(1, numEleve);
            ps.setInt(2, codeCate);
            ps.setInt(3,codeCate);
//            ps.setInt(4,numEleve);
            rs = ps.executeQuery();
            rs.next();
            montantT = rs.getFloat(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return montantT;
        
    }
    public int nombreDeLeconParEleveEtPermisFini(int numEleve,int codeCate){
        int nbrLecon=0;
        try {
            ps=maCnx.prepareStatement("SELECT COUNT(CodeLecon)\n" +
                    "FROM lecon\n" +
                    "join vehicule on lecon.Immatriculation=vehicule.Immatriculation\n" +
                    "WHERE vehicule.codeCategorie=? and CodeEleve=? and Date <CURDATE();");
            ps.setInt(1, codeCate);
            ps.setInt(2,numEleve);
            rs=ps.executeQuery();
            rs.next();
            nbrLecon=rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
         return nbrLecon;      
    }
    public int nombreDeLeconParEleveEtPermisAfaire(int numEleve,int codeCate){
        int nbrLecon=0;
        try {
            ps=maCnx.prepareStatement("SELECT COUNT(CodeLecon)\n" +
                    "FROM lecon\n" +
                    "join vehicule on lecon.Immatriculation=vehicule.Immatriculation\n" +
                    "WHERE vehicule.codeCategorie=? and CodeEleve=? and Date > CURDATE();");
            ps.setInt(1, codeCate);
            ps.setInt(2,numEleve);
            rs=ps.executeQuery();
            rs.next();
            nbrLecon=rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
         return nbrLecon;      
    }
        public ArrayList<Lecon> GetLeconByIdMoniteur(int numMoniteur){
         ArrayList<Lecon> mesLecons =  new ArrayList<>();
        try {
            ps= maCnx.prepareStatement("SELECT codeLecon,Date,heure,CodeMoniteur,CodeEleve,Immatriculation,reglee\n" +
                    "FROM lecon\n" +
                    "Where CodeMoniteur=?\n"+
                     "Order by DATE Desc");
            ps.setInt(1, numMoniteur);
            rs= ps.executeQuery();
            while(rs.next()){
                Lecon uneLecon= new Lecon(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getInt(4),rs.getInt (5),rs.getString(6),rs.getInt(7));
                mesLecons.add(uneLecon);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLecons;
    }   
    public ArrayList<Lecon> getAllLecons() {
        ArrayList<Lecon> lesLecons = new ArrayList<>();
        
        try {
            ps= maCnx.prepareStatement("SELECT CodeLecon, Date, Heure, CodeMoniteur, CodeEleve, Immatriculation, Reglee FROM lecon;");
            rs= ps.executeQuery();
            while(rs.next()){
                Lecon lecon= new Lecon(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getInt(4),rs.getInt (5),rs.getString(6),rs.getInt(7));
                lesLecons.add(lecon);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLecons;
    }
    
    public Double getChiffreAffaires(Date dateDu, Date dateAu) {
        Double chiffreAffaires = 0.0;
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateDuFormatString = sdf.format(dateDu);
            String dateAuFormatString = sdf.format(dateAu);
            
            ps = maCnx.prepareStatement("SELECT SUM(categorie.Prix) AS chiffreAffaires FROM lecon JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie WHERE lecon.Date >= ? AND lecon.Date <= ?;");
            ps.setString(1, dateDuFormatString);
            ps.setString(2, dateAuFormatString);
            rs = ps.executeQuery();
            rs.next();
            chiffreAffaires = rs.getDouble(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return chiffreAffaires;
    }
      public Lecon verifInscripLecon(int numMoniteur,int codeEleve, String dateLecon,int codeCategorie ){ //Verifie si l'élève n'as pas déjà réservé une leçon le même jour avec le même moniteur pour la même catégorie de permis
          Lecon uneLecon = null;
            try {
                ps= maCnx.prepareStatement("SELECT codeLecon,Date,heure,CodeMoniteur,CodeEleve,lecon.Immatriculation,reglee\n"+
                    "FROM lecon\n"+
                    "join vehicule on lecon.Immatriculation=vehicule.Immatriculation\n"+
                    "Where CodeMoniteur = ? and codeEleve= ? and Date = ? and vehicule.Codecategorie=? \n"+
                   " limit 1;");
                ps.setInt(1, numMoniteur);
                ps.setInt(2, codeEleve);
                ps.setString(3, dateLecon);
                ps.setInt(4,codeCategorie);
                rs= ps.executeQuery();
                while(rs.next()){
                   uneLecon= new Lecon(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getInt(4),rs.getInt (5),rs.getString(6),rs.getInt(7));
                }
                ps.close();
                rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uneLecon;
      }
        
    public int getNombreDeLeconMoniteur(int numMoni){
        int nbrLeconMoniteur =0;
        try {
            ps=maCnx.prepareStatement("SELECT COUNT(CodeLecon) AS nombreLecon\n" +
                    "FROM lecon \n" +
                    "WHERE CodeMoniteur = ?;");
            ps.setInt(1, numMoni);
            rs=ps.executeQuery();
            rs.next();
            nbrLeconMoniteur= rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nbrLeconMoniteur;
    }
    public int getNombreDeLeconVehicule(String immatriculation){
        int nbrLeconVehicule = 0;
          try {
            ps=maCnx.prepareStatement("SELECT COUNT(CodeLecon) AS nombreLecon\n" +
                    "FROM lecon \n" +
                    "WHERE Immatriculation = ?;");
            ps.setString(1, immatriculation);
            rs=ps.executeQuery();
            rs.next();
            nbrLeconVehicule= rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
            return nbrLeconVehicule;
    }
        public int getNombreDeLeconCategorie(int codeCategorie){
        int nbrLeconCategorie = 0;
          try {
            ps=maCnx.prepareStatement("SELECT COUNT(CodeLecon)\n" +
                    "FROM lecon\n" +
                    "join vehicule on lecon.Immatriculation=vehicule.Immatriculation\n" +
                    "WHERE vehicule.codeCategorie=?;");
            ps.setInt(1, codeCategorie);
            rs=ps.executeQuery();
            rs.next();
            nbrLeconCategorie= rs.getInt(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
            return nbrLeconCategorie;
    }
    
}
