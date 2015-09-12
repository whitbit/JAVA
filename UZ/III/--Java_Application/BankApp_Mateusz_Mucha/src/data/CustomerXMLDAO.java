package data;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerXMLDAO implements CustomerDaoInterface {
	private Customer customer = null;
	
	public Customer getCustomer( int id ) throws Exception {
		List< Customer > customersList = new ArrayList< Customer >();
		Customer customerAddNew1 = new Customer( 10000, "745645678", "Patrycja", "Lachowicz", "22.11.1990", 1, "Nowa Sol" );
		customersList.add( customerAddNew1 );
		Customer customerAddNew2 = new Customer( 500000, "367862567", "Jakub", "Killz", "21.01.1980", 2, "Warszawa" );
		customersList.add( customerAddNew2 );
		try {
			for( int i = 0; i < customersList.size(); i++ ) {
				customer = ( Customer )customersList.get( i );
				if( customer instanceof Customer && customer.getID() == id ) {
					System.out.println( customer.getFirstName() + " " + customer.getLastName() + " " + customer.getCardNumber() + " " + customer.getcash() + " " + customer.getAddress() );
				}
			}
			throw new Exception( "Error code: 444" );
		} catch ( Exception exc ) {
			System.out.println( "Caught error in getCustomerXML: " + exc.toString() );
			exc.printStackTrace();
			throw new Exception( "XML error in DAO" );
		} finally { 
			return customer;
		}
	}
	public List< Customer > getAllCustomers() throws Exception {
		List< Customer > customersList = new ArrayList< Customer >();
		try {
			Customer customerAddNew1 = new Customer( 10000, "745645678", "Patrycja", "Lachowicz", "22.11.1990", 1, "Nowa Sol" );
			customersList.add( customerAddNew1 );
			Customer customerAddNew2 = new Customer( 500000, "367862567", "Jakub", "Killz", "21.01.1980", 2, "Warszawa" );
			customersList.add( customerAddNew2 );
			for ( int i = 0; i < customersList.size(); i++ ) {
				if ( customersList.get( i ) instanceof Customer ) {
					customer = ( Customer ) customersList.get( i );
					System.out.println( customer.getFirstName() + " " + customer.getLastName() + " " + customer.getCardNumber() + " " + customer.getcash() + " " + customer.getAddress() );
				}
			}
			throw new Exception( "Error code: 445" );
		} catch ( Exception exc ) {
			System.out.println( "Caught error in getAllCustomerXML: " + exc.toString() );
			exc.printStackTrace();
			throw new Exception( "XML error in DAO" );
		} finally { 
			return customersList;
		}
	}
	public void setCustomer( int cash, String cardNumber, String firstName, String lastName, String dateOfB, int id, String address ) throws Exception {
		this.customer = new Customer( cash, cardNumber, firstName, lastName, dateOfB, id, address );
	}
	
}
