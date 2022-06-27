package com.product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Product p = new Product();
		List<Product>productList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id...");
		p.setProductId(sc.nextInt());
		System.out.println("Enter Product Name...");
		p.setProductName(sc.next());
		System.out.println("Enter Product Price...");
		p.setProductPrice(sc.nextDouble());
		productList.add(p);
		System.out.println(productList);
	}

}
