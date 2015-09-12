package data;

import java.util.List;

import model.Customer;

public interface CustomerDaoInterface {
	public Customer getCustomer( int id ) throws Exception;
	public List< Customer > getAllCustomers() throws Exception;
	public void setCustomer( int cash, String cardNumber, String firstName, String lastName, String dateOfB, int id, String address ) throws Exception;
}
