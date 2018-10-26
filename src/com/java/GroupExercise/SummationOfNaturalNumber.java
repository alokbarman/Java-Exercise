package com.java.GroupExercise;

public class SummationOfNaturalNumber {
	
	//11. Write a program in Java to display n terms of natural numbers and their sum.

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println("Summation of 1 to 10 is: "+sum);

	}

}
