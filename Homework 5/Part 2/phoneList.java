import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.EOFException;
import java.util.LinkedList;

public class phoneList 
{	
	private static class PhoneNode
	{
		PhoneNode()
		{
			name = new String("NoName");
			phoneNumber = new String("(000) 000-0000");
			ct = 0;
		}

		PhoneNode(String fullName, String number)
		{
			name = fullName;
			phoneNumber = number;
			ct = 0;
		}
		
		PhoneNode(String fullName, String number, int count)
		{
			name = fullName;
			phoneNumber = number;
			ct = count;
		}
		
		public boolean equals(Object o) 
		{
			return  ((PhoneNode) o).name.equals(name);
		}
		
		public String toString()
		{
			return name + " " + phoneNumber;
		}
	private String name;
	private String phoneNumber;
	private int ct;

	}
	
	private void initialize(LinkedList<PhoneNode> phoneList)
	{
		try
		{
			PhoneNode ptr = null;
			String name;
			String phone;
			String line;
			FileReader fr = new FileReader("MaBell.dat"); // *MUST* be in local directory
			BufferedReader fd = new BufferedReader(fr);
			
			while (true)
			{
				name = fd.readLine(); // Get the name
				
				if (name == null)
				break;
				
				phone = fd.readLine(); // Get the telephone number
				
				if (phone == null)
				{
					System.out.println("The Mabell.dat file is corrupted.");
					System.exit(-1);
				}
				
				line = fd.readLine(); // Get the ct value, should be 0, 1, or 2
				
				if (line == null)
				{
					System.out.println("The Mabell.dat file is corrupted.");
					System.exit(-1);
				}
				
				int ct = Integer.parseInt(line);
				phoneList.add(new PhoneNode(name, phone, ct));
				
			}
		}
		
		catch (EOFException eof)
		{
			System.out.println("End of File (EOF) reached");
		}
		
		catch (IOException ioe)
		{
			System.out.println("IO error: " + ioe);
		}
	}
	
	public void menu()
	{
		System.out.println("Enter option: \n");
		System.out.println(" A - Add a phone number");
		System.out.println(" L - Look up a phone number");
		System.out.println(" C - Change a phone number");
		System.out.println(" S - Save Phone List to a file");
		System.out.println(" Q - Quit and save list\n");
	}
	
	public void eventLoop()
	{
		LinkedList<PhoneNode> phoneList = new LinkedList<PhoneNode>();
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);
		boolean finished = false;
		initialize(phoneList);
		menu();
		
		while (!finished)
		{
			System.out.print("CMD> ");

			try
			{
				String input = console.readLine().toUpperCase().trim();
				char response = input.charAt(0);
				switch (response)
				{
					case 'A': addPhoneNumber(phoneList);
					break;
					
					case 'L': lookUpPhoneNumber(phoneList);
					break;
					
					case 'C': changePhoneNumber(phoneList);
					break;
					
					case 'S': savePhoneNumbersToFile(phoneList);
					break;
					
					case 'Q': savePhoneNumbersToFile(phoneList);
					finished = true;
					break;
					
					default: System.out.println("Unknown command.\n");
					menu();
				}
			}
			catch (IOException e)
			{
			System.out.println(e);
			}
		}
	}
	
	public boolean findNode(String name, LinkedList<PhoneNode> phoneList) // Is there a better way?
	{
		PhoneNode temp = new PhoneNode(name, null);
		
		return phoneList.contains(temp);
	}
	
	public int getIndex(String name, LinkedList<PhoneNode> phoneList)
	{
		PhoneNode temp = new PhoneNode(name, null);
		
		return phoneList.indexOf(temp);
	}
	
	public void addPhoneNumber(LinkedList<PhoneNode> phoneList) throws IOException
	{
		String name = "Name";
		String phoneNumber = "(000)000-0000";
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);
		
		System.out.print("Enter name: ");
		name = console.readLine();
		
		System.out.print("Enter telephone number: ");
		phoneNumber = console.readLine();
		
		phoneList.add(new PhoneNode(name, phoneNumber));
	}
	
	public void lookUpPhoneNumber(LinkedList<PhoneNode> phoneList) throws IOException
	{

		String name = "Name";
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);
		
		System.out.print("Enter name: ");
		name = console.readLine();
		
		boolean contains = findNode(name, phoneList);
		
		if (contains == false)
		{
			System.out.println(name + " not found in the directory");
		}
		else 
		{
			int index = getIndex(name, phoneList);
			System.out.println(phoneList.get(index));

		}
		
	}
	
	public void changePhoneNumber(LinkedList<PhoneNode> phoneList) throws IOException
	{
		String name = "Name";
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);
		
		System.out.print("Enter name: ");
		name = console.readLine();
		
		boolean contains = findNode(name, phoneList);
		
		if (contains == false)
		{
			System.out.println(name + " not found in the directory");
		}
		else 
		{
			int index = getIndex(name, phoneList);
			
			System.out.print("Enter new phone number: ");
			String phoneNumber = console.readLine();
			phoneList.set(index, new PhoneNode(name, phoneNumber));
		}
		
	}
	
	public void savePhoneNumbersToFile(LinkedList<PhoneNode> phoneList) throws IOException
	{
		File file = new File("MaBell.dat");
		PrintWriter print = new PrintWriter(file);
		for (int i = 0; i < phoneList.size(); i++)
		{
			print.println(phoneList.get(i).name);
			print.println(phoneList.get(i).phoneNumber);
			print.println(phoneList.get(i).ct);
		}
		print.close();
	}
	
private PhoneNode listHead; // Is this necessary? Why or why not? Be sure this is understood!
private int c = 0;
}