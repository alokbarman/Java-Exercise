package com.java.practicesession;

public class NestedLoopPyramidDecrement {

	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {

			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
