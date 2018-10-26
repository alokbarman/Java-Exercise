package com.java.practicesession;

public class FindOutEvenNumbers {

	public static void main(String[] args) {
		
		int limit=100;
		System.out.println("Even Numbers between 1 and "+limit+":");
		
		for(int a=1;a<=limit;a++) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
		System.out.println("***************************");
		System.out.println("Even Numbers between 1 to 100: ");
		for(int x=1;x<=100;x++) {
			
			if(x%2==0) {
				System.out.println(x);
			}
		}

	}

}
