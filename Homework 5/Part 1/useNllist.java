import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class useNllist
{
	public static void main(String[] args) throws IOException
	{
		nllist integer = new nllist();
		
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader Terminal = new BufferedReader(stream);
		int input = 0;
		String sInput;
		
		System.out.print("Enter an integer to put in the list, enter -9999 to end: ");
		
		while (input != -9999)
		{
			try
			{
				input = Integer.parseInt(Terminal.readLine());
			}
			catch(IOException e){}
			if (input == -9999)
			{
				break;
			}
			else if (integer.checkList(input) == true)
			{
				continue;
			}
			else 
			{					
				integer.insert(input);
			}
		}
		System.out.print("your list is: ");
		integer.print();
		
		System.out.println(); // adds an empty space line
		System.out.print("Would you like to delete any integer from the list enter y or n: ");
		sInput = Terminal.readLine();
		
		if(sInput.equals("y"))
		{
			System.out.print("Enter the integer you would like to delete:");
			input = Integer.parseInt(Terminal.readLine());
			
			integer.deleteInt(input);
			
			System.out.print("would you like to delete anymore integers?: ");
			sInput = Terminal.readLine();
			
			while(sInput.equals("y"))
			{
				System.out.print("Enter the integer you would like to delete:");
				input = Integer.parseInt(Terminal.readLine());
				
				integer.deleteInt(input);
				
				System.out.print("Would you like to delete anymore integers?: ");
				sInput = Terminal.readLine();
			}
			
			System.out.print("Your updated list is: ");
			integer.print();
		}
		else
		{
			System.exit(0);
		}
		
	}
}