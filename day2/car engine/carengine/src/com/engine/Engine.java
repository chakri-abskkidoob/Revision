package com.engine;

public class Engine {
	private int rmp;
	private int power;
	private String manufacturer;
	private boolean turbo;
	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public boolean isTurbo() {
		return turbo;
	}
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	public Engine(int rmp, int power, String manufacturer, boolean turbo) {
		super();
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
		this.turbo = turbo;
	}
	public Engine() {
		
	}

}
