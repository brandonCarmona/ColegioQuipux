/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.entity;

/**
 *
 * @author brand
 */
public class NotaEstudiantePlanEntity {
    
    private int idEstudiante;
    private int idNota;
    private int idProfesorPlan;
    private int idNotaEstudiantemateria;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdProfesorPlan() {
        return idProfesorPlan;
    }

    public void setIdProfesorPlan(int idProfesorPlan) {
        this.idProfesorPlan = idProfesorPlan;
    }
    
    
    
}
