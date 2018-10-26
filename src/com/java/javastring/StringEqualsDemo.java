package com.java.javastring;

public class StringEqualsDemo {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hi";
		String str3="World";
		String str4="hello";
		String str5="world";
		System.out.println("String matchin!!"+str1.equals(str4));
		System.out.println("String matchin!!"+str1.equalsIgnoreCase(str4));
		if(str1.equals(str2)) {
			System.out.println("String matches");
		}
		else {
			System.out.println("Mismatch");
		}
		

	}

}
