package com.java.OOPs.Interface.SingleInheritance1;

public class Employee implements Person{
	

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.run();

	}

	@Override
	public void run() {
		
		System.out.println(" Override method from Interface Person");
		
	}

}
