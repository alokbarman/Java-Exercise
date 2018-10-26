package com.java.practicesession;

public class SmallestNumber {
	/*Write a program called FindLargestNumber which takes 5 numbers from the user and find the smallest number
	 *  among them.*/

	public static void main(String[] args) {
		int a=25;
		int b=77;
		int c=96;
		int d=125;
		int f=2;
		int smallest= Math.min(a, Math.min(b, Math.min(c, Math.min(d, f))));
		if(smallest==a) {
			System.out.println("Smallest number="+a);
		}
		else if(smallest==b) {
			System.out.println("Smallest number="+b);
		}
		else if(smallest==c) {
			System.out.println("Smallest number="+c);
		}
		else if(smallest==d) {
			System.out.println("Smallest number="+d);
		}
		else {
			System.out.println("Smallest number="+f);
		}

	}

}
