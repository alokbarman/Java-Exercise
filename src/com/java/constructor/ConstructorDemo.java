package com.java.constructor;

public class ConstructorDemo {
	int t;
	int b;
	public ConstructorDemo(String name) {
		System.out.println("my name is "+name);
	}
	public ConstructorDemo() {
		int c=15;
		t=c;
		//t=20;
		//b=30;
	}

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo("alok");
		System.out.println(obj.t);
		System.out.println(obj.b);
		System.err.println(obj1.t);

	}

}
