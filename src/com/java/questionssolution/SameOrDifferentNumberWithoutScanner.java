package com.java.questionssolution;

public class SameOrDifferentNumberWithoutScanner {

	public static void main(String[] args) {
		numberComparism(12.3, 12.31);

	}

	public static void numberComparism(double num1, double num2) {
		if (Math.abs(num1 - num2) <= 0.01) {
			System.out.println("These numbers are same");
		} 
		else {
			System.out.println("These numbers are different");
		}

	}

}
