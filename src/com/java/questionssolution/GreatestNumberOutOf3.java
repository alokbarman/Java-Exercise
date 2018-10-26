package com.java.questionssolution;

public class GreatestNumberOutOf3 {

	public static void main(String[] args) {

		int num1 = 87;
		int num2 = 25;
		int num3 = 78;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("The greatest: " + num1);
				}
			}

		if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("The greatest: " + num2);
				}
			}

		if (num3 > num1) {
			if (num3 > num2) {
				System.out.println("The greatest: " + num3);
				}
			}

	}

}
