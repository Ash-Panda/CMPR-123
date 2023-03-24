public class nllist
{
	private static class node // NOTE: a class within a class
	{
		public node(int getInteger)
		{
		integer = getInteger;
		}
		int integer;
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
			System.out.print("[" + ptr.integer + "] ");
			ptr = ptr.link;
		}
	}
	
	public void deleteInt(int getInteger)
	{
		node temp = listHead;
		node prev = null;
		
		if (temp != null && temp.integer == getInteger)
		{
			listHead = listHead.link;
			return;
		}
		
		while (temp != null && temp.integer != getInteger)
		{
			prev = temp;
			temp = temp.link;
		}
		
		if(temp == null)
		{
			System.out.println("integer not found in the list");
			return;
		}
		
		prev.link = temp.link;
	}
	
	public boolean checkList(int input)
	{
		node ptr = listHead;
		while (ptr != null)
		{
			if (ptr.integer == input)
			{
				return true;	
			}
			
			ptr = ptr.link;
		}
		return false;
	}
	
	public void insert(int getInteger)
	{
		node ptr = new node(getInteger);
		
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