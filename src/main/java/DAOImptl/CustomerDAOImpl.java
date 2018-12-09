package DAOImptl;

import DAO.CustomerDAO;
import org.hibernate.Session;
import entity.customer;
import org.hibernate.SessionFactory;
import util.hibernate;

import java.sql.SQLException;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    public void addCustomer(customer customer) throws SQLException {
        Session session = null;
        try{
            session = hibernate.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if ((session!=null)&&(session.isOpen())) session.close();
        }

    }

    public void deleteCustomer(customer customer) throws SQLException {
        Session session = null;
        try{
            session = hibernate.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(customer);
            session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if ((session!=null)&&(session.isOpen())) session.close();
        }

    }

    public List<customer> getCustomers() throws SQLException {
        List<customer> customers = null;
        Session session = null;
        try {
            session = hibernate.getSessionFactory().openSession();
            customers = session.createCriteria(customer.class).list();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if((session!=null)&&(session.isOpen())) session.close();
        }
        return customers;
    }
}
