public class phoneBook
{
	private static class node
	{
		public node(String getName, int getNumber)
		{
			name = new String(getName);
			number = getNumber;
		}
		String name;
		int number;
		node link;
		
	}
	
	public class phoneBook()
	{
		listHead = null;
	}
	
	public void print(String name)
	{
		//enter code to print phone number and name based on name input, put out 
		//an error message if the name isn't found.
		node ptr = listHead;
		while (ptr != null)
		{
			System.out.println(
		}
	}
	
	public changeNumber(String name)
	{
		//enter code to change number based on name, error message if the name isn't found
	}
	
	public saveToFile()
	{
		//enter code to save phone book to file
	}
	public quiteWithoutSave()
	{
		//enter code to exit without saving to a file
	}
	public exit()							
	{
		//exit with saving the file needs to rewirte the older file
	}
}