package com.java.GroupExercise;

public class GreatestNumber {
	
	//3. Take three numbers from the user and print the greatest number.

	public static void main(String[] args) {
		int a=25;
		int b=87;
		int c=98;
		if(a>b && a>c) {
			System.out.println("The greatest number is a: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The greatest number is b: "+b);
		}
		else {
			System.out.println("The greatest number is c: "+c);
		}

	}

}
