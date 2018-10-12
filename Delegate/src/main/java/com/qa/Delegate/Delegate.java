package com.qa.Delegate;

public class Delegate {
	private int UID;
	private int techSkills;
	private int softSkills;
	private String name;
	private String contactDetails;

	public Delegate(String name) {
		this.name = name;
	}
	
	public String getName() {return this.name;}
	
	public void setUID(int num) {this.UID = num;}
	
	public int getUID() {return this.UID;}
	
	public void remove() {
		System.out.println("Removed");
	}

	public void changeStream() {
		System.out.println("Changed");
	}

}
