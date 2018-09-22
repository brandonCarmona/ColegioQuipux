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
public class GrupoEntity {
    
    private int idGrupo;
    private int idGrado;
    private int idEstudiante;
    private int numeroEstudiantes;//Poniendo el caso en que tienen un determinado cupo.
    private int numeroGrupo;//como 6-1 o 6-2, etc...
    private int idProfesor;//Director de grupo

    public int getNombreDirectorGrupo() {
        return idProfesor;
    }

    public void setNombreDirectorGrupo(int nombreDirectorGrupo) {
        this.idProfesor = nombreDirectorGrupo;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }
    
    
    
}
