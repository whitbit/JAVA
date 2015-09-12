package model.data.db;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.data.db.sample.department.*;
import model.data.db.sample.department.files.Name;
import model.data.db.sample.employee.*;
import model.sql.*;

public class InsertDataToSampleDB {
	private static SQLInterface sql;
	private static Employee emp = null;
	private static List< Employee > employeeList = new ArrayList< Employee >();
	private static Department dept = null;
	private static List< Department > departmentList = new ArrayList< Department >();

	public InsertDataToSampleDB() throws SQLException, IOException {}	
	
	private static String getInsertEmployeeQueryStringBuilder( int empno, String firstName, char midint, String lastname, String workDept, String phoneno, String hireDate, String job, int edLevel, char sex, String birthdate, int salary, int bonus, int comm ) {
		StringBuilder stringBuilder = new StringBuilder( "INSERT INTO employee values('" );
		stringBuilder.append( empno );
		stringBuilder.append( "','" );
		stringBuilder.append( firstName );
		stringBuilder.append( "','" );
		stringBuilder.append( midint );
		stringBuilder.append( "','" );
		stringBuilder.append( lastname );
		stringBuilder.append( "','" );
		stringBuilder.append( workDept );
		stringBuilder.append( "','" );
		stringBuilder.append( phoneno );
		stringBuilder.append( "','" );
		stringBuilder.append( hireDate );
		stringBuilder.append( "','" );
		stringBuilder.append( job );
		stringBuilder.append( "','" );
		stringBuilder.append( edLevel );
		stringBuilder.append( "','" );
		stringBuilder.append( sex );
		stringBuilder.append( "','" );
		stringBuilder.append( birthdate );
		stringBuilder.append( "','" );
		stringBuilder.append( salary );
		stringBuilder.append( "','" );
		stringBuilder.append( bonus );
		stringBuilder.append( "','" );
		stringBuilder.append( comm );
		stringBuilder.append( "')" );
		return stringBuilder.toString();
	}
	private static String getInsertDepartmentQueryStringBuilder( String deptno, String deptname, int mgrno, String admrdept, String location ) {
		StringBuilder stringBuilder = new StringBuilder( "INSERT INTO department values('" );
		stringBuilder.append( deptno );
		stringBuilder.append( "','" );
		stringBuilder.append( deptname );
		stringBuilder.append( "','" );
		stringBuilder.append( mgrno );
		stringBuilder.append( "','" );
		stringBuilder.append( admrdept );
		stringBuilder.append( "','" );
		stringBuilder.append( location );
		stringBuilder.append( "')" );
		return stringBuilder.toString();
	}
	private static void employeeAddQuery( Employee emp ) throws SQLException {
		sql = new SQLConnection( "sample" );
		try {
			sql.getStatement().executeUpdate( getInsertEmployeeQueryStringBuilder( emp.getEmpno(), emp.getFirstname(), emp.getMidint(),
					emp.getLastname(), emp.getWorkDept(), emp.getPhoneno(), emp.getHireDate(), emp.getJob(), emp.getEdLevel(), emp.getSex(),
					emp.getBirthdate(), emp.getSalary(), emp.getBonus(), emp.getComm() ) 
			);
		} catch( Exception e ) {
			System.out.println( e.getMessage() );
		}
	}
	public static void addEmployee( int empno, String firstName, char midint, String lastname, String workDept, String phoneno, String hireDate, String job, int edLevel, char sex, String birthdate, int salary, int bonus, int comm ) throws IOException, SQLException {		
		sql = new SQLConnection( "sample" );
		try {
			emp = new Employee( empno, firstName, midint, lastname, workDept, phoneno, hireDate, job, 
					edLevel, sex, birthdate, salary, bonus, comm 
			); 
			employeeAddQuery( emp );
		} catch( Exception e ) {
			System.out.println( e.getMessage() );
		}	
	}
	public static void addRandomEmployees( int valueOfEmployees ) throws IOException, SQLException {
		sql = new SQLConnection( "sample" );
		try {
			for( int i = 0; i < valueOfEmployees; i++ ) {
				employeeList.add( new Employee( ( i + 1 ) ) );
				employeeAddQuery( employeeList.get( i ) );
				System.out.println( ( i + 1 ) + ". Employee was added" );
			}
		} catch( Exception e ) {
			System.out.println( e.getMessage() );
		}	
	}
	private static void departmentAddQuery( Department dept ) throws SQLException {
		sql = new SQLConnection( "sample" );
		try {
			sql.getStatement().executeUpdate( getInsertDepartmentQueryStringBuilder( 
					dept.getDeptno(), dept.getDeptname(), dept.getMgrno(), dept.getAdmrdept(), dept.getLocation() )
			);
		} catch( Exception e ) {
			System.out.println( e.getMessage() );
		}	
	}
	public static void addDepartment( String deptno, int mgrno, String deptname, String admrdept ) throws IOException, SQLException {
		sql = new SQLConnection( "sample" );
		try {
			dept = new Department( deptno, mgrno, deptname, admrdept );
			departmentAddQuery( dept );
		} catch( Exception e ) {
			System.out.println( e.getMessage() );
		}		
	}	
	public static int getRandomManager( int valueOfEmployees ) {
		Random random = new Random();
		int generateMGR = random.nextInt( valueOfEmployees - 1 ) + 1;
		return generateMGR;
	}
	public static String getRandomADMRDEPT( List< String > list ) {
		Random random = new Random();
		int generateADMR = random.nextInt( random.nextInt( list.size() - 1 ) + 1 );
		return list.get( generateADMR );
	}	
	public static void addDepartments( int valueOfEmployees ) throws IOException, SQLException {
		Name name = new Name();
		List< String > deptno = name.getDeptnoList();
		List< String > departmentName = name.getDepartmentNameList();
		if( deptno.size() == departmentName.size() ) {
			try {
				sql = new SQLConnection( "sample" );
				for( int i = 0; i < deptno.size(); i ++ ) {
					departmentList.add( new Department( deptno.get( i ), getRandomManager( valueOfEmployees ), departmentName.get( i ), getRandomADMRDEPT( deptno ) ) );
					departmentAddQuery( departmentList.get( i ) );
				}
			} catch( Exception e ) {
				System.out.println( e.getMessage() );
			}
		}
	}
}
