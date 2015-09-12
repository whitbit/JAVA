package data;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class BranchDBDAO implements BranchDaoInterface{
	private List< Employee > employeesList = new ArrayList< Employee >();
	private List< Employee > employeesList2 = new ArrayList< Employee >();
	private List< Branch > branchList = new ArrayList< Branch >();
	private List< Manager > managerList = new ArrayList< Manager >();
	private Branch branch;

	public List< Branch > getAllBranch() {
		Accountant accountantAddNew = new Accountant( "Accountant", 2600, 4, "Emil", "Kaszka", "02.01.1982", 1, "Warszawa" );
		employeesList .add( accountantAddNew );
		Cashier cashierAddNew = new Cashier( "Cashier ", 1600, 1, "Adam", "Wisienka", "23.05.1988", 2, "Kalisz" );
		employeesList.add( cashierAddNew );
		Cleaner cleanerAddNew = new Cleaner( "Cleaner", 1000, 2, "Pawel", "Dmucha", "12.12.1991", 3, "Wielopole" );
		employeesList.add( cleanerAddNew );
		Security securityAddNew = new Security( "Security", 2000, 3, "Jakubz", "Kolowrotek", "03.11.1989", 4, "Tarnow" );
		employeesList.add( securityAddNew );
		Admin adminAddNew = new Admin( "Admin", 5600, 5, "Pan", "Testowy", "22.11.1992", 5, "Gdañsk" );
		employeesList.add( adminAddNew );
		Branch branchAddNew = new Branch( "Wydzial Informatyki, Elektrotechniki i Telekomunikacji", "Zielona Gora", employeesList, 1 );
		branchList.add( branchAddNew );
		Manager managerAddNew = new Manager( "Branch Manager ::== || ", branchAddNew, 15000, 7, "Mateusz", "Mucha", "22.11.1992", 1, "Swiebodzin" );
		managerList.add( managerAddNew );
		branchAddNew.setManager( managerAddNew );
		System.out.println( branchAddNew.getBranchProfession() + "\n" + branchAddNew.getManager().getProfessiony() + branchAddNew.getManager().getFirstName() + " " + branchAddNew.getManager().getLastName() + "\n" );	
		System.out.println( "Employees of " + branchAddNew.getBranchProfession() );
		for( int i = 0; i < employeesList.size(); i++ ) {
			System.out.println( branchAddNew.getEmployeesList().get( i ).getProfessiony()+ " " + branchAddNew.getEmployeesList().get( i ).getFirstName() + " " + branchAddNew.getEmployeesList().get( i ).getLastName() );
		}
		System.out.println( "||=============================================================||" );
		Accountant accountantAddNew2 = new Accountant( "Accountant", 3600, 4, "Ewa", "Kowalska", "02.01.1982", 1, "Warszawa" );
		employeesList2.add( accountantAddNew2 );
		Cashier cashierAddNew2 = new Cashier( "Cashier ", 2200, 1, "Alicja", "Wrona", "23.05.1988", 2, "Kalisz" );
		employeesList2.add( cashierAddNew2 );
		Cleaner cleanerAddNew2 = new Cleaner( "Cleaner", 1300, 2, "Piotr", "Ducha", "12.12.1991", 3, "Wielopole" );
		employeesList2.add( cleanerAddNew2 );
		Security securityAddNew2 = new Security( "Security", 3400, 3, "Jolanta", "Korzen", "03.11.1989", 4, "Tarnow" );
		employeesList2.add( securityAddNew2 );
		Admin adminAddNew2 = new Admin( "Admin", 7800, 5, "Pawe³", "Tymczasowy", "22.11.1992", 5, "Gdañsk" );
		employeesList2.add( adminAddNew2 );
		Branch branchAddNew2 = new Branch( "Instytut Sterowania i Systemów Informatycznych", "Zielona Gora", employeesList2, 2 );
		branchList.add( branchAddNew2 );
		Manager managerAddNew2 = new Manager( "Branch Manager ::== || ", branchAddNew2, 15000, 7, "Jakub", "Iglo", "23.08.1984", 2, "Lublin" );
		managerList.add( managerAddNew2 );
		branchAddNew2.setManager( managerAddNew2 );
		System.out.println( branchAddNew2.getBranchProfession() + "\n" + branchAddNew2.getManager().getProfessiony() + branchAddNew2.getManager().getFirstName() + " " + branchAddNew2.getManager().getLastName() + "\n" );	
		System.out.println( "Employees of " + branchAddNew2.getBranchProfession() );
		for( int i = 0; i < employeesList2.size(); i++ ) {
			System.out.println( branchAddNew2.getEmployeesList().get( i ).getProfessiony()+ " " + branchAddNew2.getEmployeesList().get( i ).getFirstName() + " " + branchAddNew2.getEmployeesList().get( i ).getLastName() );
		}
		return branchList;
	}
	public Branch getBranch( int id ) {
		Accountant accountantAddNew = new Accountant( "Accountant", 2600, 4, "Emil", "Kaszka", "02.01.1982", 1, "Warszawa" );
		employeesList.add( accountantAddNew );
		Cashier cashierAddNew = new Cashier( "Cashier ", 1600, 1, "Adam", "Wisienka", "23.05.1988", 2, "Kalisz" );
		employeesList.add( cashierAddNew );
		Cleaner cleanerAddNew = new Cleaner( "Cleaner", 1000, 2, "Pawel", "Dmucha", "12.12.1991", 3, "Wielopole" );
		employeesList.add( cleanerAddNew );
		Security securityAddNew = new Security( "Security", 2000, 3, "Jakubz", "Kolowrotek", "03.11.1989", 4, "Tarnow" );
		employeesList.add( securityAddNew );
		Admin adminAddNew = new Admin( "Admin", 5600, 5, "Pan", "Testowy", "22.11.1992", 5, "Gdañsk" );
		employeesList.add( adminAddNew );
		Branch branchAddNew = new Branch( "Wydzial Informatyki, Elektrotechniki i Telekomunikacji", "Zielona Gora", employeesList, 1 );
		branchList.add( branchAddNew );
		Manager managerAddNew = new Manager( "Branch Manager ::== || ", branchAddNew, 15000, 7, "Mateusz", "Mucha", "22.11.1992", 1, "Swiebodzin" );
		managerList.add( managerAddNew );
		branchAddNew.setManager( managerAddNew );
		
		Accountant accountantAddNew2 = new Accountant( "Accountant", 3600, 4, "Ewa", "Kowalska", "02.01.1982", 1, "Warszawa" );
		employeesList2.add( accountantAddNew2 );
		Cashier cashierAddNew2 = new Cashier( "Cashier ", 2200, 1, "Alicja", "Wrona", "23.05.1988", 2, "Kalisz" );
		employeesList2.add( cashierAddNew2 );
		Cleaner cleanerAddNew2 = new Cleaner( "Cleaner", 1300, 2, "Piotr", "Ducha", "12.12.1991", 3, "Wielopole" );
		employeesList2.add( cleanerAddNew2 );
		Security securityAddNew2 = new Security( "Security", 3400, 3, "Jolanta", "Korzen", "03.11.1989", 4, "Tarnow" );
		employeesList2.add( securityAddNew2 );
		Admin adminAddNew2 = new Admin( "Admin", 7800, 5, "Pawe³", "Tymczasowy", "22.11.1992", 5, "Gdañsk" );
		employeesList2.add( adminAddNew2 );
		Branch branchAddNew2 = new Branch( "Instytut Sterowania i Systemów Informatycznych", "Zielona Gora", employeesList2, 2 );
		branchList.add( branchAddNew2 );
		Manager managerAddNew2 = new Manager( "Branch Manager ::== || ", branchAddNew2, 15000, 7, "Jakub", "Iglo", "23.08.1984", 2, "Lublin" );
		managerList.add( managerAddNew2 );
		branchAddNew2.setManager( managerAddNew2 );
		
		for ( int i = 0; i < branchList.size(); i++  ) {
			branch = ( Branch ) branchList.get( i );
			if ( branch.getID() == id ) {
				System.out.println( branch.getBranchProfession() + "\n" + branch.getManager().getProfessiony() + branch.getManager().getFirstName() + " " + branch.getManager().getLastName() + "\n" );
				System.out.println( "Employees of " + branch.getBranchProfession() );
				for ( int j = 0; j < branchList.get( i ).getEmployeesList().size(); j++){
					System.out.println( branch.getEmployeesList().get( j ).getProfessiony() + " " + branch.getEmployeesList().get( j ).getFirstName() + " " + branch.getEmployeesList().get( j ).getLastName() );
				}
			}
		}
		return branch;
	}
}
