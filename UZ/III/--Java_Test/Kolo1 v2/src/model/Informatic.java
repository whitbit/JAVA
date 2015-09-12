package model;

public class Informatic extends Employee{
	private String languageProgrammer;

	public Informatic( String profession, int age, String firstName, String lastName, String languageProgrammer ) {
		super( profession, age, firstName, lastName );
		this.languageProgrammer = languageProgrammer;
	}
	
	public void setLanguageProgrammer( String languageProgrammer ){
		this.languageProgrammer = languageProgrammer;
	}
	public String getLanguageProgrammer(){
		return languageProgrammer;
	}

}
