package com.java.inheritance.vehicle;

public class BMW extends Car{ //has-a relationship
	
	public void start() { //overriden method
		System.out.println("BMW-----start");
	}
	public void theftSafety() {
		System.out.println("BMW-----theftSafety");
	}

}
