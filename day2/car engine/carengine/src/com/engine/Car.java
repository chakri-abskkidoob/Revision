package com.engine;

public class Car extends Engine{
	private String model;
	private String companyName;
	private String color;
	private Engine engine;
	public Car(String model, String companyName, String color, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", companyName=" + companyName + ", color=" + color + ", engine=" + engine + "]";
	}
	
}
