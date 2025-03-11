package com.tka;

import jakarta.persistence.Entity;

@Entity
public class employee {
	
	private int Emp_id;
	private String name;
	private String city;
	private int age ;
	private String Department;
	private String Email;
	private int salary;
	
	public employee() {
		
	}

	public employee(int emp_id, String name, String city, int age, String department, String email, int salary) {
		super();
		Emp_id = emp_id;
		this.name = name;
		this.city = city;
		this.age = age;
		Department = department;
		Email = email;
		this.salary = salary;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", name=" + name + ", city=" + city + ", age=" + age + ", Department="
				+ Department + ", Email=" + Email + ", salary=" + salary + "]";
	}
	
}
 


