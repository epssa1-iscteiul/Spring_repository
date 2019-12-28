package com.ederminio.soares;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Contact 
{


	@Id
	private int id;

	private String phonenmr;
	private String country;


	public int getId() 
	{
		return id;
	}

	public String getPhonenmr() 
	{
		return phonenmr;
	}
	public String getCountry() 
	{
		return country;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public void setPhonenmr(String phonenmr) 
	{
		this.phonenmr = phonenmr;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}



}
