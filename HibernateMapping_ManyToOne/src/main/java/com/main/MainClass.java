package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Department;

public class MainClass {
	
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Department d = new Department();
		d.setDid(101);
		d.setDname("HR");
		
		d.setEmp(null);
		
		Employee e1 = new Employee();
		e1.setEmpid(1234);
		e1.setEname("Riyansh");
		e1.setDept(d);
		
		Employee e2 = new Employee();
		e2.setEmpid(123456);
		e2.setEname("Kalash");
		e2.setDept(d);
		
		ArrayList<Employee> List = new ArrayList<Employee>();
		List.add(e1);
		List.add(e2);
		
		d.setEmp(List);
		
		
		
		System.out.println("Mapping Successfully....");
		
		tr.commit();
		ss.close();
	

}

}
