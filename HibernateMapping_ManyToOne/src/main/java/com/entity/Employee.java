package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {   // many
	
	@Id
	private int empid;
	private String ename;
	
	@ManyToOne
	@JoinColumn(name = "emp")
	private Department dept;

	public Employee() {
		
	}

	public Employee(int empid, String ename, Department dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	
	
	

}
