package pwir_l_07_08d.model.dataFromFiles;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Name extends SetDataFromFiles {
	private final static List< String > nameList = new ArrayList< String >();
	private final static String FEMALE_NAMES_PATH = "C:/Users/ullQuiorra/GitHub/PWiR/pwir_l_07_08d/src/pwir_l_07_08d/model/DataFromFiles/namesFemale";
	private final static String MALE_NAMES_PATH = "C:/Users/ullQuiorra/GitHub/PWiR/pwir_l_07_08d/src/pwir_l_07_08d/model/DataFromFiles/namesMale";
	
	public Name() throws IOException {
		setDataToList( FEMALE_NAMES_PATH, nameList );
		setDataToList( MALE_NAMES_PATH, nameList );
	}

	public List< String > getFemaleNames() throws IOException {
		List< String > femaleNames = new ArrayList< String >();
		for( int i = 0; i < countValueOfLineInFile( FEMALE_NAMES_PATH ); i++ ) {
			femaleNames.add( nameList.get( i ) );
		}
		return femaleNames;
	}
	public List< String > getMaleNames() throws IOException {
		List< String > maleNames = new ArrayList< String >();
		for( int i = countValueOfLineInFile( FEMALE_NAMES_PATH ); i < getNameList().size(); i++ ) {
			maleNames.add( nameList.get( i ) );
		}
		return maleNames;
	}
	public List< String > getNameList() {
		return nameList;
	}
}
