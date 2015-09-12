package model;

public abstract class Person {
	private String firstName, lastName;
	private int age;

	public Person( int age, String firstName, String lastName ) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setAge( int age ){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setFirstName( String firstName ){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName( String lastName ){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	
}
