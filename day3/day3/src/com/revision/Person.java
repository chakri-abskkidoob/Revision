package com.revision;

public class Person extends Address{
	private String name;
	private String gender;
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	
	
}
