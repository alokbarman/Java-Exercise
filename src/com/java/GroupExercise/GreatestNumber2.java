package com.java.GroupExercise;

public class GreatestNumber2 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 80, 90, 100, 50, 100 };

		int num = a.length;
		System.out.println(num);
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Greatest number is: " + max);
	}
}
