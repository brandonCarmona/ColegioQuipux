/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.models.entity;

/**
 *
 * @author Verde
 */
public class ProfesorMateriaEntity {
    
    private int idProfesor;
    private String idMateria;
    private String nombreMateria;
    private int idProfesorMateria;
    private String nombrePro;
    private String apePro;

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getApePro() {
        return apePro;
    }

    public void setApePro(String apePro) {
        this.apePro = apePro;
    }

    public int getIdProfesorMateria() {
        return idProfesorMateria;
    }

    public void setIdProfesorMateria(int idProfesorMateria) {
        this.idProfesorMateria = idProfesorMateria;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
    
    
    
}
