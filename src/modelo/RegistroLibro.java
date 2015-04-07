/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Prado
 */
public class RegistroLibro {
    
    private ArrayList<Libro>listaLibros;
    private String matrizDatos[][];

    
    public RegistroLibro() {
        
        listaLibros=new ArrayList<Libro>();
        
    }//fin del constructor
    
    
    public String agregarLibro(Libro libro){
    
    if(libro!=null){
        
        if(verificarID(libro.getiD())){
        
            listaLibros.add(libro);
            return "El libro ha sido agregado correctamente";
        }//fin del if
        
        else{
        
           return "El libro ya se encuentra registrado";
        
        }//fin del else
    
    }//fin del if
    
    else{
    
    return "El objeto no existe";
        
    }//fin del else
    
    // return "";
    
    }//fin del metodo
    
   public boolean verificarID(String iD){
   
   if(!iD.equalsIgnoreCase("")){
   
       if(listaLibros.size()!= 0){
       
           for(int index=0;index<listaLibros.size();index++){
           
               if(listaLibros.get(index).getiD().equalsIgnoreCase(iD)){
               
                   return false;
               
               }//fin del if
           
           }//fin del for
       }//fin del if
   
   }//fin del if
     return true;  
   }//fin del metodo 
   
   public void ver(){//es mas sencillo para buscar
   
   for(Libro libroE:listaLibros){
   
       if(libroE.getiD().equalsIgnoreCase("")){
       
       
       }//fin del if
   
   }//fin del for
   
   }//fin del metodo
   
   public String eliminarLibro(String iD){
   
   
   Libro libroEl=buscarLibro(iD);
   
   
       
       if(libroEl!=null){
  
           
           listaLibros.remove(buscarLibro(iD));
           return "El libro ha sido eliminado";
       
       }//fin del if
   
       
       
      
   
   return "lol";
   
   }//fin del metodo
   
   public Libro buscarLibro(String iD){
   
       Libro libro=null;
       
       if(!iD.equalsIgnoreCase("")){
           
           for(Libro libroE:listaLibros){
               
               if(libroE.getiD().equalsIgnoreCase(iD)){
                   
                   return libroE;
               
               }//fin del if
           
           
           }//fin del for
       
       
       }//fin del if
   
       return null;
   
   }//fin del metodo
   
  
  public String consultarLibros(){
  
  String salida="";
  
  for(Libro libros:listaLibros){
      
      salida+=libros+"\n";
  
  }//fin del for
  
  return salida;
  
  }//fin del metodo 
  
  public String [][] getMatriz(){
      matrizDatos=new String[listaLibros.size()][Libro.getTamanno()];
      for(int f=0;f<matrizDatos.length;f++){
          
          for(int c=0;c<matrizDatos[f].length;c++){
              
              matrizDatos[f][c]=listaLibros.get(f).datos(c);
              
              
              
              
          }//fin del for columnas
      
      
      }//fin del for filas
  
  
      return matrizDatos;
  
  }//fin del metodo
  
   
}//fin de la clase
