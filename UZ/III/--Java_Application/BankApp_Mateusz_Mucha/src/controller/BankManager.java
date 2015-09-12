package controller;

import java.util.List;
import model.*;
import data.*;

public class BankManager {
	private CustomerDaoInterface customerDBDAO = new CustomerDBDAO();
	private CustomerDaoInterface customerXMLDAO = new CustomerXMLDAO();
	private EmployeeDaoInterface employeeDBDAO = new EmployeeDBDAO();
	private EmployeeDaoInterface employeeXMLDAO = new EmployeeXMLDAO();
	private BranchDaoInterface branchDBDAO = new BranchDBDAO();
	private BranchDaoInterface branchXMLDAO = new BranchXMLDAO();
	private ManagerDaoInterface managerDBDAO = new ManagerDBDAO();
	private ManagerDaoInterface managerXMLDAO = new ManagerXMLDAO();

	//Customers
	public void setCustomerToDatabase( int cash, String cardNumber, String firstName, String lastName, String dateOfB, int id, String address ) throws Exception {
		customerDBDAO.setCustomer( cash, cardNumber, firstName, lastName, dateOfB, id, address );
	}
	public Customer getCustomerDBDAO( int id ) throws Exception {
		return customerDBDAO.getCustomer( id );
	}	
	public List< Customer > getAllCustomersDBDAO() throws Exception {
		return customerDBDAO.getAllCustomers();
	}
	public Customer getCustomerXMLDAO( int id ) throws Exception {
		return customerXMLDAO.getCustomer( id );
	}
	public List< Customer > getAllCustomersXMLDAO() throws Exception {
		return customerXMLDAO.getAllCustomers();
	}
	//Employees
	public Employee getEmployeeXMLDAO( int id ) throws Exception {
		return employeeXMLDAO.getEmployee( id );
	}
	public List< Employee > getAllEmployeeXMLDAO() throws Exception {
		return employeeXMLDAO.getAllEmployees();
	}
	public Employee getEmployeeDBDAO( int id ) throws Exception {
		return employeeDBDAO.getEmployee( id );
	}
	public List< Employee > getAllEmployeeDBDAO() throws Exception {
		return employeeDBDAO.getAllEmployees();
	}
	//Branches
	public Branch getBranchXMLDAO( int id ) throws Exception {
		return branchXMLDAO.getBranch( id );
	}
	public List< Branch > getAllBranchXMLDAO() throws Exception {
		return branchXMLDAO.getAllBranch();
	}
	public Branch getBranchDBDAO( int id ) throws Exception {
		return branchDBDAO.getBranch( id );
	}
	public List< Branch > getAllBranchDBDAO() throws Exception {
		return branchDBDAO.getAllBranch();
	}
	//Managers
	public Manager getManagerXMLDAO( int id ) throws Exception {
		return managerXMLDAO.getManager( id );
	}
	public List< Manager > getAllManagerXMLDAO() throws Exception {
		return managerXMLDAO.getAllManager();
	}
	public Manager getManagerDBDAO( int id ) throws Exception {
		return managerDBDAO.getManager( id );
	}
	public List< Manager > getAllManagerDBDAO() throws Exception {
		return managerDBDAO.getAllManager();
	}	
}
