package model.data.db.sample.employee.files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract class SetDataFromFiles {
	public SetDataFromFiles() throws IOException {}
	
	public FileReader getFileReader( String path ) throws FileNotFoundException {
		return new FileReader( path );
	}
	public int countValueOfLineInFile( String path ) throws IOException {
		BufferedReader bufferReader = new BufferedReader( getFileReader( path ) );
		String line = null;
		int lineValue = 0;
		while( ( line = bufferReader.readLine() ) != null ) {
			lineValue++;
		}
		bufferReader.close(); 
		return lineValue;
	}
	public void setDataToList( String path, List< String > list ) throws IOException {
		BufferedReader bufferReader = new BufferedReader( getFileReader( path ) );
		try {
			String textLine = bufferReader.readLine();
			while( textLine != null ) {
				list.add( textLine );
				textLine = bufferReader.readLine();
			}
		} finally {
			bufferReader.close();
		}
	}
}
