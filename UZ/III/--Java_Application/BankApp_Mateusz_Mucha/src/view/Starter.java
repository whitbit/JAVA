package view;

import controller.BankManager;

public class Starter {
	public static void main( String[] args ) throws Exception {
		BankManager bankManager = new BankManager();
		try {
			//*Branches*//
			//bankManager.getBranchDBDAO( 1 );
			//bankManager.getAllBranchDBDAO();
			//bankManager.getBranchXMLDAO( 1 );
			//bankManager.getAllBranchXMLDAO();
			//*Customers*//
			//bankManager.getCustomerDBDAO( 6 );
			bankManager.getAllCustomersDBDAO();
			//bankManager.getCustomerXMLDAO( 1 );
			//bankManager.getAllCustomersXMLDAO();
			//*Employees*//
			//bankManager.getEmployeeDBDAO( 1 );
			//bankManager.getAllEmployeeDBDAO();
			//bankManager.getEmployeeXMLDAO( 1 );
			//bankManager.getAllEmployeeXMLDAO();
			//*Managers*//
			//bankManager.getManagerDBDAO( 1 );
			//bankManager.getAllManagerDBDAO();
			//bankManager.getManagerXMLDAO( 1 );
			//bankManager.getAllManagerXMLDAO();
		} catch ( Exception exception ) {
			System.out.println( "Fatal error: " + exception );
		}
	}
}
