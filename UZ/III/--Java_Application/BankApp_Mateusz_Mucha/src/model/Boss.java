package model;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Manager {
	private List< Branch > branchList = new ArrayList< Branch >();
//
	public Boss( String profession, int salary, int payrollId, String firstName, String lastName, String dateOfB, int id, String address ) {
		super( profession, salary, payrollId, firstName, lastName, dateOfB, id, address );
	}
	public Boss( String profession, List< Branch > branchList, Branch branch, int salary, int payrollId, String firstName, String lastName, String dateOfB, int id, String address ) {
		super( profession, branch, salary, payrollId, firstName, lastName, dateOfB, id, address );
		this.branchList = branchList;
	}
//
	public List< Branch > getBranchList() {
		return branchList;
	}
	public void setBranchList( List< Branch > branchList ) {
		this.branchList = branchList;
	}
//	
}