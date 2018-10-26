package com.java.OOPs.Abstruction.AbstractClassEx2;

public class Bike extends Vehicle{

	public static void main(String[] args) {
		/*Bike object = new Bike();
		object.run();
		object.getDetails();
		System.out.println(object.limit);*/
		
		Vehicle obj = new Bike(); // Up-casting possible
		obj.run();
		obj.getDetails();
		System.out.println(obj.limit);
		
		//Vehicle obj1 = new Vehicle(); // not possible
		//Bike obj2 = new Vehicle();   // not possible // down-casting not possible

	}

	@Override
	void run() {
		System.out.println("Running safely");
		
	}

}
