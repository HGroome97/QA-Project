package com.qa.Library;

public class Book extends LibraryItem{
	private int numPages;
	
	public Book(int itemID,  String itemTitle, String itemDepartment, Boolean itemAvailable, int numPages){
		super(itemID,  itemTitle, itemDepartment, itemAvailable); 
		this.setNumPages(numPages);
	}

	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	
	@Override
	public String toString() {
		return super.getItemID() + ", " + super.getItemTitle() + ", " + super.getItemDepartment() + ", " + super.getItemAvailable() + ", " + this.getNumPages();
	}

}
