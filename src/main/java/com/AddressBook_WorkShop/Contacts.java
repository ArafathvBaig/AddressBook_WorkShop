package com.AddressBook_WorkShop;

public class Contacts 
{
	String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip_Code;
	Long phone_Number;
	String email_Id;

	public Contacts(String first_Name, String last_Name, String address, String city, String state, int zip_Code,
			Long phone_Number, String email_Id)
	{
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip_Code = zip_Code;
		this.phone_Number = phone_Number;
		this.email_Id = email_Id;
	}
	
	 public String getFirstName() 
	    {
	        return first_Name;
	    }
	    public void setFirstName(String first_Name) 
	    {
	        this.first_Name=first_Name;
	    }
	    public String getLastName() 
	    {
	        return last_Name;
	    }
	    public void setLastName(String last_Name) 
	    {
	        this.last_Name=last_Name;
	    }
	    public String getEmailId() 
	    {
	        return email_Id;
	    }
	    public void setEmailId(String email_Id) 
	    {
	        this.email_Id=email_Id;
	    }
	    public String getAddress()
	    {
	        return address;
	    }
	    public void setAddress(String address)
	    {
	        this.address=address;
	    }
	    public String getCity() 
	    {
	        return city;
	    }
	    public void setState(String state) 
	    {
	        this.state=state;
	    }
	    public String getState() 
	    {
	        return city;
	    }
	    public void setCity(String city) 
	    {
	        this.city=city;
	    }
	    public int getZipCode()
	    {
	        return zip_Code;
	    }
	    public void setZipCode(int zip_Code)
	    {
	        this.zip_Code=zip_Code;
	    }
	    public long getPhoneNumber() 
	    {
	        return phone_Number;
	    }
	    public void setPhoneNo(long phone_Number) 
	    {
	        this.phone_Number=phone_Number;
	    }
}
