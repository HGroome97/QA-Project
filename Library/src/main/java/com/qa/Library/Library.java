package com.qa.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<LibraryItem> itemList;
	private List<LibraryCustomer> customerList;
	
	public Library() {
		itemList = new ArrayList<LibraryItem>();
		customerList = new ArrayList<LibraryCustomer>();
	}

	public List<LibraryItem> returnItemList() {
		return itemList;
	}
	public void addItem(LibraryItem libItem) {
		this.itemList.add(libItem);
	}

	
	public List<LibraryCustomer> returnCustomerList() {
		return customerList;
	}

	public void addCustomer(LibraryCustomer libCustomer) {
		this.customerList.add(libCustomer);
	}
	
	public void itemCheckIn(LibraryItem libItem) {
		libItem.setItemAvailable(true);
	}
	public void itemCheckOut(LibraryItem libItem) {
		libItem.setItemAvailable(false);
	}

}
