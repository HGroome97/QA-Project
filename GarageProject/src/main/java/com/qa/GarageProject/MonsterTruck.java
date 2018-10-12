package com.qa.GarageProject;

public class MonsterTruck extends Vehicle {
	private String regPlate;
	
	public MonsterTruck(String regPlate, int price, int numWheels, String colour, int vehicleID){
		super(price, numWheels, colour, vehicleID); 
		this.setRegPlate(regPlate);
	}
	
	public String getRegPlate() {return regPlate;}
	public void setRegPlate(String regPlate) {this.regPlate = regPlate;}

	public void drive() {}
	public void reverse() {}
	public void park() {}
	public void jump() {}
	
	@Override
	public String toString() {
		return this.getRegPlate() + " " + super.getPrice() + " " + super.getNumWheels() + " " + super.getColour() + " " + super.getVehicleID();
	}

}
