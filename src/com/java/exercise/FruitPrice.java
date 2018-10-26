package com.java.exercise;

public class FruitPrice {

	int a = 1;
	String fruit1 = "Mango";
	double b = 2;
	String fruit2 = "Orange";
	float c = 3;
	String fruit3 = "Apple";

	public static void main(String[] args) {
		FruitPrice obj = new FruitPrice();

		String str = name("BD Tech");

		System.out.println(str);

		System.out.println(obj.fruit1 + ":" + obj.a);
		System.out.println(obj.fruit2 + ":" + obj.b);
		System.out.println(obj.fruit3 + ":" + obj.c);
	}

	public static String name(String p) {

		String c;

		c = "My School name is " + p;
		return c;

	}

}
