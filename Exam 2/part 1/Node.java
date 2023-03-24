public class Node
{
	public Node(String theName, int theAge)
	{
		name = new String(theName);
		age = theAge;
	}
	public Node()
	{
		listHead = null;
	}
	
	public String toString()
	{
		return name + " " + age;
	}
	
	public void insert(String tName, int tAge)
	{
		Node ptr = new Node(tName, tAge);
		
		if (listHead == null)
		{
			listHead = ptr;
		}
		else
		{
			Node tptr = listHead;
			while(tptr.link != null)
				tptr = tptr.link;
			
			tptr.link = ptr;
				
		}
	}
	
	public void print()
	{
		Node ptr = listHead;
		while (ptr != null)
		{
			System.out.println(ptr.name + " " + ptr.age);
			ptr = ptr.link;
		}
	}
	
	public boolean search(String input)
	{
		Node ptr = listHead;
		while (ptr != null)
		{
			if (ptr.name.equals(input))
			{
				return true;	
			}
			ptr = ptr.link;
		}
		return false;
	}
	
	public void delete(String input)
	{
		Node temp = listHead;
		Node prev = null;
		
		if (temp != null && temp.name.equals(input))
		{
			listHead = listHead.link;
			return;
		}
		
		while (temp != null && temp.name.equals(input) == false)
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
	
	public boolean equals(Object obj)
	{
		if (!getClass().equals(obj.getClass()))
		return false;
	
		Node b = (Node)obj;
		
		if (name.equals(b.name) && age == b.age)
		return true;
	
		else
		return false;
	}
	String name;
	int age;
	Node link;
	private Node listHead;
}
