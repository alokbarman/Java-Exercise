package com.java.OOPs.Abstruction.AbstractClassEx2;

public abstract class Vehicle {
	
	int limit = 40;
	
	Vehicle(){
		System.out.println("Constructor is invoked");
	}
	
	void getDetails() {
		System.out.println("It has two wheels");
	}
	
	abstract void run();

}
