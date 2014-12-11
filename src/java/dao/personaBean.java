/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Personal;

/**
 *
 * @author syndein
 */
@ManagedBean (name="per")
@ViewScoped
public class personaBean {

    /**
     * Creates a new instance of personaBean
     */
    private Personal personal;
    private List<Personal> personales;
    private List<Personal> personalBusqueda;

    public personaBean() {
        personal = new Personal();
    }

   
          
      
    public List<Personal> getPersonalBusqueda() {
        return personalBusqueda;
    }

    public void setPersonalBusqueda(List<Personal> personalBusqueda) {
        this.personalBusqueda = personalBusqueda;
    }
    
    

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Personal> getPersonales() {
          PersonaDao pers=new PersonaDaoImpl();
          personales=pers.mostrarPersona();
        return personales;
    }

    public void setPersonales(List<Personal> personales) {
        this.personales = personales;
    }
    
    
    
    public void insertar(){
        PersonaDao per=new PersonaDaoImpl();
        per.insertarPersona(personal);
        personal=new Personal();
    }
    
    public void modificar(){
         PersonaDao per=new PersonaDaoImpl();
        per.editarPersona(personal);
        personal=new Personal();
    }
    
    public void eliminar(){
         PersonaDao per=new PersonaDaoImpl();
        per.eliminarPersona(personal);
        personal=new Personal();
    }
    
}
