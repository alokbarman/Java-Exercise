package com.java.inheritance.animal;

public class Horse extends Animal {

	
    void testHorse() {
    	super.move();
    	super.sound();
    }
    void eat() {
    	System.out.println("Horse is eating");
    }
}
