package test;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class TestUsers {
	private static List< Employee > employeesList = new ArrayList< Employee >();
//
	public static void main ( String[] args ){
		//testEmployeesInformation();
		testBranch();
		//testManager();
	}
//
	public static void testSetEmployeesInformation() {
		Accountant accountantAddNew = new Accountant( "Accountant := | ", 2600, 4, "Emil", "Kaszka", "02.01.1982", 4, "Warszawa" );
		employeesList.add( accountantAddNew );
		Cashier cashierAddNew = new Cashier( "Cashier := | ", 1600, 1, "Adam", "Wisienka", "23.05.1988", 1, "Kalisz" );
		employeesList.add( cashierAddNew );
		Cleaner cleanerAddNew = new Cleaner( "Cleaner := | ", 1000, 2, "Pawel", "Dmucha", "12.12.1991", 2, "Wielopole" );
		employeesList.add( cleanerAddNew );
		Security securityAddNew = new Security( "Security := | ", 2000, 3, "Jakubz", "Kolowrotek", "03.11.1989", 3, "Tarnow" );
		employeesList.add( securityAddNew );
		Admin adminAddNew = new Admin( "Admin := | ", 5600, 5, "Pan", "Testowy", "22.11.1992", 5, "Gdañsk" );
		employeesList.add( adminAddNew );
	}
	public static void testEmployeesInformation() {
		testSetEmployeesInformation();
		for ( int i = 0; i < employeesList.size(); i++ ){
			if ( employeesList.get( i ) instanceof Accountant ){
				Accountant accountant = ( Accountant ) employeesList.get( i );
				System.out.println( accountant.getProfessiony() + accountant.getFirstName() + " " + accountant.getLastName() + " " + accountant.getDateOfBirth() + " " + accountant.getSalary() + " " + accountant.getAddress() + " " + accountant.getID() );
			} else if ( employeesList.get( i ) instanceof Cashier ){
				Cashier cashier = ( Cashier ) employeesList.get( i );
				System.out.println( cashier.getProfessiony() + cashier.getFirstName() + " " + cashier.getLastName() + " " + cashier.getDateOfBirth() + " " + cashier.getSalary() + " " + cashier.getAddress() + " " + cashier.getID() );
			} else if ( employeesList.get( i ) instanceof Cleaner ){
				Cleaner cleaner = ( Cleaner ) employeesList.get( i );
				System.out.println( cleaner.getProfessiony() + cleaner.getFirstName() + " " + cleaner.getLastName() + " " + cleaner.getDateOfBirth() + " " + cleaner.getSalary() + " " + cleaner.getAddress() + " " + cleaner.getID() );
			} else if ( employeesList.get( i ) instanceof Security ){
				Security security = ( Security ) employeesList.get( i );
				System.out.println( security.getProfessiony() + security.getFirstName() + " " + security.getLastName() + " " + security.getDateOfBirth() + " " + security.getSalary() + " " + security.getAddress() + " " + security.getID() );
			} else if ( employeesList.get( i ) instanceof Admin ){
				Admin admin = ( Admin ) employeesList.get( i );
				System.out.println( admin.getProfessiony() + admin.getFirstName() + " " + admin.getLastName() + " " + admin.getDateOfBirth() + " " + admin.getSalary() + " " + admin.getAddress() + " " + admin.getID() );
			}
		}
	}
	public static void testBranch ( ){
		testSetEmployeesInformation();
		Branch branchAddNew = new Branch( "Wydzial Informatyki, Elektrotechniki i Telekomunikacji", "Zielona Gora", employeesList, 1 );
		Manager managerAddNew = new Manager( "Branch Manager ::== || ", branchAddNew, 15000, 7, "Mateusz", "Mucha", "22.11.1992", 6, "Swiebodzin" );
		branchAddNew.setManager( managerAddNew );
		for(int i = 0; i < branchAddNew.getEmployeesList().size(); i++ ) {
			System.out.println( branchAddNew.getEmployeesList().get(i).getProfessiony() + " " + branchAddNew.getEmployeesList().get(i).getFirstName() + " " + branchAddNew.getEmployeesList().get(i).getLastName() + " " + branchAddNew.getEmployeesList().get(i).getSalary() + " " + branchAddNew.getEmployeesList().get(i).getDateOfBirth() + " " + branchAddNew.getEmployeesList().get(i).getAddress() );
		}
		System.out.println( "\n" + branchAddNew.getBranchProfession() + "\n" + branchAddNew.getManager().getProfessiony() + branchAddNew.getManager().getFirstName() + " " + branchAddNew.getManager().getLastName() );
	}
	public static void testManager ( ){
		testSetEmployeesInformation();
		Branch branchAddNew = new Branch( "Wydzial Informatyki, Elektrotechniki i Telekomunikacji", "Zielona Gora", employeesList, 2 );
		Manager managerAddNew = new Manager( "Manager ::== || ", branchAddNew, 25000, 7, "Mateusz", "Mucha", "22.11.1992", 6, "Swiebodzin" );
		for ( int i = 0; i < managerAddNew.getBranch().getEmployeesList().size(); i++ ){
			System.out.println( managerAddNew.getBranch().getEmployeesList().get(i).getProfessiony() + managerAddNew.getBranch().getEmployeesList().get(i).getFirstName() + " " + managerAddNew.getBranch().getEmployeesList().get(i).getLastName() + " " + managerAddNew.getBranch().getEmployeesList().get(i).getSalary() + " " + managerAddNew.getBranch().getEmployeesList().get(i).getDateOfBirth() + " " + managerAddNew.getBranch().getEmployeesList().get(i).getAddress() );	
		}
		System.out.println( "\n" + branchAddNew.getBranchProfession() + "\n" + managerAddNew.getProfessiony() + managerAddNew.getFirstName() + " " + managerAddNew.getLastName() );
	}
//
}
