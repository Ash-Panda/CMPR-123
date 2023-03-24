public class Automobile
{
	
	public Automobile()
	{
		Make = "NONE";
		Model = "NONE";
		Year = 0000;
		VIN = "NONE";
	}
	
	public Automobile(String getMake, String getModel, int getYear, String getVIN)
	{
		Make = getMake;
		Model = getModel;
		Year = getYear;
		VIN = getVIN;
	}
	
	
	public String toString()
	{
		return Make + ", " + Model + ", " + Year + ", " + VIN;
	}
	
protected String Make;
protected String Model;
protected int Year;
protected String VIN;
	
}