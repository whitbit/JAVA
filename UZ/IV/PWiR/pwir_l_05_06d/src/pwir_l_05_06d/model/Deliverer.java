package pwir_l_05_06d.model;
import java.util.Random;

public class Deliverer {
	private char nameInitialOfDelivererAlphabetic = 0;
	private char lastNameInitialOfDelivererAlphabetic = 0;
	private static String charsOfInitial = "ABCDEFGHIJKLMNOPRSTUWXYZ";
	private int position = 0;
	
	public Deliverer() {
		this.nameInitialOfDelivererAlphabetic = generateNameCharOfInitial();
		this.lastNameInitialOfDelivererAlphabetic = generateLastNameCharOfInitial();
		setPosition();
	}	
	private char generateNameCharOfInitial() {
		Random generateCharOfInitial = new Random();
		return charsOfInitial.charAt( generateCharOfInitial.nextInt( charsOfInitial.length() ) );
	}
	private char generateLastNameCharOfInitial() {
		Random generateCharOfInitial = new Random();
		return charsOfInitial.charAt( generateCharOfInitial.nextInt( charsOfInitial.length() ) );
	}
	public String getNameInitialsOfDeliverer() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append( nameInitialOfDelivererAlphabetic ); 
		stringBuilder.append( "." );
		stringBuilder.append( lastNameInitialOfDelivererAlphabetic );
		stringBuilder.append( "." );
		return stringBuilder.toString();
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