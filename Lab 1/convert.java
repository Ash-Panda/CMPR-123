public class convert
{
	
	public static void main(String[] args)
	{
		if (args.length == 1)
		{
			double degreesF = Double.parseDouble(args[0]);
			
			if (degreesF < -459.67)
			{
				System.out.println("## lowest possible temperature is -459.67");
				System.exit(-1);
			}
			
			double degreesC = (degreesF - 32) * 5.0/9.0;
			System.out.println(degreesC);
		}
		else if (args.length == 2)
		{
			if (args[1].equals("f"))
			{
				double degreesF = Double.parseDouble(args[0]);
				
				double degreesC = (degreesF - 32) * 5.0/9.0;
				System.out.println(degreesC);	
				
				if (degreesF < -459.67)
				{
					System.out.println("## lowest possible temperature is -459.67");
					System.exit(-1);
				}
			}
			else if (args[1].equals("c"))
			{
				double degreesC = Double.parseDouble(args[0]);
				
				double degreesF = (degreesC * 9/5) + 32;
				System.out.println(degreesF);
				
				if (degreesC < -273.15)
				{
					System.out.println("## lowest possible temperature is -273.15");
					System.exit(-1);
				} 
			}
		}
		else 
		{
			System.out.println("usage: java 32 f");
		}
	}
}
