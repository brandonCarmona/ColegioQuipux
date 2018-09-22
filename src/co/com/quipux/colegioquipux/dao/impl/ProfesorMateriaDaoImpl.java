/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.ProfesorMateriaDAO;
import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class ProfesorMateriaDaoImpl implements ProfesorMateriaDAO{

    private ArrayList<ProfesorMateriaEntity> listaProfesoresMaterias = new ArrayList<ProfesorMateriaEntity>();
    
    @Override
    public void RegistroProfesorMateria(ProfesorMateriaEntity prMa) {
        
        listaProfesoresMaterias.add(prMa);
        
    }

    @Override
    public ProfesorMateriaEntity ConsultarProfesorMateria(String idMateria,String nombre, String apellido) {
        
        ProfesorMateriaEntity profesorMateriaConsulta = new ProfesorMateriaEntity();
        
        
        for(ProfesorMateriaEntity profesorMateria:listaProfesoresMaterias){
            
            if(profesorMateria.getIdMateria().equalsIgnoreCase(idMateria)){
                if (profesorMateria.getNombrePro().equalsIgnoreCase(nombre) && profesorMateria.getApePro().equalsIgnoreCase(apellido)) {
                    
                    profesorMateriaConsulta = profesorMateria;
                System.out.println("Entro");
                }   
            }       
        }
        System.out.println("No Encontrado");
        
        return profesorMateriaConsulta;
        
    }


}
