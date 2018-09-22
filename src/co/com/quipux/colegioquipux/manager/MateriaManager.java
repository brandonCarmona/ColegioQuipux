/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.MateriaDTO;

/**
 *
 * @author brand
 */
public interface MateriaManager {
    
    public MateriaDTO consultarMateria(String idMateria);
    
    public void registrarMateria(MateriaDTO materia);
    
}
