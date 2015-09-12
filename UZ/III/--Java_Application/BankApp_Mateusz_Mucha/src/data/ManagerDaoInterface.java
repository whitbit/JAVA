package data;

import java.util.List;

import model.Manager;

public interface ManagerDaoInterface {
	public List< Manager > getAllManager();
	public Manager getManager( int id );
}
