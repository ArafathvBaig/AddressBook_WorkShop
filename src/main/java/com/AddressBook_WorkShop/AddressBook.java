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
		System.out.println("State Name:: ");
		this.state = sc.nextLine();
		System.out.println("Zip Code:: ");
		this.zip_Code = sc.nextInt();
		System.out.println("Phone Number:: ");
		this.phone_Number = sc.nextLong();
		Contacts contact = new Contacts(first_Name, last_Name, address, city, state, zip_Code,phone_Number, email_Id);
        contacts.add(contact);
	}
	
	public void editContactUsingFirstName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name to Edit Contact:: ");
		String name = sc.nextLine();
		for(Contacts contact : contacts)
		{
			if(name.equals(contact.getFirstName()))
			{
				System.out.println("Contact With This First Name Found");
				System.out.println("First Name:: ");
				this.first_Name = sc.nextLine();
				contact.setFirstName(first_Name);
				System.out.println("Last Name:: ");
				this.last_Name = sc.nextLine();
				contact.setLastName(last_Name);
				System.out.println("Email:: ");
				this.email_Id = sc.nextLine();
				contact.setEmailId(email_Id);
				System.out.println("Address:: ");
				this.address = sc.nextLine();
				contact.setAddress(address);
				System.out.println("City Name:: ");
				this.city = sc.nextLine();
				contact.setCity(city);
				System.out.println("State Name:: ");
				this.state = sc.nextLine();
				contact.setState(state);
				System.out.println("Zip Code:: ");
				this.zip_Code = sc.nextInt();
				contact.setZipCode(zip_Code);
				System.out.println("Phone Number:: ");
				this.phone_Number = sc.nextLong();
			}
			else
			{
				System.out.println("No Such First Name");
			}
		}
	}
	
	public void deleteContactDetails()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Name to Delete Contact: ");
        String name=sc.nextLine();
        for (Contacts contact : contacts) 
        {
            if (name.equalsIgnoreCase(contact.getFirstName()))
            {
                System.out.println("Entered First Name Found in The Contacts, Deleting Contact");
                contacts.remove(contact);
            }
            else
            {
                System.out.println("Entered First Name Not Found in The Contacts");
            }
        }
    }
	
	public static void main(String[] args)
	{
		AddressBook ab = new AddressBook();
		ab.addContactDetails();
		ab.editContactUsingFirstName();
	}
}
