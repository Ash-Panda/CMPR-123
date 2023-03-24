public class DAuto extends Automobile
{
	public DAuto(String Make, String Model, int Year, String VIN, String getCondition)
	{
		super (Make, Model, Year, VIN);
		Condition = getCondition;
	
	}
	
	public String toString()
	{
		return super.toString() + ", " + Condition;
	}
	
protected String Condition;
}