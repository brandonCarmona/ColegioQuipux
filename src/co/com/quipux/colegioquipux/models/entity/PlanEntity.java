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
public class PlanEntity {
    
    private int idPlan;
    private String nombreNota;
    private int porcentageNota;
    private int fecha;

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombreNota() {
        return nombreNota;
    }

    public void setNombreNota(String nombreNota) {
        this.nombreNota = nombreNota;
    }

    public int getPorcentageNota() {
        return porcentageNota;
    }

    public void setPorcentageNota(int porcentageNota) {
        this.porcentageNota = porcentageNota;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    
    
}
