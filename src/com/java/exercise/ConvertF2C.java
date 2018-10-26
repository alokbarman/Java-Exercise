package com.java.exercise;

public class ConvertF2C {

	public static void main(String[] args) {
		celciusConverter(212);
		fahrenheitConverter(100);
	}

	static void celciusConverter(double f) {
		double c;
		c = (f - 32) * 5 / 9;
		System.out.println("Today's Temperature is:" + f + " degree Fahrenheit=" + c + " degree Celsius");
	}

	static void fahrenheitConverter(double c) {
		double f;
		f = (c * 9 / 5) + 32;
		System.out.println("Today's Temperature is:" + c + " degree Celsius=" + f + " degree Fahrenheit");

	}

}
