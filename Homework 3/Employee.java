public class Employee
{
	public Employee() 
	{
		IDnumber = 0;
		Name = "john, doe";
		Age = 00;
		Salary = 0000;
		Title = "none";
		Department = "none";
	}
	public Employee(int getIDnumber, String getName, int getAge, double getSalary, String getTitle, String getDepartment)
	{
		IDnumber = getIDnumber;
		Name = getName;
		Age = getAge;
		Salary = getSalary;
		Title = getTitle;
		Department = getDepartment;
	}	
	
	public static void printEmployee(Employee employee)
	{
		System.out.println();
		System.out.println(employee.IDnumber);
		System.out.println(employee.Name);
		System.out.println(employee.Age);
		System.out.println(employee.Salary);
		System.out.println(employee.Title);
		System.out.println(employee.Department);
	}
	
	public static int findEmployee(Employee[] employees, String Name)
	{
		int size = employees.length - 1;
		int low = 0;
		int high = size - 1;
		
		while (high >= low)
		{
			int middle = (low + high) / 2;
			if(employees[middle] == null)
			{
				high = middle -1;
				continue;
			}
			if ((employees[middle].Name).compareTo(Name) == 0)
			{
				return middle;
			}
			if ((employees[middle].Name).compareTo(Name) < 0)
			{
				low = middle + 1;
			}
			if ((employees[middle].Name).compareTo(Name) > 0)
			{
				high = middle - 1;
			}
					
		}
		return -1;
	}
	
	public void changeSalary(int raise)
	{
		Salary = Salary + raise;
	}
	
	public void changeSalary(double raise)
	{
		if (raise > 1)
		{
			System.out.println("max raise is 1.0 including the decimal for percentage increases other wise enter the full raise amount.");
		}
		else
		{
		Salary = Salary * (1 + raise);
		}
	}
	public double getSalary()
	{
		return Salary;
	}
	
	public String toString()
	{
		return IDnumber + "\n" + Name + "\n" + Age + "\n" + Salary + "\n" + Title + "\n" + Department + "\n";
	}
	
protected int IDnumber;
protected String Name;
protected int Age;
protected double Salary;
protected String Title;
protected String Department;
}