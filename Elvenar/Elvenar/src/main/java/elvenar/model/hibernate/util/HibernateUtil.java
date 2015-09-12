package elvenar.model.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * 
 * @author M.Mucha
 *
 */
public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if( sessionFactory == null ) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void setSessionFactory( SessionFactory sessionFactory ) {
		HibernateUtil.sessionFactory = sessionFactory;
	}
	public static void closeSessionFactory() {
		sessionFactory.close();
	}
}