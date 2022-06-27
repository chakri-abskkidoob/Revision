package com.revision;
import java.util.*;

public class Factorial {
	public static void factorial(int a) {
		int fact = 1;
		for(int j = 1; j<=a; j++) {
			fact = fact*j;
		}
		System.out.println("Factorial of "+a+":"+fact);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter items...");
		for(int a = 0; a<n; a++) {
			array[a] = sc.nextInt();
		}
		if(n > 2) {
			System.out.println("Error");
		}
		else if(n == 2) {
			int y = array[0]-array[1];
			if(y<0) {
				y = y*-1;
				factorial(y);
			}
			else {
				factorial(y);
			}
			
		}
		else {
			factorial(array[0]);
		}
		sc.close();

	}

}
