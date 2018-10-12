package com.qa.Factorial;

public class Factorial {

	public int reverseFac(int n) {
		int i;
		for (i = 2; i < n ; i++) {
			
			n = n /i;
			
		}
		return i+1;

	}
}
