package model.data.db.sample.employee;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import model.data.db.sample.employee.files.Name;
import model.data.db.sample.employee.files.Surname;

public abstract class Person {
	private char sex = 'N';
	private String firstname, lastname, birthdate = null;
	private final Name PERSON_NAME = new Name();
	private final Surname PERSON_SURNAME = new Surname();
	private Date date = new Date();
	private SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
	
	public Person() throws IOException, ParseException {
		setSex();
		setFirstname();
		setLastname();
		setBirthdate();
	}
	
	public Person( String firstname, String lastname, char sex, String birthdate ) throws IOException {
		setSex( sex );
		setFirstname( firstname );
		setLastname( lastname );
		setBirthdate( birthdate );
	}
	
	public void setSex( char sex ) {
		this.sex = sex;
	}
	private void setSex() {
		Random random = new Random();
		char[] sexList = { 'F', 'M' };
		int indexOfSex = random.nextInt( sexList.length );
		this.sex = sexList[ indexOfSex ];
	}
	public char getSex() {
		return sex;
	}
	public void setFirstname( String name ) {
		this.firstname = name;
	}
	private void setFirstname() throws IOException {
		Random random = new Random();
		int indexOfName = 0;
		if( sex == 'F' ) {
			indexOfName = random.nextInt( PERSON_NAME.getFemaleNames().size() );
			this.firstname = PERSON_NAME.getFemaleNames().get( indexOfName );
		} else {
			indexOfName = random.nextInt( PERSON_NAME.getMaleNames().size() );
			this.firstname = PERSON_NAME.getMaleNames().get( indexOfName );
		}
	}
	public String getFirstname() {
		return firstname;
	}
	public void setLastname( String surname ) {
		this.lastname = surname;
	}
	private void setLastname() throws IOException {
		Random random = new Random();
		int indexOfName = 0;
		if( sex == 'F' ) {
			indexOfName = random.nextInt( PERSON_SURNAME.getFemaleSurname().size() );
			this.lastname = PERSON_SURNAME.getFemaleSurname().get( indexOfName );
		} else {
			indexOfName = random.nextInt( PERSON_SURNAME.getMaleSurname().size() );
			this.lastname = PERSON_SURNAME.getMaleSurname().get( indexOfName );
		}
	}
	public String getLastname() {
		return lastname;
	}
	private static String birthDateStringBuilder( int day, int month, int year ) {
		StringBuilder stringBuilder = new StringBuilder( day );
		stringBuilder.append( "-" );
		stringBuilder.append( month );
		stringBuilder.append( "-" );
		stringBuilder.append( year );
		return stringBuilder.toString();
	}
	private void setBirthdate() throws ParseException {
		Random random = new Random();
		int day = random.nextInt( 31 );
		int month = random.nextInt( 12 );
		int year = random.nextInt( 75 ) + 1950;
		String date = year + "-" + month + "-" + day;
		this.date = ( Date )dateFormat.parse( date );
		this.birthdate = date.toString();
	}
	public void setBirthdate( String /*dd-MM-yyyy*/birthdate ) {
		this.birthdate = birthdate;
	}
	public String getBirthdate() {
		return birthdate;
	}
}
