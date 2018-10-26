package com.java.OOPs.Encapsulation.Ex3;

public class EmployeTest {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setEmpSsn(123456789);
		obj.setEmpName("Alok");
		obj.setEmpSalary(5000);
		
		
		System.out.println(obj.getEmpSsn());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpSalary());

	}

}
