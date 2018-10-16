package com.qa.Library;

import java.awt.Desktop;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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
	
	public void deleteItem(String itemTitle) {
		BiPredicate<String, String> compareString = (a,b) -> a!=b;
		itemList = itemList.stream().filter(n->compareString.test(itemTitle, n.getItemTitle())).collect(Collectors.toList());
	}
	public void deleteItem(int itemID) {
		BiPredicate<Integer, Integer> compareInt = (a,b) -> a!=b;
		itemList = itemList.stream().filter(n->compareInt.test(itemID, n.getItemID())).collect(Collectors.toList());
	}

	public void deleteCustomer(String name) {
		BiPredicate<String, String> compareString = (a,b) -> a!=b;
		customerList = customerList.stream().filter(n->compareString.test(name, n.getCustomerName())).collect(Collectors.toList());
	}
	public void deleteCustomer(int customerID) {
		BiPredicate<Integer, Integer> compareInt = (a,b) -> a!=b;
		customerList = customerList.stream().filter(n->compareInt.test(customerID, n.getCustomerID())).collect(Collectors.toList());
	}
	
	public void writeToFile() {
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss").format(Calendar.getInstance().getTime());
		File libFile = new File("libData" + timeStamp + ".txt");
		try {
			libFile.createNewFile();
			FileWriter write = new FileWriter(libFile,true);
			PrintWriter print_line = new PrintWriter(write);
			print_line.printf("%s"+"%n", "Item List:");
			for(int i = 0; i < itemList.size(); i++) {
				print_line.printf("%s"+"%n", itemList.get(i).toString());
			}
			print_line.printf("%s"+"%n", "");
			print_line.printf("%s"+"%n", "Customer List:");
			for(int i = 0; i < customerList.size(); i++) {
				print_line.printf("%s"+"%n", customerList.get(i).toString());
			}
			print_line.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		try {
			Runtime.getRuntime().exec("explorer.exe /select,");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
            dirToOpen = new File("c:\\folder");
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
		/*JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
        }*/ catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*File file = new File(file.choose()); 
		  
		BufferedReader br;
		String st; 
		try {
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				  System.out.println(st); 
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  */
		  
		 
	} 
}
	
