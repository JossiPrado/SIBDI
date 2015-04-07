/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class RegistroEstudiante {
    
    private ArrayList<Estudiante>arregloEstudiante;


  public RegistroEstudiante( ) {
        
      this.arregloEstudiante = new ArrayList<Estudiante>();

    }//fin del constructor
  
  
  public String agregarEstudiante(Estudiante estudiante){
  
      String salida="";
      
      if(estudiante!=null){
          
          if(verificarCarnet(estudiante.getCarnet())){
              
              arregloEstudiante.add(estudiante);
              salida="El estudiante ha sido registrado con exito";
          
          
          }//fin del if
          
          else{
              
              salida="El estudiante ya ha sido registrado";
          
          
          }//fin del else    
      
      
      }//fin del if
      
      else{
          
          salida="El estudiante no existe";
      
      
      }//fin del else
  
      return salida;
  }//fin del metodo
  
  
  public boolean verificarCarnet(String carnet){
   
   if(!carnet.equalsIgnoreCase("")){
   
       if(arregloEstudiante.size()!= 0){
       
           for(int i=0;i<arregloEstudiante.size();i++){
           
               if(arregloEstudiante.get(i).getCarnet().equalsIgnoreCase(carnet)){
               
                   return false;
               
               }//fin del if
           
           }//fin del for
       }//fin del if
   
   }//fin del if
     return true;  
   }//fin del metodo 
    
    
    
}//fin de la clase
