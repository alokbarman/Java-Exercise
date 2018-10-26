package com.java.practicesession;

public class NullMethodOverLoad2 {

	public static void main(String[] args) {
		m(null);
        //Output: The method m(String) is ambiguous for the type NullMethodOverLoad
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
	/*public static void m(Integer i) {
		System.out.println("Integer");
	}*/

}
