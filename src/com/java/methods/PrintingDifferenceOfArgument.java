package com.java.methods;

public class PrintingDifferenceOfArgument {

	public static void main(String args[]) {
		age("Alok", 20);
		System.out.println(age2("BDTECH"));
		age3("Shohag", 28);
		String str = age2("BD Tech");
		System.out.println(str + "\naddress in ozone park");
	}
	public static void age(String p, int m) {
		int b;
		String c;
		c = p;
		b = m;
		System.out.println("My name: " + c + " " + "My age: " + b);
	}
	public static void age1(String p, int m) {
		int b;
		String c;
		c = p;
		b = m;
		System.out.println("My name: " + c + " " + "My age: " + b);
	}
	public static String age2(String p) {
		String c;
		c = "My School is " + p;
		return c;
	}
	public static void age3(String p, int m) {
		int b;
		String c;
		c = p;
		b = m;
        System.out.println(p+" "+m);
		System.out.println("My name: " + c + " " + "My age: " + b);
	}
}