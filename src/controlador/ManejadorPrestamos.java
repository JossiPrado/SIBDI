/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import vista.PanelPrestamos;
import vista.VentanaPrestamos;

/**
 *
 * @author usuario
 */

public class ManejadorPrestamos extends Manejador{
    
    PanelPrestamos panelP;
    VentanaPrestamos ventanaP;
    
    public ManejadorPrestamos(PanelPrestamos panelP,VentanaPrestamos ventanaP){
        
        this.panelP=panelP;
        this.ventanaP=ventanaP;
    
    
    }//fin del constructor
    
    public void actionPerformed(ActionEvent evento){
    
    if(evento.getActionCommand().equalsIgnoreCase(PanelPrestamos.BUSCAR)){
    
    
    }//fin del if buscar
    
    }//fin del metodo
    
}//fin de la clase
