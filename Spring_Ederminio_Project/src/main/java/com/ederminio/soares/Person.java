package com.ederminio.soares;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class Person implements Comparable<Person>, Serializable
{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;
	private int points;

	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL,mappedBy = "person")
	private Contact contact;

	
	public void setContact(Contact contact) 
	{
		this.contact = contact;
	}


	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getPoints() 
	{
		return points;
	}
	public void setPoints(int points) 
	{
		this.points = points;
	}
	@Override
	public String toString() 
	{
		return "Person [id=" + id + ", name=" + name + ", points=" + points + " contact: "+contact+"]";
	}
	@Override
	public int compareTo(Person person2) 
	{
		if(this.id>person2.id) return -1;
		else if(this.id<person2.id)return 1;
		return 0;
	}


}
