package com.java.OOPs.HierarchicalInheritanceEx1;

public class Student extends Person{
	
	void sleep(String name) {
		super.name = name;
		System.out.println(name+ " is sleeping 6 hours per day");
	}
	void writeExams() {
		System.out.println("Only students write exams");
	}

}
