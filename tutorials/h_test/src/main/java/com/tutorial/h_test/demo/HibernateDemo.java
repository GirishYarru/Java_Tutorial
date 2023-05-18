package com.tutorial.h_test.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorial.h_test.model.Employee;

public class HibernateDemo {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employee emp = new Employee();
		emp.setFirstName("hai");
		emp.setLastName("hello");
		session.save(emp);
		session.getTransaction().commit();
	}

}
