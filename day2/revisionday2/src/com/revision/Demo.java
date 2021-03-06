package com.revision;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static ArrayList<Student> data(int length1, ArrayList<Student> s1) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter Roll...");
		int roll = sc.nextInt();
		s.setInteger(roll);
		System.out.println("Enter name...");
		String name = sc.next();
		s.setName(name);
		System.out.println("Enter address...");
		String address = sc.next();
		s.setAddress(address);
		System.out.println("Enter marks...");
		int marks = sc.nextInt();
		s.setMarks(marks);
		
		s1.add(s);
		int a = s1.size();
		if(a<length1) {
			data(length1, s1);
		}
		sc.close();
		return s1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int length1 = sc.nextInt();
		ArrayList<Student> s1 = new ArrayList<Student>();
		data(length1, s1);
		sc.close();
		System.out.println(s1);
		int sum = 0;
		for(Student m1 : s1) {
			sum = sum+m1.getMarks();	
		}
		System.out.println(sum/s1.size());
	}

}
