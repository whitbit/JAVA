package model;

public class Employee extends Person {
	private int salary;
	private int payrollId;
	private String profession;
//	
	public Employee( String profession, int salary, int payrollId, String firstName, String lastName, String dateOfB, int id, String address ) {
		super( firstName, lastName, dateOfB, id, address );
		this.salary = salary;
		this.payrollId = payrollId;
		this.profession = profession;
	}
//	
	public String getProfessiony() {
		return profession;
	}
	public void setProfession( String profession ) {
		this.profession = profession;
	}
//
	public int getSalary() {
		return salary;
	}
	public void setSalary( int salary ) {
		this.salary = salary;
	}
//
	public int getPayrollID() {
		return payrollId;
	}
	public void setPayrollID( int payrollId ) {
		this.payrollId = payrollId;
	}
//
}