package general;

import DAO.CustomerDAO;
import util.hibernate;

import java.sql.SQLException;

public class MainClass {
    public static void main(String[] args) throws SQLException{
        Factory factory = Factory.getInstance();
        CustomerDAO c = factory.getCustomerDAO();

        //System.out.println(c.getCustomers());
        //c.getCustomers();
        //hibernate.getSessionFactory().isOpen();
        System.out.print(hibernate.getSessionFactory());
        hibernate.getSessionFactory();
    }
}
