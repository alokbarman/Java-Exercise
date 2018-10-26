package com.java.practicesession;

public class LargestNumber {
	/*Write a program called FindLargestNumber which takes 5 numbers from the user and find the largest number
	 *  among them.*/

	public static void main(String[] args) {
		int a=25;
		int b=77;
		int c=96;
		int d=125;
		int f=2;
		
		int largest= Math.max(a, Math.max(b, Math.max(c, Math.max(d, f))));
		if(largest==a) {
			System.out.println("Largest number="+a);
		}
		else if(largest==b) {
			System.out.println("Largest number="+b);
		}
		else if(largest==c) {
			System.out.println("Largest number="+c);
		}
		else if(largest==d) {
			System.out.println("Largest number="+d);
		}
		else {
			System.out.println("Largest number="+f);
		}

	}

}
