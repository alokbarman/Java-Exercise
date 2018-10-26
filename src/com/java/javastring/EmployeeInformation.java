package com.java.javastring;
/*6.Write a java program which will display 5 employee information(name,
age, salary and address). try it by Incapsulation*/
public class EmployeeInformation {

	public static void main(String[] args) {
		EmployeeInformation obj=new EmployeeInformation();
		obj.empployeeInformation("Alok", 40, 4000, "New York");
		//obj.empployeeInformation(EmpName, EmpAge, EmpSalary, EmpAddress);

	}
	public void empployeeInformation(String EmpName,int EmpAge,double EmpSalary,String EmpAddress) {
		String name=EmpName;
		int age=EmpAge;
		double salary=EmpSalary;
		String address=EmpAddress;
		
		System.out.print("Employee name :"+name+" ;");
		System.out.print("Employee age :"+age+" ;");
		System.out.print("Employee salary :"+salary+" ;");
		System.out.print("Employee address :"+address+" ;");
	}

}
