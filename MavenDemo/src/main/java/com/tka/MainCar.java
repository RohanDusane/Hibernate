package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainCar {
	
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Car c = new Car();
		c.setModel("creta");
		c.setCompany("kia");
		c.setCost(16000000);
		c.setColor("black");
	    c.setSpeed(240);
		
		
		ss.persist(c);
		
		System.out.println("Data inserted succcessfully..");
		
		tr.commit();
		ss.close();
		
		
}

}
