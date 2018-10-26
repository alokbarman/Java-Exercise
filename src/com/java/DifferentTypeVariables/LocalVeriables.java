package com.java.DifferentTypeVariables;

public class LocalVeriables {
	static int a=10;
	int b=20;

	public static void main(String[] args) {
		LocalVeriables obj = new LocalVeriables();
		//int c =a+b;
		
		int h= a+obj.b;
		System.out.println(h);
		obj.sum();

	}
	public void sum() {
		int d=a+b;
		System.out.println(d);
	}
	public static void summation() {
		//int f= a+b;
		
	}

}
