package Exercise.InheritanceEmployee;

public class PartTimeEmployees extends Employee{
	
	int workingHours, rate;
	
	PartTimeEmployees(){
		System.out.println("Enter Number of working hours: ");
		workingHours = input.nextInt();
	}
	
	void salaryCalculation() {
		rate = 15*workingHours;
	}
	void display() {
		System.out.println("********************"+"\n"+"Part time employee Details"+"\n"+"**********");
		System.out.println("Number of working hours: "+ workingHours);
		System.out.println("Salary for "+workingHours+ " working hours is: $"+rate);
	}
	
	
	
	
	
	

}
