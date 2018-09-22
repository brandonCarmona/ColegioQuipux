/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.ProfesorDAO;
import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;
import java.util.ArrayList;

/**
 *
 * @author Verde
 */
public class ProfesorDaoImpl implements ProfesorDAO {
    
   private ArrayList<ProfesorEntity> listaProfesores = new ArrayList<ProfesorEntity>();

    public ArrayList<ProfesorEntity> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<ProfesorEntity> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }
  
   
    @Override
    public void registrarProfesor(ProfesorEntity profesor) {
        
        
        listaProfesores.add(profesor);
             
    }
    
    
    @Override
    public ProfesorEntity ConsultarProfesor(String nombre) {
        
        
        
        ProfesorEntity profesorConsulta = new ProfesorEntity();
        
        
        for(ProfesorEntity profesor:listaProfesores){
            
            if(profesor.getNombre().equalsIgnoreCase(nombre)){
                
                profesorConsulta = profesor;
                System.out.println("Entro");
                
            }
           
        }
        System.out.println("No entro");
        
        return profesorConsulta;
        
    }
    
}
