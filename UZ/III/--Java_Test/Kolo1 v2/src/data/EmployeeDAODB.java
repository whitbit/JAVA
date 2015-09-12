package data;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class EmployeeDAODB implements EmployeeInterface{
	private List< Employee > employeeList = new ArrayList< Employee >();
	Employee employee;

	public List< Employee > getEmployees(){
		Banker banker = new Banker( "Banker", 37, "Jakub", "Wielki", 1 );
		Informatic informatic = new Informatic( "Informatic", 22, "Mateusz", "Mucha", "Java / C++" );
		Teacher teacher = new Teacher( "Teacher", 28, "Magdalena", "Kosmos", "Programming in Java/C++" );
		employeeList.add( banker );
		employeeList.add( informatic );
		employeeList.add( teacher );		
		for( int i = 0; i < employeeList.size(); i++ ){
			employee = ( Employee )employeeList.get( i );
			if( employee instanceof Banker ){
				employee = ( Banker )employeeList.get( i );
				System.out.println( employee.getProfession() + ": " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() );
			}
			if( employee instanceof Informatic ){
				employee = ( Informatic )employeeList.get( i );
				System.out.println( employee.getProfession() + ": " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() );
			}
			if( employee instanceof Teacher ){
				employee = ( Teacher )employeeList.get( i );
				System.out.println( employee.getProfession() + ": " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() );
			}
		}
		return employeeList;
	}
	
	public Employee getEmployeeByName( String firstName ){
		Banker banker = new Banker( "Banker", 37, "Jakub", "Wielki", 1 );
		Informatic informatic = new Informatic( "Informatic", 22, "Mateusz", "Mucha", "Java / C++" );
		Teacher teacher = new Teacher( "Teacher", 28, "Magdalena", "Kosmos", "Programming in Java/C++" );
		employeeList.add( banker );
		employeeList.add( informatic );
		employeeList.add( teacher );
		for( int i = 0; i < employeeList.size(); i++ ){
			employee = ( Employee )employeeList.get( i );
			if( employee.getFirstName() == firstName ){
				System.out.println( employee.getProfession() + ": " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() );
			}
		}
		return employee;
	}
	
	public Employee getEmployeeBySurname( String lastName ){
		Banker banker = new Banker( "Banker", 37, "Jakub", "Wielki", 1 );
		Informatic informatic = new Informatic( "Informatic", 22, "Mateusz", "Mucha", "Java / C++" );
		Teacher teacher = new Teacher( "Teacher", 28, "Magdalena", "Kosmos", "Programming in Java/C++" );
		employeeList.add( banker );
		employeeList.add( informatic );
		employeeList.add( teacher );
		for( int i = 0; i < employeeList.size(); i++ ){
			employee = ( Employee )employeeList.get( i );
			if( employee.getLastName() == lastName ){
				System.out.println( employee.getProfession() + ": " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() );
			}
		}
		return employee;
	}
	
	public Employee getEmployee( int age ){
		Banker banker = new Banker( "Banker", 37, "Jakub", "Wielki", 1 );
		Informatic informatic = new Informatic( "Informatic", 22, "Mateusz", "Mucha", "Java / C++" );
		Teacher teacher = new Teacher( "Teacher", 28, "Magdalena", "Kosmos", "Programming in Java/C++" );
		employeeList.add( banker );
		employeeList.add( informatic );
		employeeList.add( teacher );
		for( int i = 0; i < employeeList.size(); i++ ){
			employee = ( Employee )employeeList.get(i );
			if( employee.getAge() == age ){
				System.out.println( employee.getProfession() + ": " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() );
			}
		}
		return employee;
	}
	
	public Employee getEmployee( String firstName, String lastName ){
		Banker banker = new Banker( "Banker", 37, "Jakub", "Wielki", 1 );
		Informatic informatic = new Informatic( "Informatic", 22, "Mateusz", "Mucha", "Java / C++" );
		Teacher teacher = new Teacher( "Teacher", 28, "Magdalena", "Kosmos", "Programming in Java/C++" );
		employeeList.add( banker );
		employeeList.add( informatic );
		employeeList.add( teacher );
		for( int i = 0; i < employeeList.size(); i++ ){
			employee = ( Employee )employeeList.get(i );
			if( ( employee.getFirstName() == firstName ) && ( employee.getLastName() == lastName ) ){
				System.out.println( employee.getProfession() + ": " + employee.getFirstName() + " " + employee.getLastName() + " Age: " + employee.getAge() );
			}
		}
		return employee;
	}

}
