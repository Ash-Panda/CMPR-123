public class Executive extends Manager
{
	public Executive()
	{
		super();
		Bonus = 0.1;
	}
	public Executive(int IDnumber, String Name, int Age, double Salary, String Title, String Department, double getBonus)
	{
		super (IDnumber, Name, Age, Salary, Title, Department);
		Bonus = getBonus;
	}
	public double getSalary()
	{
		return Salary * (1 + Bonus);
	}
	public void setBonus(double bonus)
	{
		Bonus = bonus;
	}
	
protected double Bonus;
}