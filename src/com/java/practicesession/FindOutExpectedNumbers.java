package com.java.practicesession;

public class FindOutExpectedNumbers {
	//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
	static int x=3;
	static int y=5;
	static int limit=100;

	public static void main(String[] args) {
		divisibleBy3();
		System.out.println("\n*****************************************************");
		divisibleBy5();
		System.out.println("\n******************");
		divisibleByBoth();
	}
	
	public static void divisibleBy3() {
		for(int a=1;a<=limit;a++) {
			if(a%x==0) {
				System.out.print(a+",");
			}
		}
	}
	public static void divisibleBy5() {
		for(int b=1;b<=limit;b++) {
			if(b%y==0) {
				System.out.print(b+",");
			}
		}
	}
	public static void divisibleByBoth() {
		for(int c=1;c<=limit;c++) {
			if(c%x==0 & c%y==0) {
				System.out.print(c+",");
			}
		}
	}

}
