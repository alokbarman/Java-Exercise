package Exercise.InheritanceEmployee;

public class EmployeeInformationTest {

	public static void main(String[] args) {
		FullTimeEmployees full = new FullTimeEmployees();
		full.display();
		PartTimeEmployees part = new PartTimeEmployees();
		part.salaryCalculation();
		part.display();

	}

}
