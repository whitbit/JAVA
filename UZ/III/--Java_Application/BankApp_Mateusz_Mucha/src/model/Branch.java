package model;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	private String address;
	private int id;
	String branchProfession;
	private List< Employee > employeesList = new ArrayList< Employee >();
	private Manager manager;
//
	public Branch( String branchProfession, String address, List< Employee > employeesList, Manager manager, int id ) {
		super();
		this.address = address;
		this.employeesList = employeesList;
		this.manager = manager;
		this.branchProfession = branchProfession;
		this.id = id;
	}
	public Branch( String branchProfession, String address, List< Employee > employeesList, int id ) {
		super();
		this.address = address;
		this.employeesList = employeesList;
		this.manager = null;
		this.branchProfession = branchProfession;
		this.id = id;
	}
//
	public String getBranchProfession() {
		return branchProfession;
	}
	public void setBranchProfession( String branchProfession ) {
		this.branchProfession = branchProfession;
	}
//
	public String getAddress() {
		return address;
	}
	public void setAddress( String address ) {
		this.address = address;
	}
//
	public List< Employee > getEmployeesList() {
		return employeesList;
	}
	public void setEmployeesList( List< Employee > employeesList) {
		this.employeesList = employeesList;
	}
//
	public Manager getManager() {
		return manager;
	}
	public void setManager( Manager manager ) {
		this.manager = manager;
	}
//
	public int getID(){
		return id;
	}
}
