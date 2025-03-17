package com.entities;

import jakarta.persistence.Id;


public class Bike {
	
	@Id
	private int no;
	private String model;
	private int cost;
	
	public Bike() {
		
		
	}

	public Bike(int no, String model, int cost) {
		super();
		this.no = no;
		this.model = model;
		this.cost = cost;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Bike [no=" + no + ", model=" + model + ", cost=" + cost + "]";
	}
	

}
