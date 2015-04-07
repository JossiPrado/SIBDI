/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Prado
 */
public abstract class Manejador implements ActionListener {
    
    public abstract void actionPerformed(ActionEvent e);
    
}//fin de la clase
