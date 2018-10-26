package Exercise.InheritanceEmployee2;

public class PartTimeEmployee extends EmployeeInformation{
	
	PartTimeEmployee(){
		name = "Vincent";
		job = "Part Time";
		designation = "QA";
		address = "NJ";
		salary = 1800;
	}
	void display() {
		System.out.println("************************");
		System.out.println("Employee Name: "+ name);
		System.out.println("Job Type: "+ job);
		System.out.println("Job Designation:"+ designation);
		System.out.println("Address: "+address);
		System.out.println("Salary: $"+salary+" per week");
	}
	

}
