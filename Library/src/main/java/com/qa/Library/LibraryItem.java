package com.qa.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public abstract class LibraryItem {
	private int itemID;
	private String itemTitle;
	private String itemDepartment;
	private Boolean itemAvailable;
	
	public LibraryItem(int itemID,  String itemTitle, String itemDepartment, Boolean itemAvailable) {
		this.setItemID(itemID);
		this.setItemTitle(itemTitle);
		this.setItemDepartment(itemDepartment);
		this.setItemAvailable(itemAvailable);
	}

	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemDepartment() {
		return itemDepartment;
	}
	public void setItemDepartment(String itemDepartment) {
		this.itemDepartment = itemDepartment;
	}

	public Boolean getItemAvailable() {
		return itemAvailable;
	}
	public void setItemAvailable(Boolean itemAvailable) {
		this.itemAvailable = itemAvailable;
	}	

	
}
