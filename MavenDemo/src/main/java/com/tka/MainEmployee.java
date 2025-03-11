package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmployee {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		employee e = new employee();
		e.setEmp_id(1);
		e.setName("Anup");
		e.setCity("mumbai");
		e.setAge(23);
		e.setDepartment("HR");
		e.setEmail("anup@123");
		e.setSalary(30000);
		
		ss.persist(e);
		
		System.out.println("Data inserted succcessfully..");
		
		tr.commit();
		ss.close();
		
		
		
		 
	}

}
