package model.sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface SQLInterface {
	public Connection getConnection();
	public void setConnection( Connection connection );
	public Statement getStatement();
	public void setStatement( Statement statement );
	public PreparedStatement getPreparedStatement();
	public void setPreparedStatement( PreparedStatement preparedStatement );
	public ResultSet getResultSet();
	public void setResultSet( ResultSet resultSet );
	public void setSQLConnection() throws SQLException;
}
