package jsf_h_company.model.employee;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import jsf_h_company.model.employee.emp.Employee;
import jsf_h_company.model.hibernate.util.HibernateUtil;

public class EmployeeDAO implements Serializable {
	private static final long serialVersionUID = 7399875804298340362L;
	public String name, surname, city, birthdate, profession, branch;
	public Integer age, salary, id, count;
	private List< Employee > empList, getByBranch = null;
	private String result;

	public EmployeeDAO() {
		setBase();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public enum Result {
		FAILED( 2, "FAILED" ),
		SUCCESS( 1, "SUCCESS" ),
		ERROR( 0, "ERROR" ),
		OKaY( 3, "OK" );
		
		private int id; 
		private String result;
		private Result( int id, String result ) {
			this.id = id;
			setResult( result );
		}	
		
		public String getResult() {
			return result;
		}
		private void setResult( String result ) {
			this.result = result;
		}
		public String toString() {
			return getResult();
		}
	}	
	private void setBase() {
		setName( null );
		setSurname( null );
		setCity( null );
		setBirthdate( null );
		setProfession( null );
		setBranch( null );
		setAge( null );
		setSalary( null );
		setId( null );
		this.result = Result.OKaY.toString();
	}	

	public String addEmployee() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Employee emp = new Employee();		
		Result RESULT = null;
		
		emp.setName( getName() );
		emp.setSurname( getSurname() );
		emp.setCity( getCity() );
		emp.setAge( getAge() );
		emp.setBirthdate( getBirthdate() );
		emp.setProfession( getProfession() );
		emp.setBranch( getBranch() );
		emp.setSalary( getSalary() );

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save( emp );
			transaction.commit();
			this.result = RESULT.SUCCESS.toString();
		} catch( Exception e ) {
			if( transaction != null ) {
				transaction.rollback();
				this.result = RESULT.ERROR.toString();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		return result;
	}
	private void setEmpList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List< Employee > list = session.createCriteria( Employee.class ).list();
		this.empList = list;
	}
	public List< Employee > getEmpList() {
		setEmpList();
		return this.empList;
	}
	public void deleteEmployee( Integer id ) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Employee emp = new Employee();	
		Result RESULT = null;
		
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			emp =  ( Employee )session.get( Employee.class, id );		
			session.delete( emp );
			transaction.commit();
			this.result = RESULT.SUCCESS.toString();
		} catch( Exception e ) {
			if( transaction != null ) {
				transaction.rollback();
				this.result = RESULT.ERROR.toString();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
	}
	
	
	
	
	
	public List< Employee > getGetByBranch() {
		setGetByBranch();
		return this.getByBranch;
	    
	}

	public void setGetByBranch() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		
		ProjectionList projectionList = Projections.projectionList()
		        .add( Projections.alias( Projections.groupProperty( "branch" ), "branch" ) )
		        .add( Projections.alias( Projections.rowCount(), "count" ) )
		        .add( Projections.groupProperty( "branch" ), "branch" )
		        .add( Projections.rowCount(), "count" );
		
		List< Employee > list = session.createCriteria( EmployeeDAO.class )
				//.add( Restrictions.gt( "salary", 5000 ) )
				.setProjection( projectionList ).list();
		

		this.getByBranch = list;
		
		
		
		
		ScrollableResults getByBranch = query.scroll( ScrollMode.FORWARD_ONLY );

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
