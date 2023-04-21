/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Javier
 */
public class PersonaModell {
    
    String Apellidos, Nombre;
   int Telefono;
   Connection  miConexion;

    public PersonaModell(String Apellidos, String Nombre, int Telefono) {
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
   
   
   public void GuardarPersona(){
      try{
           Conexion nuevaConexion=new Conexion();
           this.miConexion= nuevaConexion.conectar(Nombre, Nombre);
           
           Statement sentencia = miConexion.createStatement();
           sentencia.execute("insert into Persona values('"+this.getApellidos()+"','"+this.getNombre()+"','"+this.getTelefono()+"')");
       }
      catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,"Error al insertar Registro.."+e.getMessage());
      }
   }
            
}
