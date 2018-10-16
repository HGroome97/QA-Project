package com.qa.Library;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;
import org.junit.Test;

public class LibraryTest {
	
	@Test
	public void itemListTest() {
		Library lib = new Library();
		lib.returnItemList();
	}
	@Test
	public void customerListTest() {
		Library lib = new Library();
		lib.returnCustomerList();
	}

	@Test
	public void addItemTest() {
		Library lib = new Library();
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		lib.addItem(libBook);
		assertNotNull(lib.returnItemList());
	}
	@Test
	public void deleteItemTestTitle() {
		Library lib = new Library();
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		Book libBook2 = new Book(3, "Java for Experts", "I.T.", true, 1234);
		Maps libMap = new Maps(2, "Map of England", "Stats", true, 24);
		lib.addItem(libBook);
		lib.addItem(libMap);
		lib.addItem(libBook2);
		lib.deleteItem("Java for Dummies");
		assertEquals("Delete item by name",2,lib.returnItemList().size());
	}
	@Test
	public void deleteItemTestID() {
		Library lib = new Library();
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		Book libBook2 = new Book(3, "Java for Experts", "I.T.", true, 1234);
		Maps libMap = new Maps(2, "Map of England", "Stats", true, 24);
		lib.addItem(libBook);
		lib.addItem(libMap);
		lib.addItem(libBook2);
		lib.deleteItem(2);
		assertEquals("Delete item by ID",2,lib.returnItemList().size());
	}
	
	@Test
	public void addCustomerTest() {
		Library lib = new Library();
		LibraryCustomer libCust = new LibraryCustomer(1, "Jeff", "QA Academy", "999");
		lib.addCustomer(libCust);
		assertNotNull(lib.returnCustomerList());
	}
	@Test
	public void deleteCustomerTestTitle() {
		Library lib = new Library();
		LibraryCustomer libCust = new LibraryCustomer(1, "Jeff", "QA Academy", "999");
		LibraryCustomer libCust2 = new LibraryCustomer(2, "Dave", "QA Academy", "321");

		lib.addCustomer(libCust);
		lib.addCustomer(libCust2);
		lib.deleteCustomer("Dave");
		assertEquals("Delete cust by name",1,lib.returnCustomerList().size());
	}
	@Test
	public void deleteCustomerTestID() {
		Library lib = new Library();
		LibraryCustomer libCust = new LibraryCustomer(1, "Jeff", "QA Academy", "999");
		LibraryCustomer libCust2 = new LibraryCustomer(2, "Dave", "QA Academy", "321");

		lib.addCustomer(libCust);
		lib.addCustomer(libCust2);
		lib.deleteCustomer(2);
		assertEquals("Delete cust by ID",1,lib.returnCustomerList().size());
	}
	
	@Before
	@Test
	public void getItemIDTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		assertEquals("get ID", 1, libBook.getItemID());
	}
	@Test
	public void setItemIDTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		libBook.setItemID(2);
		assertEquals("set ID", 2, libBook.getItemID());
	}

	@Before
	@Test
	public void getItemTitleTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		assertEquals("get Title", "Java for Dummies", libBook.getItemTitle());
	}
	@Test
	public void setItemTitleTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		libBook.setItemTitle("Test Title");
		assertEquals("set Title", "Test Title", libBook.getItemTitle());
	}

	@Before
	@Test
	public void getItemDepartmentTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		assertEquals("get Department", "I.T.", libBook.getItemDepartment());
	}
	@Test
	public void setItemDepartmentTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		libBook.setItemDepartment("Test Department");
		assertEquals("set Department", "Test Department", libBook.getItemDepartment());
	}

	@Before
	@Test
	public void getItemAvailableTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		assertEquals("get Department", true, libBook.getItemAvailable());
	}
	@Test
	public void setItemAvailableTest() {
		Book libBook = new Book(1, "Java for Dummies", "I.T.",true, 123);
		libBook.setItemAvailable(false);
		assertEquals("set false", false, libBook.getItemAvailable());
	}

	@Test
	public void itemCheckInTest() {
		Library lib = new Library();
		Book libBook = new Book(1, "Java for Dummies", "I.T.", false, 123);
		lib.itemCheckIn(libBook);
		assertEquals("check in", true, libBook.getItemAvailable());
	}
	@Test
	public void itemCheckOutTest() {
		Library lib = new Library();
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		lib.itemCheckOut(libBook);
		assertEquals("check in", false, libBook.getItemAvailable());
	}

	@Test
	public void writeToFileTest() {
		Library lib = new Library();
		
		Book libBook = new Book(1, "Java for Dummies", "I.T.", true, 123);
		Book libBook2 = new Book(3, "Java for Experts", "I.T.", true, 1234);
		Maps libMap = new Maps(2, "Map of England", "Stats", true, 24);
		lib.addItem(libBook);
		lib.addItem(libMap);
		lib.addItem(libBook2);
		
		LibraryCustomer libCust = new LibraryCustomer(1, "Jeff", "QA Academy", "999");
		LibraryCustomer libCust2 = new LibraryCustomer(2, "Dave", "QA Academy", "321");
		lib.addCustomer(libCust);
		lib.addCustomer(libCust2);
		
		lib.writeToFile();
	}
	
	@Test
	public void readFromFile() {
		Library lib = new Library();
		lib.readFromFile();
	}
}
