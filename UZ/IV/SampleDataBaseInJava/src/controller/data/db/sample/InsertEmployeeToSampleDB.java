package controller.data.db.sample;
import java.io.IOException;
import java.sql.SQLException;
import model.data.db.InsertDataToSampleDB;

public class InsertEmployeeToSampleDB {
	public InsertEmployeeToSampleDB( int empno, String firstName, char midint, String lastname, String workDept, String phoneno, String hireDate, String job, int edLevel, char sex, String birthdate, int salary, int bonus, int comm ) throws IOException, SQLException {
		InsertDataToSampleDB.addEmployee( empno, firstName, midint, lastname, workDept, phoneno, hireDate, job, edLevel, sex, birthdate, salary, bonus, comm );
	}
	public InsertEmployeeToSampleDB( int valueOfEmployees ) throws IOException, SQLException {
		InsertDataToSampleDB.addRandomEmployees( valueOfEmployees );
	}
}
