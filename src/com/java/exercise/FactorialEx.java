package com.java.exercise;

public class FactorialEx {

	public static void main(String[] args) {
		int number=7;
		int fact=factorial(number);
		
		System.out.println("Factorial of "+ number+ " is: "+ fact);

	}
    static int factorial(int n) {
    	if (n==0)
    		return 1;
    	else
    		return(n*factorial(n-1));
    }

}
