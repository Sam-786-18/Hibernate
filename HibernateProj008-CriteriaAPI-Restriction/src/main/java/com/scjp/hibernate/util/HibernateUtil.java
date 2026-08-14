package com.scjp.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class for managing SessionFactory and Session instances
 */
public class HibernateUtil {
    
    private static SessionFactory sessionFactory ;
    private static StandardServiceRegistry serviceRegistry;
    
    /**
     * Builds and returns the SessionFactory from Hibernate configuration
     * @return SessionFactory instance
     */
    public static SessionFactory buildSessionFactory() {
    	if(sessionFactory==null) {
        try {
        	System.out.println("service");
            // Create SessionFactory from Hibernate configuration file (hibernate.cfg.xml)
        	serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
        	System.out.println("service"+serviceRegistry);
            MetadataSources metadataSources= new MetadataSources(serviceRegistry);
            Metadata metadata=metadataSources.getMetadataBuilder().build();
            sessionFactory=metadata.getSessionFactoryBuilder().build();
           
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        }
        return sessionFactory;
    }
    
  
}
