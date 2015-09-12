package model.data.db.sample.department.files;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.data.db.sample.employee.files.SetDataFromFiles;

public class Name extends SetDataFromFiles {
	private final static List< String > nameList = new ArrayList< String >();
	private final static List< String > deptnoList = new ArrayList< String >();
	private final static String NAMES_PATH = "C:/Users/ullQuiorra/GitHub/JAVA/SampleDataBaseInJava/src/model/data/db/sample/department/files/txt/departmentName";
	private final static String DEPTNO_PATH = "C:/Users/ullQuiorra/GitHub/JAVA/SampleDataBaseInJava/src/model/data/db/sample/department/files/txt/deptno";
	
	public Name() throws IOException {
		setDataToList( NAMES_PATH, nameList );
		setDataToList( DEPTNO_PATH, deptnoList );
	}

	public List< String > getDepartmentNameList() {
		return nameList;
	}
	public List< String > getDeptnoList() {
		return deptnoList;
	}
}