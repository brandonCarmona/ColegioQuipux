/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.MateriaDAO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class MateriaDaoImpl implements MateriaDAO{

    private ArrayList<MateriaEntity> listaMaterias = new ArrayList<MateriaEntity>();
    
    @Override
    public void registroMateria(MateriaEntity materia) {
        
        listaMaterias.add(materia);
        
    }

    @Override
    public MateriaEntity consultaMateria(String idMateria) {
        
        MateriaEntity materiaConsulta = new MateriaEntity();
        
        for(MateriaEntity profesor:listaMaterias){
            System.out.println(profesor.getIdMateria()+ "hola");
            
            if(profesor.getIdMateria()==idMateria){
                
                materiaConsulta = profesor;
                System.out.println("Entro");
                
            }
           
        }
        System.out.println("No entro");
        
        return materiaConsulta;
        
    }

    public ArrayList<MateriaEntity> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<MateriaEntity> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
    
    
    
}
