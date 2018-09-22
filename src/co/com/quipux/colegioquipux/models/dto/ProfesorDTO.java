/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.models.dto;

/**
 *
 * @author Verde
 */
public class ProfesorDTO {
    
    private int idProfesor;
    private String nombre;
    private String apellido;
    private String correo;
    private String decumento;
    private int idDocumento;
    private String materia;

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDecumento() {
        return decumento;
    }

    public void setDecumento(String decumento) {
        this.decumento = decumento;
    }

    public int getiDocumento() {
        return idDocumento;
    }

    public void setiDocumento(int iDocumento) {
        this.idDocumento = iDocumento;
    }
            
            
    
}
