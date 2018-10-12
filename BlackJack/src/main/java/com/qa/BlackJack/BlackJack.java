package com.qa.BlackJack;

public class BlackJack {
	public int play(int num1, int num2) {
		if(num1 > 21 && num2 > 21) return 0;
		else if(num1 > 21 && num2 < 22) return num2;
		else if(num2 > 21 && num1 < 22) return num1;
		else if(num1 < 22 && num2 < 22) return Math.max(num1, num2);
		else return 0;
	}
}
