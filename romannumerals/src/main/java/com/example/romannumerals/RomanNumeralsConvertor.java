package com.example.romannumerals;

public class RomanNumeralsConvertor {

	public int convert(String romanNumerals) {
		
		int tot = 0;
		
		if (romanNumerals.startsWith("x")) {
			return 10;
		} 
		else if (romanNumerals.startsWith("ix")) {
			return 9;
		} 
		else if (romanNumerals.startsWith("iv")) {
			return 4;
		} 
		else if (romanNumerals.startsWith("v")) {
			tot = 5;
			romanNumerals = romanNumerals.substring(1);
		}
		return tot += dealWithUnits(romanNumerals);

	}

	private int dealWithUnits(String romanNumerals) {
		return romanNumerals.length();
	}

}
