package com.qa.GarageProject;

public class Hovercraft extends Vehicle {
	
	public int takeOffDistance;
	
	public Hovercraft(int takeOffDistance, int price, int numWheels, String colour, int vehicleID){
		super(price, numWheels, colour, vehicleID); 
		this.takeOffDistance = takeOffDistance;
	}

	public void drive() {}
	public void reverse() {}
	public void park() {}
	public void liftOff() {}


}
