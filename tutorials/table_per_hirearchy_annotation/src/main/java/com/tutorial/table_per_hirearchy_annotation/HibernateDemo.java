package com.tutorial.table_per_hirearchy_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employee e1=new Employee();    
	    e1.setName("Gaurav Chawla");    
	        
	    RegularEmployee e2=new RegularEmployee();    
	    e2.setName("Vivek Kumar");    
	    e2.setSalary(50000);    
	    e2.setBonus(5);    
	        
	    ContractEmployee e3=new ContractEmployee();    
	    e3.setName("Arjun Kumar");    
	    e3.setPay_per_hour(1000);    
	    e3.setContract_duration("15 hours"); 
	    session.save(e1);
	    session.save(e2);
	    session.save(e3);
	    session.getTransaction().commit();
	    session.close();
		
		
		
	}

}
