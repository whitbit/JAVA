package pmp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.otv.util.HibernateUtil;

public class ActivityLogManager {
	private Integer id, activity_id, type, category_id, activity_type_id, status;
	private String parent_id, line_number, area, result, result_parameters, cpe_id;
	private List< ActivityLog >  activityLogList = null;

	public ActivityLogManager() {}
	
	public Integer getId() {
		return id;
	}
	public void setId( Integer id ) {
		this.id = id;
	}
	public Integer getActivity_id() {
		return activity_id;
	}
	public void setActivity_id( Integer activity_id ) {
		this.activity_id = activity_id;
	}
	public Integer getType() {
		return type;
	}
	public void setType( Integer type ) {
		this.type = type;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id( Integer category_id ) {
		this.category_id = category_id;
	}
	public Integer getActivity_type_id() {
		return activity_type_id;
	}
	public void setActivity_type_id( Integer activity_type_id ) {
		this.activity_type_id = activity_type_id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus( Integer status ) {
		this.status = status;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id( String parent_id ) {
		this.parent_id = parent_id;
	}
	public String getLine_number() {
		return line_number;
	}
	public void setLine_number( String line_number ) {
		this.line_number = line_number;
	}
	public String getArea() {
		return area;
	}
	public void setArea( String area ) {
		this.area = area;
	}
	public String getResult() {
		return result;
	}
	public void setResult( String result ) {
		this.result = result;
	}
	public String getResult_parameters() {
		return result_parameters;
	}
	public void setResult_parameters( String result_parameters ) {
		this.result_parameters = result_parameters;
	}
	public String getCpe_id() {
		return cpe_id;
	}
	public void setCpe_id( String cpe_id ) {
		this.cpe_id = cpe_id;
	}
		
	public String putToDB() {
		String result = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		ActivityLog al = new ActivityLog();
		al.setActivity_id( getActivity_id() );
		al.setType( getType() );
		al.setCategory_id( getCategory_id() ) ;
		al.setActivity_type_id( getActivity_type_id() );
		al.setStatus( getStatus() );
		al.setParent_id( getParent_id() );
		al.setLine_number( getLine_number() );
		al.setArea( getArea() );
		al.setResult( getResult() );
		al.setResult_parameters( getResult_parameters() );
		al.setCpe_id( getCpe_id() );

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save( al );
			transaction.commit();
			result = "SUCCESS";
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				result = "ERROR";
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		return result;
	}
	public List< ActivityLog > getActivityLogList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		this.activityLogList = session.createCriteria( ActivityLog.class ).list();
		return activityLogList;
	}
	/*public List< ActivityLog > getActivityLogsFromDB() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		this.activityLogList = session.createCriteria( ActivityLog.class ).list();
		return activityLogList;
	}*/
}
