/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;
import model.Personal;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.HibernateUtil;


/**
 *
 * @author syndein
 */
public class PersonaDaoImpl implements PersonaDao {

    @Override
    public List<Personal> mostrarPersona() {
        Session session=null;
        List<Personal> lista=null;
        try {
            session=HibernateUtil.getSessionFactory().openSession();
             Query query=session.createQuery("from Personal");
              lista=(List<Personal>)query.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
                    
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
        return lista;
    }

    @Override
    public void insertarPersona(Personal personal) {
      Session session=null;
        try {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(personal);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public void eliminarPersona(Personal personal) {
       Session session=null;
        try {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(personal);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public void editarPersona(Personal personal) {
         Session session=null;
        try {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(personal);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
    }

   
    public Personal consultar(Personal perso){
        Personal per=new Personal();
         Session session=null;
        try {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            per=(Personal) session.get(Personal.class, perso.getNombre());
            session.getTransaction();
        } catch (Exception e) {
            session.getTransaction().commit();
            e.printStackTrace();
        }finally{
            session.close();
        }
        return per;
    }
    
   
   
}
