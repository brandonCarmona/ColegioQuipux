/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.EstudianteDAO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class EstudianteDaoImpl implements EstudianteDAO{
    
    private ArrayList<EstudianteEntity> listaEstudiantes = new ArrayList<EstudianteEntity>();
    

    @Override
    public void RegistrarEstudiante(EstudianteEntity estudiante) {
        
        System.out.println("Registrado");
        listaEstudiantes.add(estudiante);
        
        
    }

    @Override
    public EstudianteEntity ConsultarEstudiante(String nombre) {
        
        System.out.println("Hola");
        
        EstudianteEntity profesorConsulta = new EstudianteEntity();
        
        for(EstudianteEntity profesor:listaEstudiantes){
            
            if(profesor.getNombres().equalsIgnoreCase(nombre)){
                
                profesorConsulta = profesor;
                System.out.println("Entro");
                
            }
           
        }
        System.out.println("No entro");
        
        return profesorConsulta;
    }
    
}
