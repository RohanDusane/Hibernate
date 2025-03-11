package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainStudent {
	
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student s = new Student();
		s.setStd_id(101);
		s.setName("Karan");
		s.setCity("pune");
		ss.persist(s);
		
		System.out.println("Data inserted succcessfully..");
		
		tr.commit();
		ss.close();
		
}	
	

}
