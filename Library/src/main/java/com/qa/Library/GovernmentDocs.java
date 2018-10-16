package com.qa.Library;

public class GovernmentDocs extends LibraryItem{
	private String govDepartment;
	
	public GovernmentDocs(int itemID,  String itemTitle, String itemDepartment,Boolean itemAvailable, String govDepartment){
		super(itemID,  itemTitle, itemDepartment, itemAvailable); 
		this.setGovDepartment(govDepartment);
	}

	public String getGovDepartment() {
		return govDepartment;
	}
	public void setGovDepartment(String govDepartment) {
		this.govDepartment = govDepartment;
	}

	@Override
	public String toString() {
		return super.getItemID() + ", " + super.getItemTitle() + ", " + super.getItemDepartment() + ", " + super.getItemAvailable() + ", " + this.getGovDepartment();
	}
}
