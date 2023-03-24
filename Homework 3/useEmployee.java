public class useEmployee
{
	public static void main(String[] args)
	{
		Employee[] employees = new Employee[100];
		
		employees[0] = new Employee(6120, "Anthony, Susan B.", 37, 360000.00, "MTS 3", "Engineers");
		employees[1] = new Manager(1215, "Deleon, Amanda", 53, 225000.00, "Manager Level 3", "Research and Development");
		employees[2] = new Executive(2, "Rothschild, Baron", 79, 500000.00, "Chairman", "Engineers", 0.15);
		employees[3] = new Employee(8978, "Rothschild, Tyron", 23, 42000.00, "MTS 1", "Engineers");
		employees[4] = new Employee(5950, "Yates, Fred", 37, 360000.00, "MTS 3", "Scientists");
		
		((Manager)(employees[1])).addEmployee(employees[0]);
		((Manager)(employees[1])).addEmployee(employees[3]);
		((Manager)(employees[1])).addEmployee(employees[4]);
		
		System.out.println("Amanda's direct reports: ");
		
		((Manager)(employees[1])).printEmployeeList(); // why not use toString() here?
		System.out.println("\n--- All Employees ---\n");
		
		// employees[0].changeSalary(employees, 8978, 25000); ** OLD STYLE ** Why is this not optimal?
		
		int index = employees[0].findEmployee(employees, "Rothschild, Tyron"); // Be sure this line is understood!
		employees[index].changeSalary(25000);
		
		int i = 0;
		
		while (employees[i] != null)
			System.out.println(employees[i++]);
		

	}
} 