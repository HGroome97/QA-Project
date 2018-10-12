package com.qa.Library;

import static org.junit.Assert.*;

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
	public void addCustomerTest() {
		Library lib = new Library();
		LibraryCustomer libCust = new LibraryCustomer(1, "Jeff", "QA Academy", "999");
		lib.addCustomer(libCust);
		assertNotNull(lib.returnCustomerList());
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
}
