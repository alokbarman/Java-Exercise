package com.java.practicesession;

public class PrintArgumentValue {

	public static void main(String[] args) {
		information("alok", 40);
		age3("Sagor", 30);

	}
	public static void information(String name, int age) {
		System.out.println(name);
		System.out.println(age);
		
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
