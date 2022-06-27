package com.revision;

public class MyException extends Exception{
	String str1;
	public MyException(String str2) {
		str1 = str2;
	}
	public String toString() {
		return ("Output String = "+str1);
	}
}
