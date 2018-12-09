package DAO;

import entity.customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
    public void addCustomer(customer customer) throws SQLException;
    public void deleteCustomer (customer customer) throws SQLException;
    public List<customer> getCustomers() throws SQLException;
}
