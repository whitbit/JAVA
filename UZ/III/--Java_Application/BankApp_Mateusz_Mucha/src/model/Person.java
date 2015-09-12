package model;

public class Person {
	private String firstName;
	private String lastName;
	private String dateOfB;
	private String address;
	private int id;
//
	public Person( String firstName, String lastName, String dateOfB, int id, String address ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfB = dateOfB;
		this.id = id;
		this.address = address;
	}
//	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}
//
	public String getLastName() {
		return lastName;
	}
	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}
//
	public String getDateOfBirth() {
		return dateOfB;
	}
	public void setDateOfBirth( String dateOfB ) {
		this.dateOfB = dateOfB;
	}
//
	public int getID() {
		return id;
	}
	public void setID( int id ) {
		this.id = id;
	}
//
	public String getAddress() {
		return address;
	}
	public void setAddress( String address ) {
		this.address = address;
	}
//
}
