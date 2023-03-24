public class divideByZero
{
	public static void main(String[] args)
	{
		int five = 5;
		int zero = 0;
		float result;
		try
		{
			result = five / zero;
		}
		catch(ArithmeticException e)
		{
			System.out.println("error: " + e);
		}
	}
}