package com.ederminio.soares;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class Person implements Comparable<Person>{

	@Id
	private int id;

	private String name;
	private int points;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", points=" + points + "]";
	}
	@Override
	public int compareTo(Person person2) {
		if(this.id>person2.id) return -1;
		else if(this.id<person2.id)return 1;
		return 0;
	}


}
