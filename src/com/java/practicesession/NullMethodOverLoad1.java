package com.java.practicesession;

public class NullMethodOverLoad1 {

	public static void main(String[] args) {
		m(null);

	}

	public static void m(String a) {
		System.out.println("String");
	}

	public static void m(int a) {
		System.out.println("int");
	}

	public static void m(Object o) {
		System.out.println("Object");
	}

}
