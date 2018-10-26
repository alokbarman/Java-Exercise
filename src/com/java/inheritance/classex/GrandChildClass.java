package com.java.inheritance.classex;

public class GrandChildClass extends ChildClass {

	public static void main(String[] args) {
		
		GrandChildClass obj=new GrandChildClass();
		
		obj.testChild();
		obj.display();
		obj.testGrand();
		

	}
	
	void testGrand() {
		System.out.println("my test");
	}

}
