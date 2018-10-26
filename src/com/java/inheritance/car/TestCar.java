package com.java.inheritance.car;

public class TestCar {
 
	public static void main(String[] args) { //static/compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		System.out.println("************");
		
		Toyota t=new Toyota();
		t.start();
		t.stop();
		t.refuel();
		t.roadsideAssistant();
		System.out.println("************");
		
		Honda h=new Honda();
		h.start();
		h.stop();
		h.refuel();
		h.awd();
		System.out.println("************");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("************");
	
       //Top Casting: child class object can be referred by parent class reference variable-->
		//dynamic/Run-time Polymorphism
		Car c1=new BMW();
		c1.start();//BMW-----start// common method
		c1.stop();//Car---stop //overriden method
		c1.refuel();//Car---refuel
		
		//BMW b1=new Car();// not allowed
		//BMW b1=(BMW)new Car();// allowed but it will give ClassCastException

	}

}
