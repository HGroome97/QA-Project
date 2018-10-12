package com.qa.Library;

public class Maps extends LibraryItem {
	private int areaCovered;
	
	public Maps(int itemID,  String itemTitle, String itemDepartment, Boolean itemAvailable, int areaCovered){
		super(itemID,  itemTitle, itemDepartment, itemAvailable); 
		this.setAreaCovered(areaCovered);
	}

	public int getAreaCovered() {
		return areaCovered;
	}
	public void setAreaCovered(int areaCovered) {
		this.areaCovered = areaCovered;
	}
	
	@Override
	public String toString() {
		return super.getItemID() + " " + super.getItemTitle() + " " + super.getItemDepartment() + " " + super.getItemAvailable() + " " + this.getAreaCovered();
	}
	
}
