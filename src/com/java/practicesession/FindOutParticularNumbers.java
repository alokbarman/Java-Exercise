package com.java.practicesession;

public class FindOutParticularNumbers {
	//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.

	public static void main(String[] args) {
		int limit=100;
		for(int a=1;a<=limit;a++) {
			if(a%3==0) {
				//System.out.println(a);
				System.out.print(a+",");
			}
		}
		System.out.println("\n*************************************************************");
		int number=100;
		for(int b=1;b<=number;b++) {
			
				if(b%5==0) {
					System.out.print(b+",");
				}
			}
		System.out.println("\n*******************");
		int totalNumbers=100;
		for(int c=1;c<=totalNumbers;c++) {
			if(c%3==0 & c%5==0) {
				System.out.print(c+",");
			}
		}
		}
		
	}

