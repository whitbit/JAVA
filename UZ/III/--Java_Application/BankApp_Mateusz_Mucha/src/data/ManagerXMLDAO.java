package data;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class ManagerXMLDAO implements ManagerDaoInterface {
	public List< Manager > getAllManager( ) {
		List< Employee > employeesList = new ArrayList< Employee >();
		List< Employee > employeesList2 = new ArrayList< Employee >();
		List< Branch > branchList = new ArrayList< Branch >();
		List< Manager > managerList = new ArrayList< Manager >();
		
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
		Manager managerAddNew = new Manager( "Manager ", branchAddNew, 15000, 7, "Mateusz", "Mucha", "22.11.1992", 1, "Swiebodzin" );
		managerList.add( managerAddNew );
		managerAddNew.setBranch( branchAddNew );
		
		System.out.println( managerAddNew.getProfessiony() + managerAddNew.getFirstName() + " " + managerAddNew.getLastName() );	
		System.out.println( "Branch: " + managerAddNew.getBranch().getBranchProfession() + "\n\nEmployees of manager: " + managerAddNew.getFirstName() + " " + managerAddNew.getLastName() );
		for( int i = 0; i < employeesList.size(); i++ ) {
			System.out.println( employeesList.get( i ).getProfessiony() + " " + employeesList.get( i ).getFirstName() + " " + employeesList.get( i ).getLastName()  );
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
		Manager managerAddNew2 = new Manager( "Manager ", branchAddNew2, 15000, 7, "Jakub", "Iglo", "23.08.1984", 2, "Lublin" );
		managerList.add( managerAddNew2 );
		managerAddNew2.setBranch( branchAddNew2 );
		
		System.out.println( managerAddNew2.getProfessiony() + managerAddNew2.getFirstName() + " " + managerAddNew2.getLastName() );	
		System.out.println( "Branch: " + managerAddNew2.getBranch().getBranchProfession() + "\n\nEmployees of manager: " + managerAddNew2.getFirstName() + " " + managerAddNew2.getLastName() );	
		for( int i = 0; i < employeesList2.size(); i++ ) {
			System.out.println( employeesList2.get( i ).getProfessiony() + " " + employeesList2.get( i ).getFirstName() + " " + employeesList.get( i ).getLastName()  );
		}
		return managerList;
	}
	
	public Manager getManager( int id ) {
		List< Employee > employeesList = new ArrayList< Employee >();
		List< Employee > employeesList2 = new ArrayList< Employee >();
		List< Branch > branchList = new ArrayList< Branch >();
		List< Manager > managerList = new ArrayList< Manager >();
		Manager manager = null;
		
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
		Manager managerAddNew = new Manager( employeesList, "Manager ", branchAddNew, 15000, 7, "Mateusz", "Mucha", "22.11.1992", 1, "Swiebodzin" );
		managerList.add( managerAddNew );
		managerAddNew.setBranch( branchAddNew );
		
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
		Manager managerAddNew2 = new Manager( employeesList2, "Manager ", branchAddNew2, 15000, 7, "Jakub", "Iglo", "23.08.1984", 2, "Lublin" );
		managerList.add( managerAddNew2 );
		managerAddNew2.setBranch( branchAddNew2 );
		
		for ( int i = 0; i < managerList.size(); i++  ) {
			manager = ( Manager ) managerList.get( i );
			if ( manager.getID() == id ) {
				System.out.println( manager.getProfessiony() + manager.getFirstName() + " " + manager.getLastName() );
				System.out.println( "Manager of Branch: " + manager.getBranch().getBranchProfession() + "\n\nEmployees of Manager " + manager.getFirstName() + " " + manager.getLastName() );
				for ( int j = 0; j < managerList.get( i ).getEmployeesList().size(); j++) {
					System.out.println( manager.getEmployeesList().get( j ).getProfessiony() + " " + manager.getEmployeesList().get( j ).getFirstName() + " " + manager.getEmployeesList().get( j ).getLastName() );
				}
			}
		}
		return manager;
	}

}