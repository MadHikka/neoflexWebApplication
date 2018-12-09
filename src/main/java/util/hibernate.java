package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernate {
    private static SessionFactory sessionFactory;

   {
       try
       {
           sessionFactory = new Configuration().configure().buildSessionFactory();
       }catch (Throwable e) {
            System.out.println("HibernateError " + e);
            throw new ExceptionInInitializerError();
       }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}