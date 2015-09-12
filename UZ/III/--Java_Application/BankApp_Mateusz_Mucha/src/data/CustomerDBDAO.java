package data;

import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.Customer;

public class CustomerDBDAO implements CustomerDaoInterface {
	private Customer customer = null;
	private List< Customer > customersList = new ArrayList< Customer >();
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;	
		
	public void getConnection() throws SQLException {
		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
		    this.connection = ( Connection )DriverManager.getConnection( "jdbc:mysql://localhost:3306/bankapp", "root", "root" );
		    this.statement = ( Statement )connection.createStatement();
		    this.resultSet = ( ResultSet )statement.executeQuery( "select * from customer" );
		} catch ( Exception exception ) {
	    	System.out.println( "Exception Failed: " + exception );
		}
	}
	private void closeConnection() throws SQLException {
		try {
			resultSet.close();
		    statement.close();
		    connection.close();
		} catch ( Exception exception ) {
			System.out.println( "Exception Failed: " + exception );
		}
	}
	
	public Customer getCustomer( int id ) throws SQLException {
		getConnection();
		this.customer = getCustomerFromDataBase( resultSet, id );
		closeConnection();
		return customer;
	}
	public List< Customer > getAllCustomers() throws SQLException {
		getConnection();
		this.customersList = getAllCustomersFromDataBase( resultSet );
		closeConnection();
		return customersList;
	}
	public Customer getCustomerFromDataBase( ResultSet resultSet, int idFromDatabase ) throws SQLException {
		while ( resultSet.next() ) {
			if( resultSet.getInt( "id" ) == idFromDatabase ) {
				this.customer = new Customer( resultSet.getInt( "cash" ), resultSet.getString( "cardNumber" ), resultSet.getString( "firstName" ),
						resultSet.getString( "lastName" ), resultSet.getString( "dateOfB" ), resultSet.getInt( "id" ),
						resultSet.getString( "address" ) );
				System.out.println( "+ Customer: " + customer.getFirstName() + " " + customer.getLastName() + 
						"\n - Credit Card: " + customer.getCardNumber() + "\n - Money: " + customer.getcash() + "\n - Address: " + customer.getAddress() );	
			}
		}
		return customer;
	}	
	public List< Customer > getAllCustomersFromDataBase( ResultSet resultSet ) throws SQLException {
		while ( resultSet.next() ) {
			Customer customer = new Customer( resultSet.getInt( "cash" ), resultSet.getString( "cardNumber" ), resultSet.getString( "firstName" ),
					resultSet.getString( "lastName" ), resultSet.getString( "dateOfB" ), resultSet.getInt( "id" ),
					resultSet.getString( "address" ) );
			this.customersList.add( customer );
			System.out.println( "+ Customer: " + customer.getFirstName() + " " + customer.getLastName() + 
					"\n - Credit Card: " + customer.getCardNumber() + "\n - Money: " + customer.getcash() + "\n - Address: " + customer.getAddress() );	
		}
		return customersList;
	}
	public void setCustomer( int cash, String cardNumber, String firstName, String lastName, String dateOfB, int id, String address ) throws SQLException {
		getConnection();
		this.customer = new Customer( cash, cardNumber, firstName, lastName, dateOfB, id, address );
		preparedStatement = ( PreparedStatement ) connection.prepareStatement( "insert into  bankapp.customer values (?, ?, ?, ?, ?, ?, ?)" );
		preparedStatement.setInt( 1, customer.getcash() );
		preparedStatement.setString( 2, customer.getCardNumber() );
		preparedStatement.setString( 3, customer.getFirstName() );
		preparedStatement.setString( 4, customer.getLastName() );
		preparedStatement.setString( 5, customer.getDateOfBirth() );
		preparedStatement.setInt( 6, customer.getID() );
		preparedStatement.setString( 7, customer.getAddress() );
		preparedStatement.executeUpdate();
	}
}
