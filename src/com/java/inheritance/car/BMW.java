package com.java.inheritance.car;

public class BMW extends Car{
//when same method is present in super/parent class as well as child class with same parameter
		//or same number of argument is called method overriding.
	public void start() { //overriden method
		System.out.println("BMW-----start");
	}
	public void theftSafety() {
		System.out.println("BMW-----theftSafety");
	}

}
