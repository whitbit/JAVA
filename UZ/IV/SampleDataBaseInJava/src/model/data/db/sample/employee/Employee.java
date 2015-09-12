package model.data.db.sample.employee;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import model.data.db.sample.department.files.*;
import java.util.Date;

public class Employee extends Person {
	private int empno, edLevel, salary, bonus, comm = 0;	
	private String workDept, phoneno, hireDate, job, birthDate = null;
	private char midint = 0;
	private Date date = new Date();
	private SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
	
	public Employee( int empno ) throws IOException, ParseException {
		super();
		setEmpno( empno );
		setRandomData();
	}
	public Employee() throws IOException, ParseException {
		super();
		setRandomData();
	}
	public Employee( String firstname, String lastname, char sex, String birthdate ) throws IOException {
		super( firstname, lastname, sex, birthdate );
	}
	public Employee( int empno, String firstName, char midint, String lastname, String workDept, String phoneno, String hireDate, String job, int edLevel, char sex, String birthDate, int salary, int bonus, int comm ) throws IOException {
		super( firstName, lastname, sex, birthDate );
		setEmployeeData( empno, midint, workDept, phoneno, hireDate, job, birthDate, edLevel, salary, bonus, comm );
	}

	public int getEmpno() {
		return empno;
	}
	private void setEmpno( int empno ) {
		this.empno = empno;
	}
	public int getEdLevel() {
		return edLevel;
	}
	private void setEdLevel( int edLevel ) {
		this.edLevel = edLevel;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary( int salary ) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus( int bonus ) {
		this.bonus = bonus;
	}
	public int getComm() {
		return comm;
	}
	public void setComm( int comm ) {
		this.comm = comm;
	}
	public String getWorkDept() {
		return workDept;
	}
	public void setWorkDept( String workDept ) {
		this.workDept = workDept;
	}
	public String getPhoneno() {
		return phoneno;
	}
	private void setPhoneno( String phoneno ) {
		this.phoneno = phoneno;
	}
	public String getHireDate() {
		return hireDate;
	}
	private void setHireDate( String hireDate ) {
		this.hireDate = hireDate;
	}
	public String getJob() {
		return job;
	}
	public void setJob( String job ) {
		this.job = job;
	}
	public String getBirthDate() {
		return birthDate;
	}
	private void setBirthDate( String birthDate ) {
		this.birthDate = birthDate;
	}
	public char getMidint() {
		return midint;
	}
	private void setMidint( char midint ) {
		this.midint = midint;
	}
	private void setEmployeeData( int empno, char midint, String workDept, String phoneno, String hireDate, String job, String birthDate, int edLevel, int salary, int bonus, int comm ) {
		setEmpno( empno );
		setMidint( midint );
		setWorkDept( workDept );
		setPhoneno( phoneno );
		setHireDate( hireDate );
		setJob( job );
		setBirthDate( birthDate );
		setEdLevel( edLevel );
		setSalary( salary );
		setBonus( bonus );
		setComm( comm );		
	}
	private void setEdLevel() {
		Random random = new Random();
		this.edLevel = random.nextInt( 10 ) + 10;
	}
	private void setSalary() {
		Random random = new Random();
		this.salary = random.nextInt( 8000 ) + 2000;
	}
	private void setBonus() {
		Random random = new Random();
		this.bonus = random.nextInt( 900 ) + 100;
	}
	private void setComm() {
		Random random = new Random();
		this.comm = random.nextInt( 1250 ) + 250;
	}
	private void setWorkDept() throws IOException {
		Random random = new Random();
		Name name = new Name();
		List< String > deptno = name.getDeptnoList();
		int randomIndex = random.nextInt( deptno.size() );;
		this.workDept = deptno.get( randomIndex ).toString();
	}
	private void setPhoneno() {
		Random random = new Random();
		int randomIndex = random.nextInt( 899 ) + 100;
		this.phoneno = "0" + randomIndex;
	}
	private void setHireDate() throws ParseException {
		Random random = new Random();
		int day = random.nextInt( 31 );
		int month = random.nextInt( 12 );
		int year = random.nextInt( 15 ) + 2000;
		String date = year + "-" + month + "-" + day;
		this.date = ( Date )dateFormat.parse( date );
		this.hireDate = date.toString();
	}
	private void setJob() {
		Random random = new Random();
		String[] jobs = { "Developer", "Accountant", "Manager", "Admin", "Operator", "Tester", "WEB Developer", "Designer", "Engeneer" };
		this.job = jobs[ random.nextInt( jobs.length ) ];
	}
	private void setMidint() {
		Random random = new Random();
		String charsOfInitial = "ABCDEFGHIJKLMNOPRSTUWXYZ";
		this.midint = charsOfInitial.charAt( random.nextInt( charsOfInitial.length() ) );
	}
	private void setRandomData() throws IOException, ParseException {
		setMidint();
		setJob();
		setHireDate();
		setPhoneno();
		setWorkDept();
		setSalary();
		setBonus();
		setComm();
		setEdLevel();
	}
}
