package manage;
import java.util.List; 
import java.util.Iterator; 
import org.hibernate.Criteria;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import employee.Employee;
import model.hibernate.connection.HibernateUtil;

public class ManageEmployee {
	private static SessionFactory factory = HibernateUtil.getSessionFactory();
	
	
	
	public static void main( String[] args ) {
		Session session = factory.openSession();
		//ManageEmployee ME = new ManageEmployee();
		/* Add few employee records in database */
		/*Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
		Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = ME.addEmployee("John", "Paul", 10000);	*/	
		/* List down all the employees */
	    //ME.listEmployees();
	    /* Update employee's records */
	    //ME.updateEmployee(empID1, 5000);
	    /* Delete an employee from the database */
	    //ME.deleteEmployee(empID2);
	    /* List down new list of the employees */
	    //ME.listEmployees();
		Criteria criteria = session.createCriteria( Employee.class );
		
		
		Criterion salary = Restrictions.gt( "salary", 4999 );
		Criterion name = Restrictions.ilike( "firstName","%ai%" );
		// To get records matching with OR condistions
		/*LogicalExpression orExp = Restrictions.or( salary, name );
		criteria.add( orExp );*/
		// To get records matching with AND condistions
		LogicalExpression andExp = Restrictions.and( salary, name );
		criteria.add( andExp );
		List< Employee > results = criteria.list();
		for( Employee employee : results ) {
			System.out.print( employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary() + "\n" );
		}
		

      
   }
	
	
	
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         Employee employee = new Employee(fname, lname, salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return employeeID;
   }
   /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to UPDATE salary for an employee */
   public void updateEmployee(Integer EmployeeID, int salary ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Employee employee = 
                    (Employee)session.get(Employee.class, EmployeeID); 
         employee.setSalary( salary );
		 session.update(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to DELETE an employee from the records */
   public void deleteEmployee(Integer EmployeeID){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Employee employee = 
                   (Employee)session.get(Employee.class, EmployeeID); 
         session.delete(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
}
