/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;

/**
 *
 * @author brand
 */
public interface ProfesorMateriaDAO {
    
    public void RegistroProfesorMateria(ProfesorMateriaEntity PrMa);
    
    public ProfesorMateriaEntity ConsultarProfesorMateria(String idMateria, String nombre, String apellido);
    
    
    
}
