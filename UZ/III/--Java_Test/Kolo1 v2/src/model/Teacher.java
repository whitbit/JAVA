package model;

public class Teacher extends Employee{
	private String subject;

	public Teacher( String profession, int age, String firstName, String lastName, String subject ) {
		super( profession, age, firstName, lastName );
		this.subject = subject;
	}
	
	public void setSubject( String subject ){
		this.subject = subject;
	}
	public String getSubject(){
		return subject;
	}

}
