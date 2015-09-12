package pwir_l_07_08d.model.dataFromFiles;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract class SetDataFromFiles {
	private static String line = null;
	public SetDataFromFiles() throws IOException {}
	
	public FileReader getFileReader( String path ) throws FileNotFoundException {
		return new FileReader( path );
	}
	
	private static String getLine() {
		return line;
	}
	private static String setLine(String line) {
		SetDataFromFiles.line = line;
		return line;
	}
	public int countValueOfLineInFile( String path ) throws IOException {
		BufferedReader bufferReader = new BufferedReader( getFileReader( path ) );
		setLine(null);
		int lineValue = 0;
		while( ( setLine( bufferReader.readLine() ) ) != null ) {
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
