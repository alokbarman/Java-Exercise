package com.java.OOPs.SingleInheritanceEx1;

public class OverridingTest {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.walk(); //Man----Man can walk fast
//Whenever we are calling overridden method using derived class object reference the highest priority is given to current class (derived class).
		obj.eat(); //Child----Human eat for living
		
		System.out.println("******************************");
		
		Parent object = new Parent();
		object.walk(); //Walking----Human can walk
		object.eat(); //Walking----Human eat for living
		
		System.out.println("******************************");
		
		Parent obj1 = new Child();
		obj1.walk(); // Child----child can walk fast
		obj1.eat(); //Parent----Human eat for living
		
		System.out.println("******************************");
		
		//Man object1 = new Walking();

	}

}
