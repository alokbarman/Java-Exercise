package com.java.inheritance.method;

public class ReturnTypeMethodInheritanceTest extends ReturnTypeMethodInheritance{

	public static void main(String[] args) {
		
	ReturnTypeMethodInheritanceTest obj=new ReturnTypeMethodInheritanceTest();
	int a = obj.addition();
	int b= obj.subtraction();
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
	}

}
