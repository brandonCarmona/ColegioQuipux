/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.ProfesorDaoImpl;
import co.com.quipux.colegioquipux.manager.ProfesorManager;
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;

/**
 *
 * @author Verde
 */
public class ProfesorManagerImpl implements ProfesorManager{
    
    ProfesorDaoImpl profesorDao = new ProfesorDaoImpl();

    @Override
    public ProfesorDTO consultaprofesor(String nombre){
        
        ProfesorDTO profesorDTO = new ProfesorDTO();
        ProfesorEntity profesorEntity = profesorDao.ConsultarProfesor(nombre);
        
        profesorDTO.setNombre(profesorEntity.getNombre());
        profesorDTO.setApellido(profesorEntity.getApellidos());
        profesorDTO.setCorreo(profesorEntity.getCorreo());
        
        return profesorDTO;
         
    }

    @Override
    public void registrarProfesor(ProfesorDTO profesor) {
       
        
        
        ProfesorEntity profesorEntity = new ProfesorEntity();
        
        profesorEntity.setIdProfesor(profesor.getIdProfesor());
        profesorEntity.setNombre(profesor.getNombre());
        profesorEntity.setApellidos(profesor.getApellido());
        profesorEntity.setCorreo(profesor.getCorreo());
        profesorEntity.setDocumeto(profesor.getDecumento());
        profesorEntity.setIdDocumento(profesor.getiDocumento());
        
        profesorDao.registrarProfesor(profesorEntity);
        
        
    }
    
    
    
}
