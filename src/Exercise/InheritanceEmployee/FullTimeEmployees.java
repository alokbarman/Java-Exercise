package Exercise.InheritanceEmployee;

public class FullTimeEmployees extends Employee{
	
	double salary;
	
	FullTimeEmployees(){
		System.out.println("Enter Salary: "+salary);
		salary = input.nextDouble();
	}
	
	void display() {
		System.out.println("**************"+"\n"+"Full time employee Details:");
		super.display();
		System.out.println("Salary: "+salary);
	}

}
