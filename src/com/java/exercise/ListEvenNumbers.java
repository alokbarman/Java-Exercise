package com.java.exercise;
/*
List Even Numbers Java Example
This List Even Numbers Java Example shows how to find and list even
numbers between 1 and any given number.
*/
public class ListEvenNumbers {

	public static void main(String[] args) {
		//define limit
				int limit = 50;
				
				System.out.println("Printing Even numbers between 1 and " + limit);
				
				for(int i=1; i <= limit; i++){
					
					// if the number is divisible by 2 then it is even
					if( i % 2 == 0){
						System.out.print(i + " ");
					}
				}

	}

}
