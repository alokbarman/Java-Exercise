package Exercise.InheritanceEmployee;

import java.util.Scanner;

public class Employee {
	
	String name;
	String job;
	String designation;
	String address;
	
	Scanner input = new Scanner(System.in);
	Employee(){
		System.out.println("Enter the name of employee: ");
		name = input.nextLine();
		System.out.println("Enter job type: ");
		job = input.nextLine();
		System.out.println("Enter designation: ");
		designation = input.nextLine();
		System.out.println("Enter address: ");
		address = input.nextLine();
	}
	void display() {
		System.out.println("Employee name: "+ name);
		System.out.println("Job Type: "+ job);
		System.out.println("Designation: "+ designation);
		System.out.println("Address: "+ address);
	}
	
	
	
	
	
	

}
