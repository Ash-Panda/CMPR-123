import java.util.LinkedList;
import java.util.ListIterator;
public class lList
{
	private static class Node
	{
		public Node(String theName, int theAge)
		{
			name = new String(theName);
			age = theAge;
		}
		
		public String toString()
		{
			return name + " " + age;
		}
		
		String name;
		int age;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Node> people = new LinkedList<Node>();
		
		people.addFirst(new Node("Amanda", 30));
		people.addFirst(new Node("Carl", 20));
		people.addFirst(new Node("Debbie", 42));
		
		ListIterator<Node> iterator = people.listIterator();
		
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}
}