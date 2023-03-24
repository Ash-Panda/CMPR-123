public class Manager extends Employee
{
	int index = -1;
	Employee[] employees = new Employee[100];
	
	public Manager()
	{
		super();
	}
	public Manager(int IDnumber, String Name, int Age, double Salary, String Title, String Department)
	{
		super (IDnumber, Name, Age, Salary, Title, Department);
	}
	
	public void addEmployee(Employee employee)
	{
		employees[++index] = employee;
	}
	
	private int findEmployeeIndex(int IDnumber)
	{
		for (int i = 0; i < employees.length; i ++) 
		{
			if (employees[i] == null)
			{
				break;
			}
			if (employees[i].IDnumber == IDnumber)
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean deleteEmployee(int ID)
	{
		int index = findEmployeeIndex(ID);
		if (index != -1)
		{
			for (int i = index; i < employees.length - 1; i ++) 
			{
				employees[i] = employees[i + 1];
			}
			this.index--;
			return true;
		}
		
		return false;
	}
	
	public void printEmployeeList()
	{
		for(int i = 0; i <= index; i++)
		{
			Employee.printEmployee(employees[i]);
		}
	}
}
