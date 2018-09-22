/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.EstudianteDaoImpl;
import co.com.quipux.colegioquipux.manager.EstudianteManager;
import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;

/**
 *
 * @author brand
 */
public class EstudianteManagerImpl implements EstudianteManager{
    
    EstudianteDaoImpl estudianteDao = new EstudianteDaoImpl();

    @Override
    public EstudianteDTO consultaEstudiante(String nombre) {
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        EstudianteEntity estudianteEntity = estudianteDao.ConsultarEstudiante(nombre);
        
        estudianteDTO.setNombres(estudianteEntity.getNombres());
        estudianteDTO.setApellidos(estudianteEntity.getApellidos());
        estudianteDTO.setDocumento(estudianteEntity.getDocumento());
        estudianteDTO.setSexo(estudianteEntity.getSexo());
        estudianteDTO.setFechaNacimiento(estudianteEntity.getFechaNacimiento());
        estudianteDTO.setDireccion(estudianteEntity.getDireccion());
        estudianteDTO.setCiudad(estudianteEntity.getCiudad());
        estudianteDTO.setTelefono(estudianteEntity.getTelefono());
        estudianteDTO.setCelular(estudianteEntity.getCelular());
        estudianteDTO.setCorreo(estudianteEntity.getCorreo());
        
        return estudianteDTO;
    }

    @Override
    public void registrarestudiante(EstudianteDTO estudiante) {
       
        EstudianteEntity estudianteEntity = new EstudianteEntity();
        
        estudianteEntity.setNombres(estudiante.getNombres());
        estudianteEntity.setApellidos(estudiante.getApellidos());
        estudianteEntity.setDocumento(estudiante.getDocumento());
        estudianteEntity.setSexo(estudiante.getSexo());
        estudianteEntity.setFechaNacimiento(estudiante.getFechaNacimiento());
        estudianteEntity.setDireccion(estudiante.getDireccion());
        estudianteEntity.setCiudad(estudiante.getCiudad());
        estudianteEntity.setTelefono(estudiante.getTelefono());
        estudianteEntity.setCelular(estudiante.getCelular());
        estudianteEntity.setCorreo(estudiante.getCorreo());
        
        estudianteDao.RegistrarEstudiante(estudianteEntity);
        
    }

  
    
}
