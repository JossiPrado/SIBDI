/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Prestamo {
    
    private String alumno;
    private String iD;
    private String autor;
    private String categoria;

    public Prestamo() {
        this.alumno = "";
        this.iD = "";
        this.autor = "";
        this.categoria = "";
    }

    public Prestamo(String alumno, String iD, String autor, String categoria) {
        this.alumno = alumno;
        this.iD = iD;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}//fin de la clase
