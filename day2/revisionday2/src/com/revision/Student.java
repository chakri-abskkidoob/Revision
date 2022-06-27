package com.revision;

public class Student {
	private int roll;
	private String name;
	private String address;
	private int marks;
	public Student() {
		
	}
	public Student(int integer, String name, String address, int marks) {
		super();
		this.roll = integer;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	public int getInteger() {
		return roll;
	}
	public void setInteger(int integer) {
		this.roll = integer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [integer=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
}
