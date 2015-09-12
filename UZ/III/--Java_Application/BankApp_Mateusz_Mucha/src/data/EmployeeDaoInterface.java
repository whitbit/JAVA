package data;

import java.util.List;
import model.Employee;

public interface EmployeeDaoInterface {
	public List< Employee > getAllEmployees();
	public Employee getEmployee( int id );
}
