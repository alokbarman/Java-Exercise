package com.java.practicesession;

public class FindOutOddNumers {
	//Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.

	public static void main(String[] args) {
		
		int b=99;
		System.out.println("Odd numbers between 1 and "+b+" :");
		
		for(int a=1;a<=b;a++) {
			if(a%2!=0) {
				System.out.println(a);
				System.out.println("BYE");
			}
			
		}
		System.out.println("BYE");

	}

}
