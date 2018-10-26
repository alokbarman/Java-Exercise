package com.java.practicesession;

public class NestedLoopPyramidIncrement {

	public static void main(String[] args) {
		for(int x=0;x<=5;x++) { //outer for loop is increasing
			for(int y=x;y>0;y--) { //inner for loop is decreasing
				System.out.print("*");
			}
			System.out.println("*");
		}

	}

}
