/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Moniteur;
import Tools.ConnexionBDD;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rakotomalala Cédric
 */
public class CtrlMoniteur {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlMoniteur() {
    cnx = ConnexionBDD.getCnx();
    }
    public ArrayList<Moniteur> GetAllMoniteur(){
         ArrayList<Moniteur>LesMoniteurs = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("Select CodeMoniteur,nom,prenom,Sexe,DateDeNaissance,Adresse,CodePostal,Ville,Telephone from moniteur");
            rs= ps.executeQuery();
            while(rs.next()){
                Moniteur unMoniteur= new Moniteur(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                LesMoniteurs.add(unMoniteur);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LesMoniteurs;
    }
    public int getIdMoniteurByName(String nomM){
        int idMoni=0;
        try {
            ps=cnx.prepareStatement("""
                                    SELECT CodeMoniteur 
                                    FROM `moniteur`
                                    WHERE nom =?;""");
            ps.setString(1, nomM);
            rs=ps.executeQuery();
            while(rs.next()){
                idMoni=rs.getInt(1);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
     return idMoni;   
    }
    
    public String getNomMoniteurById(int codeMoniteur){
        String nomMoni="";
        try {
            ps=cnx.prepareStatement("""
                                    SELECT nom
                                    FROM `moniteur`
                                    WHERE CodeMoniteur=?;""");
            ps.setInt(1, codeMoniteur);
            rs=ps.executeQuery();
            while(rs.next()){
                nomMoni=rs.getString(1);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
     return nomMoni;  
    }
    public boolean trouverLicenceMoniteur(int numMoni,int codeCate){
        boolean trouver = false;
        try {
            ps=cnx.prepareStatement("Select CodeCategorie from licence where CodeMoniteur= ? ");
            ps.setInt(1, numMoni);
            rs=ps.executeQuery();
            while(rs.next() && !trouver){
                if(rs.getInt(1)== codeCate){
                    trouver = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trouver;
    }
    public int recupDernierIdLicence() {
        int derNumLicence=0;
        try {
            ps=cnx.prepareStatement("""
                                    Select CodeLicence
                                    FROM licence
                                    ORDER by CodeLicence DESC 
                                    limit 1""");
            rs = ps.executeQuery();
            rs.next();
            derNumLicence= rs.getInt(1);
            ps.close();
            rs.close();
            
            derNumLicence = derNumLicence + 1;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    return derNumLicence;
    }
    
       public void modifierMoniteur(int numMoniteur,String nom,String prenom,String dateDeNaiss,String Adresse,int CodePostal,String Ville,String Telephone, String mdp){
    try{
        ps=cnx.prepareStatement("UPDATE moniteur set nom = ?, prenom=?,dateDeNaissance= ?, Adresse = ?,CodePostal=?,Ville=?,telephone=?,password=? where codeMoniteur= ?");
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, dateDeNaiss);
            ps.setString(4, Adresse);
            ps.setInt(5, CodePostal);
            ps.setString(6, Ville);
            ps.setString(7, Telephone);
            ps.setString(8, mdp);
            ps.setInt(9, numMoniteur);
            ps.executeUpdate();
            ps.close();
    } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void ajoutLicenceMoniteur(int numLicence, int numMoniteur, int numCategorie, String dateObtention) {
        try {
            ps = cnx.prepareStatement("Insert into licence Values(?,?,?,?)");
            ps.setObject(1, numLicence);
            ps.setInt(2, numMoniteur);
            ps.setInt(3, numCategorie);
            ps.setString(4, dateObtention);
            ps.executeUpdate();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public Moniteur verifMoniteur(String login , String mdp){ //Connexion
    Moniteur moiMoniteur=null;
    try{
        ps=cnx.prepareStatement("""
                                SELECT CodeMoniteur,NOM,Prenom,Sexe,DateDeNaissance,Adresse,CodePostal,Ville,Telephone
                                FROM `moniteur`
                                WHERE Login=? and Password =? ;""");
        ps.setString(1, login);
        ps.setString(2, mdp);
        rs= ps.executeQuery();
        if(rs.next()){
            moiMoniteur= new Moniteur(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
        }
        ps.close();
        rs.close();
         } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    return moiMoniteur;
}
    public float GetChiffreDAffaireMoni(String date1,String date2,int numMoni){
        float CATotal=0;
        try {
            ps=cnx.prepareStatement("SELECT SUM(categorie.prix) AS moniteurCA \n" +
                    "FROM lecon \n" +
                    "JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation \n" +
                    "JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie \n" +
                    "WHERE lecon.Reglee = 1 AND CodeMoniteur = ? AND DATE BETWEEN ? AND ?;");
            ps.setInt(1, numMoni);
            ps.setString(2, date1);
            ps.setString(3,date2);
            rs=ps.executeQuery();
            rs.next();
            CATotal= rs.getFloat(1);
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
            return CATotal;
    }
    
    public void addMoniteur(String nom, String prenom, int sexe, Date dateDeNaissance, String adresse, int codePostal, String ville, String telephone, String identifiant, String motDePasse) {
        int codeMoniteur = getLastCodeMoniteur();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateDeNaissanceFormatString = sdf.format(dateDeNaissance);

            ps = cnx.prepareStatement("INSERT INTO moniteur VALUES(?,?,?,?,?,?,?,?,?,?,?);");
            ps.setInt(1, codeMoniteur);
            ps.setString(2, nom);
            ps.setString(3, prenom);
            ps.setInt(4, sexe);
            ps.setString(5, dateDeNaissanceFormatString);
            ps.setString(6, adresse);
            ps.setInt(7, codePostal);
            ps.setString(8, ville);
            ps.setString(9, telephone);
            ps.setString(10, identifiant);
            ps.setString(11, motDePasse);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getLastCodeMoniteur() {
        int lastCodeMoniteur = 0;
        try {
            ps = cnx.prepareStatement("SELECT codeMoniteur + 1 AS codeMoniteur FROM moniteur ORDER BY codeMoniteur DESC LIMIT 1;");
            rs = ps.executeQuery();
            rs.next();
            
            lastCodeMoniteur = rs.getInt(1);
            
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastCodeMoniteur;
    }
    public Moniteur getMoniteurLePlusSolicité(){
       Moniteur leMoniteur = null;
       try{
           ps = cnx.prepareStatement("SELECT moniteur.CodeMoniteur,COUNT(CodeLecon) as nbrLecons,nom,prenom,Sexe,DateDeNaissance,Adresse,CodePostal,ville,telephone\n" +
                                     "from moniteur \n" +
                                     "join lecon on moniteur.CodeMoniteur= lecon.CodeMoniteur\n" +
                                     "GROUP by moniteur.Nom\n" +
                                     "order by nbrLecons DESC\n" +
                                     "limit 1;");
           rs = ps.executeQuery();
           if(rs.next()){
              leMoniteur = new  Moniteur(rs.getInt(1), rs.getInt(2), rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
               
           }
           ps.close();
           rs.close();
           } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
       return leMoniteur;
   }
    public ArrayList<Moniteur> getLesMoniteursSolicités(){
       ArrayList<Moniteur> lesMoniteurs = new ArrayList<>();
       try{
           ps = cnx.prepareStatement("SELECT moniteur.CodeMoniteur,COUNT(CodeLecon) as nbrLecons,nom,prenom,Sexe,DateDeNaissance,Adresse,CodePostal,ville,telephone\n" +
                                     "from moniteur \n" +
                                     "join lecon on moniteur.CodeMoniteur= lecon.CodeMoniteur\n" +
                                     "GROUP by moniteur.Nom\n" +
                                     "order by nbrLecons DESC\n");
           rs = ps.executeQuery();
           while(rs.next()){
               Moniteur leMoniteur = new  Moniteur(rs.getInt(1), rs.getInt(2), rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
               lesMoniteurs.add(leMoniteur);
           }
           ps.close();
           rs.close();
           } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
       return lesMoniteurs;
   }
    
   public Moniteur getMoniteurById(int codeMoniteur){
        Moniteur moiMoniteur=null;
    try{
        ps=cnx.prepareStatement("""
                                SELECT CodeMoniteur,NOM,Prenom,Sexe,DateDeNaissance,Adresse,CodePostal,Ville,Telephone
                                FROM `moniteur`
                                WHERE CodeMoniteur = ? ;""");
        ps.setInt(1, codeMoniteur);
        rs= ps.executeQuery();
        if(rs.next()){
            moiMoniteur= new Moniteur(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
        }
        ps.close();
        rs.close();
         } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    return moiMoniteur;
   }
   public String md5(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(message.getBytes());
        BigInteger bigInt = new BigInteger(1, messageDigest);
        return bigInt.toString(16);
    }
    
}
