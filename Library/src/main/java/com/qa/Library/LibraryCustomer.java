package com.qa.Library;

public class LibraryCustomer {
	private int customerID;
	private String customerName;
	private String customerAddress;
	private String customerPhoneNumber;
	
	public LibraryCustomer(int customerID,  String customerName, String customerAddress, String customerPhoneNumber) {
		this.setCustomerID(customerID);
		this.setCustomerName(customerName);
		this.setCustomerAddress(customerAddress);
		this.setCustomerPhoneNumber(customerPhoneNumber);
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

}
