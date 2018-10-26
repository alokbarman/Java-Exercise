package com.java.exercise;

public class Factorial {

	public static void main(String[] args) {
		int i,fact=1;
		int number=7;
		
		for(i=1;i<=7;i++) {
			
			fact=fact*i;	
			System.out.println(fact);	//1,2,6,24,120,720,5040
		}
		System.out.println("Factorial of "+number+" is:"+ fact);

	}

}
