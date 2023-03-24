public class useNode
{
	public static void main(String[] args)
	{
		Node list = new Node();
		list.insert("Amanda", 32);
		list.insert("Jim", 53);
		list.insert("Debbie", 42);
		list.print();
		
		System.out.println();
		System.out.println("finding Jim and changing his age to 53");
		
		if (list.search("Jim") == true)
		{
			list.delete("Jim");
			list.insert("Jim", 35);
			list.print();
		}
		else 
		{
			System.out.println("something went wrong");
		}
	}
}