package com.tutorial.hibernate_mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
	
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		
	    ArrayList<String> list1=new ArrayList<String>();    
	    list1.add("Java is a programming language");    
	    list1.add("Java is a platform");    
	        
	    ArrayList<String> list2=new ArrayList<String>();    
	    list2.add("Servlet is an Interface");    
	    list2.add("Servlet is an API");    
	        
	    Question question1=new Question();    
	    question1.setQname("What is Java?");    
	    question1.setAnswers(list1);    
	        
	    Question question2=new Question();    
	    question2.setQname("What is Servlet?");    
	    question2.setAnswers(list2);    
		
		
	    session.save(question1);
	    session.save(question2);
	    session.getTransaction().commit();
	    session.close();

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}

}
