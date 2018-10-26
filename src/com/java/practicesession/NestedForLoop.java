package com.java.practicesession;

public class NestedForLoop {
	//Write a Java program by using two for loops to produce the output shown below:

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
