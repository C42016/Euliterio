/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import hibernate.HibernateUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Type
 */
public class Teste {
    public static EntityManager entity(){
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernatePU");
        return fabrica.createEntityManager();
    }
    public static boolean salvar(Estudante estudante){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
       
//        estudante.setId(1L);
        estudante.setNome("Euliterio");
        estudante.setIdade(20);
        session.save(estudante);
        
        session.close();
        t.commit();
        return true;
        
    }
    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction t = session.beginTransaction();
        Estudante estudante = new Estudante();
////        estudante.setId(1L);
        estudante.setNome("Euliterio");
        estudante.setIdade(20);
       // session.save(estudante);
//        
//        session.close();
//        t.commit();
           
          salvar(estudante);
        
        

                

//        salvar(estudante);
        
    }
}
