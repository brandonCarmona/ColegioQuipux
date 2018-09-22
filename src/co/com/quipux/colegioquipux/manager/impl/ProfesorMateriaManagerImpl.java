/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.dao.impl.ProfesorMateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.ProfesorMateriaManager;
import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaDTO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class ProfesorMateriaManagerImpl implements ProfesorMateriaManager {

    ProfesorMateriaDaoImpl profesorMateriaDao = new ProfesorMateriaDaoImpl();
    
    
    
    MateriaDaoImpl materiaDAO = new MateriaDaoImpl();
    ArrayList a = materiaDAO.getListaMaterias();

    @Override
    public ProfesorMateriaDTO consultaprofesorMateria(String idMateria, String nombre, String apellido) {

        ProfesorMateriaDTO profesorMateriaDTO = new ProfesorMateriaDTO();
        ProfesorMateriaEntity profesorMateriaEntity = profesorMateriaDao.ConsultarProfesorMateria(idMateria, nombre, apellido);

        profesorMateriaDTO.setNomPro(profesorMateriaEntity.getNombrePro());
        profesorMateriaDTO.setApePro(profesorMateriaEntity.getApePro());
        profesorMateriaDTO.setIdMateria(profesorMateriaEntity.getIdMateria());

        return profesorMateriaDTO;

    }

    @Override
    public void registrarProfesorMateria(ProfesorMateriaDTO profesorMateria) {

        ProfesorMateriaEntity profesorMateriaEntity = new ProfesorMateriaEntity();
        
        for (int i = 0;i<= a.size(); i++) {
            
            if(a.get(i).equals(profesorMateria)){
                
                profesorMateriaEntity.setNombreMateria((String) a.get(i));
                
            }
            
        }

        profesorMateriaEntity.setIdMateria(profesorMateria.getIdMateria());
        profesorMateriaEntity.setNombrePro(profesorMateria.getNomPro());
        profesorMateriaEntity.setApePro(profesorMateria.getApePro());

        profesorMateriaDao.RegistroProfesorMateria(profesorMateriaEntity);

    }

}
