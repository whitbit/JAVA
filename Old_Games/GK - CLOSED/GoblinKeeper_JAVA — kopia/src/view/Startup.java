package view;

import model.creatures.*;

public class Startup {
	public static void main( String[] args ) {
		CreatureInterface creature = new Imp();
		System.out.println( creature.getResistance() );
	}	
}








/*


//import java.io.Closeable;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

private Connection connect = null;//obiekt tworz¹cy po³¹czenie z baz¹ danych.
private Statement statement = null;//obiekt pozwalaj¹cy tworzyæ nowe wyra¿enia SQL

//Database
		try {
            Class.forName( "com.mysql.jdbc.Driver" ).newInstance();
            connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/goblinKeeperDatabase", "root", "root" );
            statement = connect.createStatement();
            System.out.println( "Connected..." );
        } catch ( InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e ) {
        	System.out.println( "Not Connected..." );
            e.printStackTrace();
        }

*/