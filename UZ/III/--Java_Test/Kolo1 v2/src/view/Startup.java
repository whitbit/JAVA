package view;
import controller.EmployeeManager;

public class Startup {
	public static void main( String[] args ) {
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.getEmployees();
		//employeeManager.getEmployeeByAge( 22 );
		//employeeManager.getEmployeeByName( "Mateusz" );
		//employeeManager.getEmployeeBySurname( "Kosmos" );
		//employeeManager.getEmployeeByNameAndSurname( "Jakub", "Wielki" );
	}
}
