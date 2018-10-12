package com.qa.GarageProject;

public abstract  class Vehicle {
	private int price;
	private int numWheels;
	private String colour;
	private int vehicleID;
	
	public Vehicle(int price, int numWheel, String colour, int vehicleID) {
		this.setPrice(price);
		this.setNumWheels(numWheel);
		this.setColour(colour);
		this.setVehicleID(vehicleID);
	}
	
	public abstract void drive();
	public abstract void reverse();
	public abstract void park();
	
	public int getNumWheels() {return numWheels;}
	public void setNumWheels(int numWheels) {this.numWheels = numWheels;}
	
	public int getVehicleID() {return vehicleID;}
	public void setVehicleID(int vehicleID) {this.vehicleID = vehicleID;}

	public String getColour() {return colour;}
	public void setColour(String colour) {this.colour = colour;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
}
