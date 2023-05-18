package com.hibernate.tutorial.demo;

import org.hibernate.Session;

import com.hibernate.tutorial.model.Employee;
import com.hibernate.tutorial.util.HibernateUtil;

public class HibernateDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Employee emp = new Employee();
		emp.setFirstName("Tharun");
		emp.setLastName("ch");
		session.save(emp);
		session.getTransaction().commit();

	}

}
