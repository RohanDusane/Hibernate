package com.tka;

public class Student {
	
	private int Std_id;
	private int name;
	private int city;
	
	
	public Student() {
		
	
	}


	public Student(int std_id, int name, int city) {
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


	public int getName() {
		return name;
	}


	public void setName(int name) {
		this.name = name;
	}


	public int getCity() {
		return city;
	}


	public void setCity(int city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [Std_id=" + Std_id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
