package data;
import java.util.ArrayList;
import java.util.List;
import model.Employee;

public interface EmployeeInterface {
	List< Employee > employeeList = new ArrayList< Employee >();
	public List< Employee > getEmployees();
	public Employee getEmployeeByName( String firstName );
	public Employee getEmployeeBySurname( String lastName );
	public Employee getEmployee( int age );
	public Employee getEmployee( String firstName, String LastName );
}
