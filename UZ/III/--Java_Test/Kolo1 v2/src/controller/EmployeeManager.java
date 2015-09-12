package controller;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import data.*;

public class EmployeeManager {
	private List< Employee > employeeList = new ArrayList< Employee >();
	//private EmployeeInterface employeeInterface = new EmployeeDAODB();
	private EmployeeInterface employeeInterface = new EmployeeDAOXML();
	
	public List< Employee > getEmployees(){
		return employeeInterface.getEmployees();
	}
	public Employee getEmployeeByName( String firstName ){
		return employeeInterface.getEmployeeByName( firstName );
	}
	public Employee getEmployeeBySurname( String lastName ){
		return employeeInterface.getEmployeeBySurname( lastName );
	}
	public Employee getEmployeeByAge( int age ){
		return employeeInterface.getEmployee( age );
	}
	public Employee getEmployeeByNameAndSurname( String firstName, String lastName ){
		return employeeInterface.getEmployee( firstName, lastName );
	}
}
