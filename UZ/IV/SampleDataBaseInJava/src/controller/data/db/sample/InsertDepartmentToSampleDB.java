package controller.data.db.sample;
import java.io.IOException;
import java.sql.SQLException;
import model.data.db.InsertDataToSampleDB;

public class InsertDepartmentToSampleDB {
	public InsertDepartmentToSampleDB( int valueOfEmployees ) throws IOException, SQLException {
		InsertDataToSampleDB.addDepartments( valueOfEmployees );
	}
}
