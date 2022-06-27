package com.revision;

public class CustomException {

	public static void main(String[] args) {
		try {
			throw new MyException("Custom");
		}catch(MyException exp) {
			System.out.println("Hi this is my catch block");
			System.out.println(exp);
		}

	}

}
