/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.dto;

/**
 *
 * @author brand
 */
public class ProfesorMateriaDTO {
    
    private String idMateria;
    private String nomPro;
    private String apePro;
    private int idPro;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public String getApePro() {
        return apePro;
    }

    public void setApePro(String apePro) {
        this.apePro = apePro;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }
    
}
