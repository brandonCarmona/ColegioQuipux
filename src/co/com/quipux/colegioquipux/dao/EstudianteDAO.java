/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;

/**
 *
 * @author brand
 */
public interface EstudianteDAO {
    
    public void RegistrarEstudiante(EstudianteEntity  estudiante);
    
    public EstudianteEntity ConsultarEstudiante(String nombre);
    
}
