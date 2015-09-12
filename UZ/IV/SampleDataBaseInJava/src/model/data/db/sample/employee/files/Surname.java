package model.data.db.sample.employee.files;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Surname extends SetDataFromFiles {
	private final static List< String > surnameList = new ArrayList< String >();
	private final static String FEMALE_Surname_PATH = "C:/Users/ullQuiorra/GitHub/JAVA/SampleDataBaseInJava/src/model/data/db/sample/employee/files/txt/surnamesFemale";
	private final static String MALE_Surname_PATH = "C:/Users/ullQuiorra/GitHub/JAVA/SampleDataBaseInJava/src/model/data/db/sample/employee/files/txt/surnamesMale";
	
	public Surname() throws IOException {
		setDataToList( FEMALE_Surname_PATH, surnameList );
		setDataToList( MALE_Surname_PATH, surnameList );
	}

	public List< String > getFemaleSurname() throws IOException {
		List< String > femaleSurname = new ArrayList< String >();
		for( int i = 0; i < countValueOfLineInFile( FEMALE_Surname_PATH ); i++ ) {
			femaleSurname.add( surnameList.get( i ) );
		}
		return femaleSurname;
	}
	public List< String > getMaleSurname() throws IOException {
		List< String > maleSurname = new ArrayList< String >();
		for( int i = countValueOfLineInFile( FEMALE_Surname_PATH ); i < getSurnameList().size(); i++ ) {
			maleSurname.add( surnameList.get( i ) );
		}
		return maleSurname;
	}
	public List< String > getSurnameList() {
		return surnameList;
	}
}