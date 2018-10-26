package com.java.OOPs.Polymorphism;

public class PolymorphismFundamental {

	public static void main(String[] args) {
		
		//  Polymorphism:
		
		//Static or Compile time Polymorphism: The process of binding the overloaded method within object at compile time is known as 
		//Static Polymorphism. Static Polymorphism in Java is achieved by method overloading.
		//Different ways to overload the method: There are two ways to overload the method in java
		//1. By changing number of arguments or parameters
		//2. By changing the data type
		//due to static Polymorphism utilization of resources (main memory space) is poor because for each and every overloaded method a 
		//memory space is created at compile time when it binds with an object.
		
		//Dynamic or Runtime Polymorphism: Dynamic Polymorphism in Java is achieved by method overriding
		//Advantage of Java Method Overriding:
		//Method Overriding is used to provide specific implementation of a method that is already provided by its super class.
		//Method Overriding is used for Runtime Polymorphism
		//Rules for Method Overriding:
		//method must have same name as in the parent class.
		//method must have same parameter as in the parent class.
		//must be IS-A relationship (inheritance).
		//In dynamic Polymorphism method of the program binds with an object at runtime the advantage of dynamic Polymorphism is allocating 
		//the memory space for the method (either for overloaded method or for override method) at run time.
		//Java programming does not support static Polymorphism because of its limitations and java always supports dynamic Polymorphism.

		//Inheritance in Java:
		//The process of obtaining the data members and methods from one class to another class is known as inheritance.
		//It is one of the fundamental features of object-oriented programming.

		//Important points:
		//In the inheritance the class which is give data members and methods is known as base or super or parent class.
		//The class which is taking the data members and methods is known as sub or derived or child class.
		//The data members and methods of a class are known as features.
		//The concept of inheritance is also known as re-usability or extendable classes or sub classing or derivation.
		//Why use Inheritance ?
		//For Method Overriding (used for Runtime Polymorphism).
		//It's main uses are to enable polymorphism and to be able to reuse code for different classes by putting it in a common super class
		//For code Re-usability
		//Tpyes of Inheritance
		//Based on number of ways inheriting the feature of base class into derived class we have five types of inheritance:
		//1.Single inheritance
		//2.Multiple inheritance:The concept of multiple inheritance is not supported in java through concept of 
		                          //classes but it can be supported through the concept of interface.
		//3.Hierarchical inheritance
		//4.Multilevel inheritance: Single base class + single derived class + multiple intermediate base classes.
		//5.Hybrid inheritance
	}

}
