package view;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import model.data.db.InsertDataToSampleDB;
import model.sql.SQLConnection;
import model.sql.SQLInterface;

public class Start {
	private static SQLInterface sql = null;
	private static ResultSetMetaData resultSetMetaData = null;
	private static final int valueOfEmployees = 200;/*Employees number where deparments value depends from position in files*/
	
	public Start() throws SQLException, IOException {}
	
	public static void main( String[] args ) throws IOException, SQLException, ParseException {
		
		System.out.println( "Sample Database" );
	
	}
	
	
	
	/*
	 * Use only when your database sample is empty, this method generate data to employees and departments tables.
	 */
	private static void setDataToSampleTables() throws IOException, SQLException, ParseException {
		sql = new SQLConnection( "sample" ); 
		InsertDataToSampleDB.addDepartments( valueOfEmployees );
		InsertDataToSampleDB.addRandomEmployees( valueOfEmployees );
		closeConnection( sql );
	}
	/*
	 * For close connection.
	 */
	private static void closeConnection( SQLInterface sql ) throws SQLException, IOException {
		sql.getConnection().close();
		sql.getStatement().close();
		sql.getResultSet().close();
	}
	/*
	 * Here you can see all column from your table.
	 */
	private static void getColumnNames( SQLInterface sql ) throws SQLException, IOException {
		resultSetMetaData = sql.getResultSet().getMetaData();
		System.out.print( "\n\nColumn names\n"); 
		for( int i = 1; i <= resultSetMetaData.getColumnCount(); i++ ) {
			System.out.print( "[" + resultSetMetaData.getColumnLabel( i ) + "]"); 
			if( i < resultSetMetaData.getColumnCount() ) {
				System.out.print( "-");
			}
		}
	}
}