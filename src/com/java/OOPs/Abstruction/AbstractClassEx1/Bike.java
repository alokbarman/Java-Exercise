package com.java.OOPs.Abstruction.AbstractClassEx1;

public class Bike extends Vehicle{
	
	int a = 10;

	public static void main(String[] args) {
		/*Bike obj1 = new Bike();
		obj1.wheel();
		obj1.speed();*/
		
		Vehicle obj = new Bike();
		obj.wheel();
		obj.speed();
		obj.mileage();
		
		//Vehicle obj2 = new Vehicle(); // not possible
		
      //An object of abstract class cannot be created directly, but it can be created indirectly. 
		//It means you can create an object of abstract derived class.
	}

	@Override
	void wheel() {
		System.out.println("Bike is two wheeler");
		
	}

	@Override
	void speed() {
		System.out.println("Speed limit is 25 mile/hour");
		
	}

}
