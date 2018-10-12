//import java.lang.*;

public class Iteration {
	public static void main(String[] args) {
		// printLoop(1, 100);
		System.out.println(articulateNum(19));
		System.out.println(articulateNum(42));
		System.out.println(articulateNum(900));
		System.out.println(articulateNum(729));
		System.out.println(articulateNum(560));
	}

	public static void printLoop(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}

	public static String articulateNum(int num) {
		String wordNum;
		String[] oneToNineteen = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		String[] multipleOfTens = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (num <= 19) {
			return wordNum = oneToNineteen[num];
		} else if (num < 100) {
			int ten = (int) Math.floor(num / 10);
			return wordNum = multipleOfTens[ten - 2] + " " + oneToNineteen[num % 10];
		} else if (num >= 100 && num < 1000) {
			int hundred = (int) Math.floor(num / 100);
			wordNum = oneToNineteen[hundred] + " hundred";
			if (num % 100 == 0) {
				return wordNum;
			} else {
				int ten = (int) Math.floor((num - (hundred * 100)) / 10);
				if (num % 10 == 0) {
					return wordNum = wordNum + " and " + multipleOfTens[ten - 2];
				} else {
					return wordNum = wordNum + " and " + multipleOfTens[ten - 2] + " " + oneToNineteen[num % 10];
				}

			}
		} else {
			System.out.println("Syntax Error");
			return "";
		}

	}

}
