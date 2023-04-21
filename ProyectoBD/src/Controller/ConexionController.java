/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelos.Conexion;
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author umg
 */
public class ConexionController implements ActionListener {
    
    frmLogin VistaLogin;
   Principal VistaPrincipal;
   Conexion ModelConexion;

    public ConexionController(frmLogin VistaLogin, Principal VistaPrincipal, Conexion ModelConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModelConexion = ModelConexion;
        
        this.VistaPrincipal.setExtendedState(Principal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);

    }
   //levantar formulario princupal
       @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.VistaLogin.btnAceptar){
            
            this.ModelConexion.conectar(this.VistaLogin.txtUser.getText(),
                    this.VistaLogin.txtPass.getText());
            
            
        }
    }
    
}
