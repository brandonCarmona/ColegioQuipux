/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;



/**
 *
 * @author brand
 */
public interface EstudianteManager {
    
    public EstudianteDTO consultaEstudiante(String nombre);
    
    public void registrarestudiante(EstudianteDTO estudiante);
    
}
