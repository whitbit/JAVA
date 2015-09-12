package model;

public abstract class Employee extends Person{
	private String profession;

	public Employee( String profession, int age, String firstName, String lastName ) {
		super( age, firstName, lastName );
		this.profession = profession;
	}
	
	public void setProfession( String profession ){
		this.profession = profession;
	}
	public String getProfession(){
		return profession;
	}

}
