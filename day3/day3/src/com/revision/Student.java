package com.revision;

public class Student extends Person{
	private int studentId;
	private String courseEnrolled;
	private int courseFee;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public Student(int studentId, String courseEnrolled, int courseFee) {
		super();
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}
	
	public Student(int i, String string, int j, Address a) {
		
	}
	
	
}
