package pwir_l_07_08d.model;
import pwir_l_07_08d.model.dataFromFiles.*;

import java.io.IOException;
import java.util.Random;

public class Deliverer {
	private char sex = 'N';
	private String firstname = null;
	private String lastname = null;
	private Name PERSON_NAME = null;
	private Surname PERSON_SURNAME = null;
	private int position = 0;
	
	public Deliverer() throws IOException {
		setSex();
		setFullName();
		setPosition();
	}
	
	public Deliverer( String firstname, String lastname ) throws IOException {
		setSex();
		setFirstname( firstname );
		setLastname( lastname );
		setPosition();
	}
	public char getSex() {
		return sex;
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname( String name ) {
		this.firstname = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname( String surname ) {
		this.lastname = surname;
	}
	private void setFullName() throws IOException {
		Random random = new Random();
		PERSON_NAME = new Name();
		PERSON_SURNAME = new Surname();
		int indexOfName = 0;
		int indexOfSurname = 0;
		if( getSex() == 'F' ) {
			indexOfName = random.nextInt( PERSON_NAME.getFemaleNames().size() );
			this.firstname = PERSON_NAME.getFemaleNames().get( indexOfName );
			indexOfSurname = random.nextInt( PERSON_SURNAME.getFemaleSurname().size() );
			this.lastname = PERSON_SURNAME.getFemaleSurname().get( indexOfSurname );
		} else {
			indexOfName = random.nextInt( PERSON_NAME.getMaleNames().size() );
			this.firstname = PERSON_NAME.getMaleNames().get( indexOfName );
			indexOfSurname = random.nextInt( PERSON_SURNAME.getMaleSurname().size() );
			this.lastname = PERSON_SURNAME.getMaleSurname().get( indexOfSurname );
		}
	}
	public String getFullNameOfDeliverer() {
		return getFirstname() + " " + getLastname();
	}
	public int getPosition() {
		return position;
	}
	private void setPosition() {
		Random generatePosition = new Random();
		int position = generatePosition.nextInt( 100 );
		this.position = position;
	}
}