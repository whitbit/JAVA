package com.javahash.hibernate;

import java.util.Date;
import org.hibernate.Session;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateSessionManager.getSessionFactory().openSession();
		 
		session.beginTransaction();
		User user = new User();
 
		user.setUserId(2);
		user.setUsername("James2");
		user.setCreatedBy("Application2");
		user.setCreatedDate(new Date());
 
		session.save(user);
		session.getTransaction().commit();

	}

}
