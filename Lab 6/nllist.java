public class nllist
{
	private static class node // NOTE: a class within a class
	{
		public node(String theName, int theAge)
		{
		name = new String(theName);
		age = theAge;
		}
		String name;
		int age;
		node link;
	}
	
	public nllist()
	{
		listHead = null;
	}
	
	public void print()
	{
		node ptr = listHead;
		while (ptr != null)
		{
			System.out.println(ptr.name + " " + ptr.age);
			ptr = ptr.link;
		}
	}
	
	public void insert(String tName, int tAge)
	{
		node ptr = new node(tName, tAge);
		
		if (listHead == null)
		{
			listHead = ptr;
		}
		else
		{
			node tptr = listHead;
			while(tptr.link != null)
				tptr = tptr.link;
			
			tptr.link = ptr;
				
		}
	}
	private node listHead;
}