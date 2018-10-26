package com.java.OOPs.Encapsulation.ConcreteClass;

public class EmployeesTest {

	public static void main(String[] args) {
		Employees obj = new Employees();
		obj.setEmpSsn(123456789);
		obj.setEmpName("alok");
		obj.setEmpSalary(5000);
		
		
		/*int a = obj.ssn;
		System.out.println(a);
		String str = obj.empName;
		System.out.println(str);
		double d = obj.empSalary;
		System.out.println(d);*/
		
		System.out.println(obj.getEmpSsn());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpSalary());

	}

}
