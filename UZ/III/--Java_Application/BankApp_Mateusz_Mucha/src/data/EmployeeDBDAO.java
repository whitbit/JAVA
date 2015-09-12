package data;

import java.util.ArrayList;
import java.util.List;
import model.Accountant;
import model.Admin;
import model.Cashier;
import model.Cleaner;
import model.Employee;
import model.Security;

public class EmployeeDBDAO implements EmployeeDaoInterface {
	public List< Employee > getAllEmployees() {
		List< Employee > employeesList = new ArrayList< Employee >();
		
		Accountant accountantAddNew = new Accountant( "Accountant", 2600, 4, "Emil", "Kaszka", "02.01.1982", 4, "Warszawa" );
		employeesList.add( accountantAddNew );
		Cashier cashierAddNew = new Cashier( "Cashier", 1600, 1, "Adam", "Wisienka", "23.05.1988", 1, "Kalisz" );
		employeesList.add( cashierAddNew );
		Cleaner cleanerAddNew = new Cleaner( "Cleaner", 1000, 2, "Pawel", "Dmucha", "12.12.1991", 2, "Wielopole" );
		employeesList.add( cleanerAddNew );
		Security securityAddNew = new Security( "Security", 2000, 3, "Jakubz", "Kolowrotek", "03.11.1989", 3, "Tarnow" );
		employeesList.add( securityAddNew );
		Admin adminAddNew = new Admin( "Admin", 5600, 5, "Pan", "Testowy", "22.11.1992", 5, "Gdañsk" );
		employeesList.add( adminAddNew );
		
		for ( int i = 0; i < employeesList.size(); i++ ) {
			if ( employeesList.get( i ) instanceof Accountant ){
				Accountant accountant = ( Accountant ) employeesList.get( i );
				System.out.println( accountant.getProfessiony() + " " + accountant.getFirstName() + " " + accountant.getLastName() + "\n   Date: " + accountant.getDateOfBirth() + "\n   Salary: " + accountant.getSalary() + "\n   City: " + accountant.getAddress() + "\n   ID: " + accountant.getID() );
			} else if ( employeesList.get( i ) instanceof Cashier ) {
				Cashier cashier = ( Cashier ) employeesList.get( i );
				System.out.println( cashier.getProfessiony() + " " + cashier.getFirstName() + " " + cashier.getLastName() + "\n   Date: " + cashier.getDateOfBirth() + "\n   Salary: " + cashier.getSalary() + "\n   City: " + cashier.getAddress() + "\n   ID: " + cashier.getID() );
			} else if ( employeesList.get( i ) instanceof Cleaner ) {
				Cleaner cleaner = ( Cleaner ) employeesList.get( i );
				System.out.println( cleaner.getProfessiony() + " " + cleaner.getFirstName() + " " + cleaner.getLastName() + "\n   Date: " + cleaner.getDateOfBirth() + "\n   Salary: " + cleaner.getSalary() + "\n   City: " + cleaner.getAddress() + "\n   ID: " + cleaner.getID() );
			} else if ( employeesList.get( i ) instanceof Security ) {
				Security security = ( Security ) employeesList.get( i );
				System.out.println( security.getProfessiony() + " " + security.getFirstName() + " " + security.getLastName() + "\n   Date: " + security.getDateOfBirth() + "\n   Salary: " + security.getSalary() + "\n   City: " + security.getAddress() + "\n   ID: " + security.getID() );
			} else if ( employeesList.get( i ) instanceof Admin ) {
				Admin admin = ( Admin ) employeesList.get( i );
				System.out.println( admin.getProfessiony() + " " + admin.getFirstName() + " " + admin.getLastName() + "\n   Date: " + admin.getDateOfBirth() + "\n   Salary: " + admin.getSalary() + "\n   City: " + admin.getAddress() + "\n   ID: " + admin.getID() );
			}
		}
		return employeesList;
	}
	public Employee getEmployee( int id ) {
		Employee employee = null;
		List< Employee > employeesList = new ArrayList< Employee >();
		
		Accountant accountantAddNew = new Accountant( "Accountant", 2600, 4, "Emil", "Kaszka", "02.01.1982", 4, "Warszawa" );
		employeesList.add( accountantAddNew );
		Cashier cashierAddNew = new Cashier( "Cashier ", 1600, 1, "Adam", "Wisienka", "23.05.1988", 1, "Kalisz" );
		employeesList.add( cashierAddNew );
		Cleaner cleanerAddNew = new Cleaner( "Cleaner", 1000, 2, "Pawel", "Dmucha", "12.12.1991", 2, "Wielopole" );
		employeesList.add( cleanerAddNew );
		Security securityAddNew = new Security( "Security", 2000, 3, "Jakubz", "Kolowrotek", "03.11.1989", 3, "Tarnow" );
		employeesList.add( securityAddNew );
		Admin adminAddNew = new Admin( "Admin", 5600, 5, "Pan", "Testowy", "22.11.1992", 5, "Gdañsk" );
		employeesList.add( adminAddNew );
		
		for ( int i = 0; i < employeesList.size(); i++  ) {
			employee = ( Employee ) employeesList.get( i );
			if ( employee instanceof Employee && employee.getID() == id ) {
				System.out.println( employee.getFirstName() + " " + employee.getLastName() + "\nProfession: " + employee.getProfessiony() + "\nSalary: " + employee.getSalary() );
			}
		}
		return employee;
	}
}
