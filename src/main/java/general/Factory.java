package general;

import DAO.CustomerDAO;
import DAOImptl.CustomerDAOImpl;

public class Factory {
    public static Factory instance = new Factory();
    public CustomerDAO customerDAO;

    private Factory(){};

    public static Factory getInstance(){
        return Factory.instance;
    }

    public CustomerDAO getCustomerDAO(){
        if(customerDAO == null ) {
            customerDAO = new CustomerDAOImpl();
        }
        return customerDAO;
    }

}
