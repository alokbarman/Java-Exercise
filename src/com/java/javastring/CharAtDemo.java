package com.java.javastring;

public class CharAtDemo {

	public static void main(String[] args) {
		String str="BD Tech";
		char ch=str.charAt(0);
		char ch1=str.charAt(1);
		char ch2=str.charAt(2);
		char ch3=str.charAt(3);
		char ch4=str.charAt(4);
		char ch5=str.charAt(5);
		char ch6=str.charAt(6);
		//char ch3=str.charAt(7);out of range gives error
		
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println("The string index 2 is"+ch2+"(empty)");
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);

	}

}
