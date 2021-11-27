package com.AddressBook_WorkShop;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook 
{
	String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip_Code;
	Long phone_Number;
	String email_Id;
	
	public static ArrayList<Contacts> contacts = new ArrayList<>();
	
	public void addContactDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name:: ");
		this.first_Name = sc.nextLine();
		System.out.println("Last Name:: ");
		this.last_Name = sc.nextLine();
		System.out.println("Email:: ");
		this.email_Id = sc.nextLine();	
		System.out.println("Address:: ");
		this.address = sc.nextLine();
		System.out.println("City Name:: ");
		this.city = sc.nextLine();
		System.out.println("Zip Code:: ");
		this.zip_Code = sc.nextInt();
		System.out.println("Phone Number:: ");
		this.phone_Number = sc.nextLong();
		Contacts contact = new Contacts(first_Name, last_Name, address, city, state, zip_Code,phone_Number, email_Id);
        contacts.add(contact);
	}
	
	public static void main(String[] args)
	{
		AddressBook ab = new AddressBook();
		ab.addContactDetails();
	}

}
