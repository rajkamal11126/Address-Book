package com.bridgelabz.addressbook;

public class PersonInfo {
	private String name;
	private String address;
	private Long phoneNum;
	private String city;
	private String state;
	private String zip;
	private String email;

	//Constructor to set the contact details
	public PersonInfo(String name, String address, Long phoneNum, String city, String state, String zip, String email) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Long getPhoneNum() {
		return phoneNum;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getEmail() {
		return email;
	}

	// method to print the entities
	public void print() {
		System.out.println("name: " + name + " address: " + address + " phone no: " + phoneNum + " city: " + city
				+ " state: " + state + " zip: " + zip + " email: " + email);
	}

}
