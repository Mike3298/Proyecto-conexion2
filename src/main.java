
import Controller.ConexionController;
import Modelos.Conexion;
import Vistas.Principal;
import Vistas.frmLogin;
import Vistas.frmPersonas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal VistaPrincipal=new Principal();
        frmLogin VistaLogin=new frmLogin(VistaPrincipal,true);
        frmPersonas frmPersonas = new frmPersonas(VistaPrincipal,true);
        Conexion ModeloConexion=new Conexion();
        frmPersonas VistaPersonas = null;
        ConexionController Controlador=new ConexionController(VistaLogin, VistaPrincipal, ModeloConexion,VistaPersonas);
        
        
        
        
        
    }
    
}
