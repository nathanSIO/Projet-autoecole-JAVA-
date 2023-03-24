/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Administrateur;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tahiri
 */
public class CtrlAdministrateur {
    private Connection maCnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlAdministrateur(){
        maCnx = ConnexionBDD.getCnx();
    }
    
    public Administrateur verifAdministrateur(String login, String password) {
        Administrateur administrateur = null;
        try{
            ps = maCnx.prepareStatement("SELECT CodeAdministrateur,NOM,Prenom,Sexe,DateDeNaissance,Adresse,CodePostal,Ville,Telephone FROM `administrateur` WHERE Login=? and Password =? ;");
            ps.setString(1, login);
            ps.setString(2, password);
            rs= ps.executeQuery();
            if(rs.next()){
                administrateur = new Administrateur(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
            }
            ps.close();
            rs.close();
             } catch (SQLException ex) {
                Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
            }
        return administrateur;
    }
}
