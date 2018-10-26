package com.java.array;

public class ArrayExamples {

	public static void main(String[] args) {
		arrayTest();
		int a[] = { 2, 5, 11, 23, 19 };
		int tst = a.length;
		System.out.println(tst);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int t;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}

	}

	public static void arrayTest() {
		int[] test = new int[5];
		test[0] = 10;
		test[1] = 20;
		test[2] = 30;
		test[3] = 10;

		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}

}
