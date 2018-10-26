package com.java.OOPs.Interface.MultipleInheritance;

public class Employee implements Developer, Manager{

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.show();
		obj.display();

	}

	@Override
	public void show() {
		
		System.out.println("Hello Good Morning");
	}

	@Override
	public void display() {
		System.out.println("How are you?");
		
	}

}
