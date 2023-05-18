package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().buildSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();
		Employee emp = new Employee();
		emp.setCompany("TCS");
		emp.setName("tharun");

		session.save(emp);

		session.getTransaction().commit();

	}

}
