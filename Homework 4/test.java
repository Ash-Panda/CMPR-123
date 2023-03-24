public class test
{
	public static void main(String[] args)
	{
		try 
		{
			crash();
		}
		catch (StackOverflowError e)
		{
			throw e;
		}
	}
	public static void crash()
	{
		int i = 0;
		while (i == 0)
		{
			try 
			{
				System.out.println("Test");
			}
			catch (StackOverflowError e)
			{
				throw e;
			}
		}
	}
}