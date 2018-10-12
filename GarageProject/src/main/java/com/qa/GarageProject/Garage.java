package com.qa.GarageProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
	private List<Object> garageList;
	
	public Garage() {garageList = new ArrayList<>();}
	
	public List<Object> getGarageList() {return garageList;}
	
	public void setGarageList(Object vehicle) {this.garageList.add(vehicle);}

	public int calculateVehiclePrice(Vehicle vehicleType) {
		List<Object> vehicleList = this.garageList.stream().filter(n->n.getClass()==vehicleType.getClass()).collect(Collectors.toList());
		//vehicleList.values().stream().mapToInt(Integer::intValue).sum();
		return vehicleList.size() * vehicleType.getPrice();
	}

}
