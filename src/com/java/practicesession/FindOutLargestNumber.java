package com.java.practicesession;

public class FindOutLargestNumber {
	/*Write a program called FindLargestNumber which takes 4 numbers from the user and find the largest number
	 *  among them.*/

	public static void main(String[] args) {
		int a=25;
		int b=77;
		int c=96;
		int d=125;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("Largest number "+a);
				}
				else {
					System.out.println("Largest number "+d);
				}
			}
			else {
				if(c>d) {
					System.out.println("Largest number "+c);
				}
				else {
					System.out.println("Largest number "+d);
				}
			}
			
		}
		else {
			if(b>c) {
				if(b>d) {
					System.out.println("Largest number "+b);
				}
				else {
					System.out.println("Largest number "+d);
				}
			}
			else {
				if(c>d) {
					System.out.println("Largest number "+c);
				}
				else {
					System.out.println("Largest number "+d);
				}
			}
		}
			
	}

}
