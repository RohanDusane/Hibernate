package com.tka;

public class Hospital {
	
	private String Name;
	private String city;
	private int rooms ;
	private int nurse ;
	private String Doctor_name;
	private String Address;
	
	public Hospital() {
		
	}

	public Hospital(String name, String city, int rooms, int nurse, String doctor_name, String address) {
		super();
		Name = name;
		this.city = city;
		this.rooms = rooms;
		this.nurse = nurse;
		Doctor_name = doctor_name;
		Address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getNurse() {
		return nurse;
	}

	public void setNurse(int nurse) {
		this.nurse = nurse;
	}

	public String getDoctor_name() {
		return Doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		Doctor_name = doctor_name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Hospital [Name=" + Name + ", city=" + city + ", rooms=" + rooms + ", nurse=" + nurse + ", Doctor_name="
				+ Doctor_name + ", Address=" + Address + "]";
	}

}
