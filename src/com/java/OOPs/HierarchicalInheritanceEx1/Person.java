package com.java.OOPs.HierarchicalInheritanceEx1;

public class Person {
	
	String name;
	void sleep(String name) {
		this.name = name;
		System.out.println(name+ " is sleeping 8 hours per day");
	}
	void walk() {
		System.out.println("This is walk method from Person");
	}

}
