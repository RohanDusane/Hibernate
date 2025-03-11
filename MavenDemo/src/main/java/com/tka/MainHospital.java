package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainHospital {
	
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Hospital h = new Hospital();
		h.setName("Orchid");
		h.setDoctor_name("Dr.Sharma");
		h.setCity("Mumbai");
		h.setAddress("near CST");
		h.setNurse(15);
		h.setRooms(70);
		
		
		ss.persist(h);
		
		System.out.println("Data inserted succcessfully..");
		
		tr.commit();
		ss.close();
		
		
}

}
