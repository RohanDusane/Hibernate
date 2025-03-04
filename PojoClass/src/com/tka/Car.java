package com.tka;

public class Car {
	
	private String Model;
	private String color;
	private int cost;
	private int speed ;
	private String company;
	
	public Car() {
		
	}

	public Car(String model, String color, int cost, int speed, String company) {
		super();
		Model = model;
		this.color = color;
		this.cost = cost;
		this.speed = speed;
		this.company = company;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [Model=" + Model + ", color=" + color + ", cost=" + cost + ", speed=" + speed + ", company="
				+ company + "]";
	}
	
	
}
