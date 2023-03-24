/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ninou
 */
public class CtrlGraphique {
    
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlGraphique() {
        cnx = ConnexionBDD.getCnx();
    }
    
    public HashMap<Integer, Double> GetDatasGraphiqueMoniteurEvolutionCA(int numMoni)
    {
        HashMap<Integer, Double> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("SELECT YEAR(Date) AS anneebis, SUM(categorie.prix) AS moniteurCA \n" +
                                      "FROM lecon \n" +
                                      "JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation\n" +
                                      "JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie\n" +
                                      "WHERE CodeMoniteur = ? GROUP BY anneebis");
            ps.setInt(1, numMoni);
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getInt("anneebis"), rs.getDouble("moniteurCA"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }
    
    public HashMap<String, Double> GetDatasGraphiqueEleveLecon(int numEleve)
    {
       HashMap<String, Double> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("SELECT MONTH(Date) AS mois, COUNT(CodeLecon) AS eleveLecon \n" +
                                      "FROM lecon \n" +
                                      "JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation\n" +
                                      "JOIN categorie ON categorie.CodeCategorie = vehicule.CodeCategorie\n" +
                                      "WHERE CodeEleve = ? GROUP BY  mois ORDER BY  mois");
            ps.setInt(1, numEleve);
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("mois"), rs.getDouble("eleveLecon"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    } 
    
    public HashMap<String, Integer> GetDatasGraphiqueClassementMoniteur()
    {
        HashMap<String, Integer> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("SELECT moniteur.nom AS nom, COUNT(lecon.codeMoniteur) AS nombreLecons\n" +
                                      "FROM lecon\n" +
                                      "JOIN moniteur ON moniteur.CodeMoniteur = lecon.CodeMoniteur\n" +
                                      "GROUP BY moniteur.nom\n" +
                                      "ORDER BY nombreLecons DESC;");
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("nom"), rs.getInt("nombreLecons"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    } 
    
    public HashMap<String, Integer> GetDatasGraphiqueClassementVehicule()
    {
        HashMap<String, Integer> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("SELECT vehicule.Immatriculation AS Immatriculation, COUNT(lecon.Immatriculation) AS nombreutilisation\n" +
                                      "FROM lecon\n" +
                                      "JOIN vehicule ON vehicule.Immatriculation = lecon.Immatriculation\n" +
                                      "GROUP BY vehicule.Immatriculation\n" +
                                      "ORDER BY nombreutilisation DESC;");
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("Immatriculation"), rs.getInt("nombreutilisation"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    } 
    
}
