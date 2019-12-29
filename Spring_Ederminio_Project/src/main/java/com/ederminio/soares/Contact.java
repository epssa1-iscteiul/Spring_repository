package com.ederminio.soares;

import java.io.Serializable;

import javax.persistence.Entity; 
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Contact  implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String phonenmr;
	private String country;

	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id",  insertable = true, updatable = true)
	private Person person;	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

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

	@Override
	public String toString() {
		return "Contact [id=" + id + ", phonenmr=" + phonenmr + ", country=" + country + ", person=" + person + "]";
	}
	
	



}
