/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.RegistroLibro;
import vista.GUILibro;
import vista.GUISiBDI;
import vista.VentanaPrestamos;

/**
 *
 * @author Prado
 */
public class ControlSIBDI extends Manejador{
    
    private RegistroLibro registroLibro;
    
    public ControlSIBDI(){
    
        registroLibro=new RegistroLibro();
    
    }//fin del constructor
    
    public void actionPerformed(ActionEvent evento){
        
        if(evento.getActionCommand().equalsIgnoreCase(GUISiBDI.MENU_LIBRO)){
            GUILibro guiLibro=new GUILibro(registroLibro);
            guiLibro.show();
        
        
        }//fin del if
        
        if(evento.getActionCommand().equalsIgnoreCase(GUISiBDI.MENU_ESTUDIANTE)){
            
            VentanaPrestamos vP=new VentanaPrestamos();
            vP.show();
        
        
        }//fin del if estudiante
        
        if(evento.getActionCommand().equalsIgnoreCase(GUISiBDI.MENU_PRESTAMOS)){
            
            VentanaPrestamos ventanaP=new VentanaPrestamos();
            ventanaP.show();
        
        }//fin del if prestamos
        
        if(evento.getActionCommand().equalsIgnoreCase(GUISiBDI.MENU_SALIR)){
        
            System.exit(0);
        
        }//fin del if salir
    
      
    
    }
    
}
