package model;

public class Banker extends Employee{
	private int positionNumber;

	public Banker( String profession, int age, String firstName, String lastName, int positionNumber ) {
		super( profession, age, firstName, lastName );
		this.positionNumber = positionNumber;
	}
	
	public void setPositionNumber( int positionNumber ){
		this.positionNumber = positionNumber;
	}
	public int getPositionNumber(){
		return positionNumber;
	}

}
