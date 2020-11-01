package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	ArrayList<PersonInfo> persons;

	public AddressBook() {
		persons = new ArrayList<PersonInfo>();
	}

	public void addPerson() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		for (int i = 0; i < persons.size(); i++) {
			if (name.equals(persons.get(i).getName())) {
				System.out.println("name is already exist");
				TestBook.addressBookEntry();
			}
		}
		System.out.println("Enter your address");
		String add = scan.next();
		System.out.println("Enter your phone number");
		Long pNum = scan.nextLong();
		System.out.println("Enter your city");
		String city = scan.next();
		System.out.println("Enter your state");
		String state = scan.next();
		System.out.println("Enter your zip");
		String zip = scan.next();
		System.out.println("Enter your email");
		String email = scan.next();

		// construct new person object
		PersonInfo p = new PersonInfo(name, add, pNum, city, state, zip, email);
		persons.add(p);
	}

	// method to edit the person details
	public void editPerson(String name) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (name.equals(p.getName())) {
				p.print();
			}
		}
	}

	// method to delete person details
	public void deletePerson(String name) {
		// delete person record by name by iterating over array list
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (name.equals(p.getName())) {
				p.print();
				persons.remove(i);
			}
		}
	}

	// method to check duplicate name
	public void checkDuplicate(String name) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (name.equals(p.getName())) {
				p.print();
				System.out.println("Person name already exit");
			}
		}
	}

	// method to search by city name
	public void searchByCity(String city) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (city.equals(p.getCity())) {
				p.print();
			}
		}
	}

	// method to search by state name
	public void searchByState(String state) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (state.equals(p.getState())) {
				p.print();
			}
		}
	}

	// method to search by phone number
	public void searchByPhoneNum(String phNumber) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (phNumber.equals(p.getPhoneNum())) {
				p.print();
			}
		}
	}

}
