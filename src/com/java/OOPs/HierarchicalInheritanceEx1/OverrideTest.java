package com.java.OOPs.HierarchicalInheritanceEx1;

public class OverrideTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.writeExams(); // Only students write exams
		stu.sleep("student");// student is sleeping 6 hours per day
		stu.walk(); // This is walk method from Person
		
		
		Developer dev = new Developer();
		dev.designProject(); // Developer design the projects
		dev.sleep("Developer"); //Developer is sleeping 5hrs/day
		dev.walk(); //This is walk method from Person
		
		Person p = new Person();
		p.sleep("Person"); // Person is sleeping 8 hours per day
		p.walk(); // This is walk method from Person

	}

}
