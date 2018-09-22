/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.MateriaManager;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;

/**
 *
 * @author brand
 */
public class MateriaManagerImpl implements MateriaManager{

    MateriaDaoImpl materiaDao = new MateriaDaoImpl();
    
    @Override
    public MateriaDTO consultarMateria(String idMateria) {
        MateriaDTO materiaDTO = new MateriaDTO();
        MateriaEntity materiaEntity = materiaDao.consultaMateria(idMateria);
        
        materiaDTO.setIdMateria(materiaEntity.getIdMateria());
        materiaDTO.setNombreMateria(materiaEntity.getNombreMateria());
        
        return materiaDTO;
    }

    @Override
    public void registrarMateria(MateriaDTO materia) {
        
        MateriaEntity materiaEntity = new MateriaEntity();
        
        materiaEntity.setNombreMateria(materia.getNombreMateria());
        materiaEntity.setIdMateria(materia.getIdMateria());
        
        materiaDao.registroMateria(materiaEntity);
        System.out.println("hola");
        
    }

    
    
}
