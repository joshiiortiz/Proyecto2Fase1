/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raul_
 */
public class Conexion {
    private Connection con;
    private Statement stm;
    private final String User = "neo4j";
    private final String Password = "neo4j1";
    
    static final String URL = "jdbc:neo4j:bolt://localhost";
    
    public Conexion(){
        try{
            con = DriverManager.getConnection(URL, User, Password);
            stm = con.createStatement();
        }catch(Exception e){
            System.out.println("plz senpai notice me!!!");  
            
        }
    }
    
    public void crearNodoPersonaYOLOSWAG42069PUSSYDESTROYER(Persona pers){
        try {
            stm.executeUpdate("CREATE{'"+ pers.getNombre()+"':Persona(nombre'" +pers.getNombre()+"',direccion'" +pers.getPersonalidad()+"'})");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void adoptarAmigo(Persona perso, Mascota masc){
        try {
            stm.executeUpdate("Match(x:Persona{nombre:'"+ perso.getNombre()+"'})Match(y:Mascota{raza:'"+masc.getRaza()+"'})merge(x)-[:AmoySenior]->(y)");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
