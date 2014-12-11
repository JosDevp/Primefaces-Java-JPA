/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;
import model.Personal;

/**
 *
 * @author syndein
 */
public interface PersonaDao {
    
    public List<Personal>mostrarPersona();
    public void insertarPersona(Personal personal);
    public void eliminarPersona(Personal personal);
    public void editarPersona(Personal personal);
   
    

    
}
