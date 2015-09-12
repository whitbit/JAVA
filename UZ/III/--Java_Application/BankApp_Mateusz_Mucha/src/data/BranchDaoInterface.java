package data;

import java.util.List;

import model.Branch;

public interface BranchDaoInterface {
	public List< Branch > getAllBranch();
	public Branch getBranch( int id );
}
