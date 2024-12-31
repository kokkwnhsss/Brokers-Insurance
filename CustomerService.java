package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class CustomerService {
	private CustomerDAO customerDAO;

    public CustomerService() throws SQLException {
        this.customerDAO = new CustomerDAO();
    }
	 
    
    public List<Customer> CustomerALL() throws SQLException {

     return customerDAO.CustomerALL();
}

	 


public Customer CustomerByID(int clientid ) throws SQLException {
	
	
	
	return customerDAO.CustomerByID(clientid);
	
	}
}