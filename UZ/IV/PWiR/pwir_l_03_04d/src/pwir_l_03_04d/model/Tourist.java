package pwir_l_03_04d.model;
import java.util.Random;

public class Tourist {
	private char nameInitialOfTouristAlphabetic = 0;
	private char lastNameInitialOfTouristAlphabetic = 0;
	private static String charsOfInitial = "ABCDEFGHIJKLMNOPRSTUWXYZ";
	public Tourist() {
		this.nameInitialOfTouristAlphabetic = generateNameCharOfInitial();
		this.lastNameInitialOfTouristAlphabetic = generateLastNameCharOfInitial();
	}	
	private char generateNameCharOfInitial() {
		Random generateCharOfInitial = new Random();
		return charsOfInitial.charAt( generateCharOfInitial.nextInt( charsOfInitial.length() ) );
	}
	private char generateLastNameCharOfInitial() {
		Random generateCharOfInitial = new Random();
		return charsOfInitial.charAt( generateCharOfInitial.nextInt( charsOfInitial.length() ) );
	}
	public String getIdOfTourist() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append( nameInitialOfTouristAlphabetic ); 
		stringBuilder.append( "." );
		stringBuilder.append( lastNameInitialOfTouristAlphabetic );
		stringBuilder.append( "." );
		return stringBuilder.toString();
	}
}
