package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Laptop;
import com.entities.Student;

public class MainClass {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Laptop l = new Laptop();
		l.setLid(1200);
		l.setLname("Asus");
		ss.persist(l);
		
		Student s = new Student();
	//	s.setSid(1);   Auto_increment no need to write
		s.setSname("Rohan");
		s.setlap(1);
		
		ss.persist(s);
		
		System.out.println("Data is inserted...");
		
		tr.commit();
		ss.close();
		
	}

}
