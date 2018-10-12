package com.qa.Doggo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		// printLoop(1, 100);
		/*System.out.println(articulateNum(19));
		System.out.println(articulateNum(42));
		System.out.println(articulateNum(20));
		System.out.println(articulateNum(80));
		System.out.println(articulateNum(560));
		*/
		printLoop(8);
	}
	
	public static void printLoop(int input) {
		List<String> tempList = new ArrayList<String>();
		for (int i = 1; i <= 100; i++) {
			if(!(i==input)) 
				tempList.add(articulateNum(i));
				if(tempList.size()==9) {
					System.out.println(tempList);
					tempList.removeAll(tempList);
				}
		}

	}
	
	public static String articulateNum(int num) {
		String wordNum;
		String[] oneToNineteen = {"0th","1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th",
				"10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th",
				"19th" };
		String[] multipleOfTens = { "2", "3", "4", "5", "6", "7", "8", "9", "10"};

		if (num <= 19) {
			return wordNum = oneToNineteen[num];
		} else if (num <= 100) {
			int ten = (int) Math.floor(num / 10);
			return wordNum = multipleOfTens[ten - 2] + oneToNineteen[num % 10];
		}  else {
			System.out.println("Syntax Error");
			return "";
		}

	}
}
