public class useAuto
{
	public static void main (String[] args)
	{
		Automobile myCar = new Automobile("Honda", "Accord", 2020, "1U987YU8");
		DAuto car2 = new DAuto("Honda", "Accord", 2020, "1U987YU8", "New");
		
		System.out.println(myCar);
		System.out.println(car2);
	}
}