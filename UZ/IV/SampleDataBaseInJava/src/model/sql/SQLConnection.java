package model.sql;
import java.sql.*;  

public class SQLConnection implements SQLInterface {
	private Connection connection = null; 
    private Statement statement = null; 
    private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private String nameOfDatabase = null;

	public SQLConnection( String nameOfDatabase ) throws SQLException {
		this.nameOfDatabase = nameOfDatabase;
		setSQLConnection();
	}
	
	public Connection getConnection() {
		return connection;
	}
	public void setConnection( Connection connection ) {
		this.connection = connection;
	}
	public Statement getStatement() {
		return statement;
	}
	public void setStatement( Statement statement ) {
		this.statement = statement;
	}
	public PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}
	public void setPreparedStatement( PreparedStatement preparedStatement ) {
		this.preparedStatement = preparedStatement;
	}
	public ResultSet getResultSet() {
		return resultSet;
	}
	public void setResultSet( ResultSet resultSet ) {
		this.resultSet = resultSet;
	}
	private void setConnectionDetails() throws ClassNotFoundException, SQLException {
		Class.forName( "com.mysql.jdbc.Driver" );
		setConnection( DriverManager.getConnection( "jdbc:mysql://localhost:3307/" + nameOfDatabase, "root", "root" ) );
		setStatement( connection.createStatement() );
	}
	public void setSQLConnection() throws SQLException  {
		try {
			setConnectionDetails();
			System.out.println( "Successfully load driver class and connection to Database!" );
		} catch( ClassNotFoundException ex ) {
			System.out.println( "Error: unable to load driver class!" );
			System.exit( 1 );
		}
	}	
}
