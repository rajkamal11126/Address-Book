package com.bridgelabz.addressbook;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		addressBookEntry();
	}

	public static void addressBookEntry() {
		Scanner scan = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		String s;
		int cs;

		// choices for edit delete and edit the details
		while (true) {
			System.out.println("enter 1 for person detail");
			System.out.println("enter 2 for edit");
			System.out.println("enter 3 for delete");
			System.out.println("enter 4 for check duplicate");
			System.out.println("enter 5 for search person by city name");
			System.out.println("enter 6 for search person by state name");
			System.out.println("enter 7 to exit");
			cs = scan.nextInt();
			switch (cs) {
			case 1:
				ab.addPerson();
				break;
			case 2:
				System.out.println("Enter name to edit");
				s = scan.next();
				ab.editPerson(s);
				break;
			case 3:
				System.out.println("Enter name to delete");
				s = scan.next();
				ab.deletePerson(s);
				break;
			case 4:
				System.out.println("Enter name to check duplicate");
				s = scan.next();
				ab.checkDuplicate(s);
				break;
			case 5:
				System.out.println("Enter city name");
				s = scan.next();
				ab.searchByCity(s);
				break;
			case 6:
				System.out.println("Enter state name");
				s = scan.next();
				ab.searchByCity(s);
				break;	
			case 7:
				System.exit(0);
			default:
				System.out.println("Enter the correct option");
			}
		}
	}

}
