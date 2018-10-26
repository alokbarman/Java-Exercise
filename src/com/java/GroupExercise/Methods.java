package com.java.GroupExercise;

public class Methods {
	
	int a=30;
	int b=40;
	int c=50;

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.sum1(30);
		obj.sum2();
		obj.sum3();

	}
	public void sum1(int m) {
		int x = m+a;
		System.out.println(x);
	}
	public void sum2() {
		int y = b;
		int r = y+b;
		System.out.println(r);
	}
	public void sum3() {
		int z = c;
		System.out.println(z+z);
	}

}
