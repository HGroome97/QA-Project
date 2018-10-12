package com.qa.Delegate;

import java.awt.List;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PersonManager {
	private java.util.List<Person> personList;
	
	
	public void addToPersonManager(Person p) {
		this.personList.add(p);
	}
	
	public void getPersonManager() {
		this.personList.stream().forEach(System.out::println);
	}
	
	
	public static java.util.List<Person> searchByName(String name, java.util.List<Person> PeopleList) {
		PeopleList = PeopleList.stream().filter(n -> n.getName()==name).collect(Collectors.toList());
		return PeopleList;
	}
}
