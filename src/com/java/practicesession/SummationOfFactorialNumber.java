package com.java.practicesession;

public class SummationOfFactorialNumber {

	public static void main(String[] args) {
		int number=5,fact=1;
		
		for(int i=1;i<5;i++) {
			fact=fact*i;
		}
		System.out.println("Summation of "+number+" is "+ fact);

	}

}
