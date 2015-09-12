package model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	private Branch branch;
	private List< Employee > employeesList = new ArrayList< Employee >();
//
	public Manager( String profession, int salary, int payrollId, String firstName, String lastName, String dateOfB, int id, String address) {
		super( profession, salary, payrollId, firstName, lastName, dateOfB, id, address );
	}
	public Manager( String profession, Branch branch, int salary, int payrollId, String firstName, String lastName, String dateOfB, int id, String address) {
		super( profession, salary, payrollId, firstName, lastName, dateOfB, id, address );
		this.branch = branch;
	}
	public Manager( List< Employee > employeesList, String profession, Branch branch, int salary, int payrollId, String firstName, String lastName, String dateOfB, int id, String address) {
		super( profession, salary, payrollId, firstName, lastName, dateOfB, id, address );
		this.branch = branch;
		this.employeesList = employeesList;
	}
//
	public Branch getBranch() {
		return branch;
	}
	public void setBranch( Branch branch ) {
		this.branch = branch;
	}
	public List< Employee > getEmployeesList() {
		return employeesList;
	}
	public void setEmployeesList( List< Employee > employeesList) {
		this.employeesList = employeesList;
	}
//
}