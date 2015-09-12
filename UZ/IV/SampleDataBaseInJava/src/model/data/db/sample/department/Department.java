package model.data.db.sample.department;
import java.io.IOException;
import java.util.Random;

import model.data.db.sample.department.files.Name;

public class Department {
	private int mgrno = 0;
	private String deptno, deptname, admrdept, location = null;
	
	public Department( String deptno, int mgrno, String deptname, String admrdept, String location ) throws IOException {
		setDetails( deptno, mgrno, deptname, admrdept );
		setLocation( location );
	}
	public Department( String deptno, int mgrno, String deptname, String admrdept ) throws IOException {
		setDetails( deptno, mgrno, deptname, admrdept );
		setLocation();
	}
	
	public String getDeptno() {
		return deptno;
	}
	private void setDeptno( String deptno ) {
		this.deptno = deptno;
	}
	public int getMgrno() {
		return mgrno;
	}
	private void setMgrno( int mgrno ) {
		this.mgrno = mgrno;
	}
	public String getDeptname() {
		return deptname;
	}
	private void setDeptname( String deptname ) {
		this.deptname = deptname;
	}
	public String getAdmrdept() {
		return admrdept;
	}
	private void setAdmrdept( String admrdept ) {
		this.admrdept = admrdept;
	}
	public String getLocation() {
		return location;
	}
	private void setLocation( String location ) {
		this.location = location;
	}
	private void setLocation() {
		Random random = new Random();
		String[] locationList = { "Warszawa", "Krakow", "Zielona Gora", "Wroclaw", "Poznan", "Lublin", "Szczecin" };
		this.location = locationList[ random.nextInt( locationList.length ) ];
	}
	private void setDetails( String deptno, int mgrno, String deptname, String admrdept ) {
		setDeptno( deptno );
		setMgrno( mgrno );
		setDeptname( deptname );
		setAdmrdept( admrdept );
	}
}
