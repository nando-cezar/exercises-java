/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author André Portugal
 */
public class HibernateUtil {

      private SessionFactory sessionFactory;

    public HibernateUtil() {
        sessionFactory = buildSessionFactory();
    }
   
   
    
   private SessionFactory buildSessionFactory() {
        try {
             
            AnnotationConfiguration conf = new AnnotationConfiguration();
            conf.configure("hibernate.cfg.xml");
            SessionFactory obj = conf.buildSessionFactory();
            
            return obj;
            } catch (Throwable ex) {
            System.err.println("Falha ao Iniciar Sessão." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

   
}
