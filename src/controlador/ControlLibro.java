/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Libro;
import modelo.RegistroLibro;
import vista.GUIReporte;
import vista.GUILibro;
import vista.PanelBotones;
import vista.PanelDataLibro;
import vista.Reporte;

/**
 *
 * @author Prado
 */
public class ControlLibro implements ActionListener{
    
    private PanelBotones panelBotones;
    private PanelDataLibro panelDataLibro;
    private RegistroLibro registro;
    private Libro libro;
    private GUILibro guiLibro;
    
    public ControlLibro(PanelDataLibro panelDataLibro,PanelBotones panelBotones,RegistroLibro registro,GUILibro guiLibro){
        
        this.panelBotones=panelBotones;
        this.panelDataLibro=panelDataLibro;
        this.registro=registro;
        this.libro=libro;
        this.guiLibro=guiLibro;
    
    }
    
    public void actionPerformed(ActionEvent evento){
        
        if(evento.getActionCommand().equals(panelBotones.BTN_AGREGAR)){
            
             if(panelDataLibro.getTxtID().equals("")){
               
               GUILibro.mensaje("Debe agregar el ID del Libro");
           
           }//fin del if
             
            else if(panelDataLibro.getTxtTitulo().equals("")){
               
               GUILibro.mensaje("Debe agregar el titulo del Libro");
           
           }//fin del else if  
           
           else if(panelDataLibro.getTxtAutor().equals("")){
               
               GUILibro.mensaje("Debe agregar el autor del Libro");
           
           
           }//fin del else if
             
           else if(panelDataLibro.getTxtEdicion().equals("")){
               
               GUILibro.mensaje("Debe agregar la edicion del Libro");
           
           }//fin del else if  
             
          else if(panelDataLibro.getTxtEditorial().equals("")){
               
               GUILibro.mensaje("Debe agregar la editorial del Libro");
           
           }//fin del else if  
               
          
          else if(panelDataLibro.getTxtCategoria().equals("")){
              
                GUILibro.mensaje("Debe agregar la categoria del Libro");
          
          }//fin del else if
        
         
          else{
              
              String iD=panelDataLibro.getTxtID();
              String autor=panelDataLibro.getTxtAutor();
              String titulo=panelDataLibro.getTxtTitulo();
              String edicion=panelDataLibro.getTxtEdicion();
              String editorial=panelDataLibro.getTxtEditorial();
              String categoria=panelDataLibro.getTxtCategoria();
              
              libro=new Libro(titulo,autor,iD,edicion,editorial,categoria);
              
              GUILibro.mensaje(registro.agregarLibro(libro));
              panelDataLibro.limpiar();
              
          
          
          
          }//fin del else    
        
        }//fin del if
        
         if(evento.getActionCommand().equals(panelDataLibro.BTN_BUSCAR)){
             
             Libro libro=registro.buscarLibro(panelDataLibro.getTxtID());
             
             if(libro!=null){
             
             panelDataLibro.setTxtAutor(libro.getAutor());
             panelDataLibro.setTxtTitulo(libro.getTitulo());
             panelDataLibro.setTxtEdicion(libro.getEdicion());
             panelDataLibro.setTxtEditorial(libro.getEditorial());
             panelDataLibro.setTxtCategoria(libro.getCategoria());
             panelBotones.activarBotones(true);
             
             }
             
             else{
                 
                 GUILibro.mensaje("El libro no se encuentra registrado");
             
             }//fin del else
    
       
        }//fin del if buscar
        
        if(evento.getActionCommand().equals(panelBotones.BTN_MODIFICAR)){
            
            JOptionPane.showMessageDialog(null,"");
            panelBotones.setEnabled(false);
        
        
        }//fin del if
          
        if(evento.getActionCommand().equals(panelBotones.BTN_ELIMINAR)){
            
            GUILibro.mensaje(registro.eliminarLibro(panelDataLibro.getTxtID()));
            panelBotones.setEnabled(false);
            
         
        }//fin del if 
        
        if(evento.getActionCommand().equals(panelBotones.BTN_CONSULTAR)){
            
            //GUIReporte reporte=new GUIReporte();
            //reporte.setReporte(registro.consultarLibros());
            Reporte reporte=new Reporte();
            reporte.getPanelTabla().llenarTabla(registro.getMatriz(),Libro.getEtiquetas());
            //reporte.setVisible(true);
            reporte.show();
            
        
        
        }//fin del if
        
        if(evento.getActionCommand().equals(panelBotones.BTN_SALIR)){
             
            guiLibro.dispose();
            
        }//fin del if
    
    }
    
}
