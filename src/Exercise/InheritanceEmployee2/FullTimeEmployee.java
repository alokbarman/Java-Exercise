package Exercise.InheritanceEmployee2;

public class FullTimeEmployee extends EmployeeInformation{
	
	FullTimeEmployee() {
		name = "Marium";
		job = "Full Time";
		designation = "Manager";
		address = "NY";
		salary = 8000;
		
	}
	void display() {
		System.out.println("Employee Name: "+ name);
		System.out.println("Job Type: "+ job);
		System.out.println("Job Designation:"+ designation);
		System.out.println("Address: "+address);
		System.out.println("Salary: $"+salary+" per month");
	}

}
