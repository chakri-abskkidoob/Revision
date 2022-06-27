package com.engine;

public class Demo {

	public static void main(String[] args) {
		Engine e = new Engine(450, 1000, "Tata", true);
		Car c = new Car("Harrier", "Tata", "Black", e);
		System.out.println("Car Model: "+c.getModel());
		System.out.println("Car company name: "+c.getCompanyName());
		System.out.println("Car color: "+c.getColor());
		System.out.println("Car RPM: "+e.getRmp());
		System.out.println("Car power: "+e.getPower());
		System.out.println("Car Engine manufacturer: "+e.getManufacturer());
		System.out.println("Car Has Turbo: "+e.isTurbo());
	}

}
