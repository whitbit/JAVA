package jsf_h_company.model.employee.emp;

import java.io.Serializable;
import org.hibernate.annotations.Entity;
import jsf_h_company.model.employee.emp.person.Person;

@Entity
public class Employee extends Person implements Serializable {
	private static final long serialVersionUID = -1192977159327303391L;
	private String profession, branch;
	private Integer salary, id;

	public Employee() {
		super();
		setBase();
	}
	public Employee( String name, String surname, String city, Integer age ) {
		super( name, surname, city, age );
		setBase();
	}
	public Employee( String name, String surname, String city, Integer age, String profession, String branch, Integer salary ) {
		super( name, surname, city, age );
		setBaseDetails( profession, branch, salary );
	}
	
	public String getProfession() {
		return profession;
	}
	public void setProfession( String profession ) {
		this.profession = profession;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch( String branch ) {
		this.branch = branch;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary( Integer salary ) {
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId( Integer id ) {
		this.id = id;
	}
	
	private void setBase() {
		setProfession( null );
		setBranch( null );
		setSalary( null );
	}
	private void setBaseDetails( String profession, String branch, Integer salary ) {
		setProfession( profession );
		setBranch( branch );
		setSalary( salary );
	}
	
	@Override
	public void setBirthdate( String birthdate ) {}
}