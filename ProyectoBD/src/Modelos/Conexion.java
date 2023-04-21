/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Conexion {
    
    Connection Conexion;
    
    public Connection conectar(String user, String pass){
        
        try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        
        String nombre_servidor="168.234.74.80";
        String numero_puerto="1521";
        String sid="umg";
        String url="jdbc:oracle:thin:@"+nombre_servidor+":"+numero_puerto+":"+sid;
        
        Conexion=DriverManager.getConnection(url,user,pass);
       // return Conexion;
        JOptionPane.showMessageDialog(null,"Conexion Exitosa");
          return Conexion;
          
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Fallo En La Conexion"+ e);
        
    }
        
        return Conexion;
}
}

