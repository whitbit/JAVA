package jsf_h_company.model.employee.emp.person;

public abstract class Person {
	private String name, surname, city, birthdate;
	private Integer age;

	public Person() {
		setBase();
	}
	public Person( String name, String surname, String city, Integer age ) {
		setBaseDetails( name, surname, city, age );
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public abstract void setBirthdate( String birthdate );
	private void setBase() {
		setName( null );
		setSurname( null );
		setCity( null );
		setAge( null );
		this.birthdate = null;
	}
	private void setBaseDetails( String name, String surname, String city, Integer age ) {
		setName( name );
		setSurname( surname );
		setCity( city );
		setAge( age );
		this.birthdate = null;
	}
}
