package com.tka;

import jakarta.persistence.Entity;

@Entity
public class Student {
	
	private int Std_id;
	private String name;
	private String city;
	
	
	public Student() {
		
	
	}


	public Student(int std_id, String name, String city) {
		super();
		Std_id = std_id;
		this.name = name;
		this.city = city;
	}


	public int getStd_id() {
		return Std_id;
	}


	public void setStd_id(int std_id) {
		Std_id = std_id;
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


	@Override
	public String toString() {
		return "Student [Std_id=" + Std_id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}



