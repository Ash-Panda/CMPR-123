public class binarySearch
{
	public static void main(String[] args)
	{
		String[] strings = {"zebra", "honda", "tiger", "moon", "CCS", "testing"};
		System.out.println(binarySearch(strings, "ajsbda"));
	}
	
	public static boolean binarySearch(String[] data, String key)
	{
		int size = data.length;
		int low = 0;
		int high = size - 1;
		
		while (high >= low)
		{
			int middle = (low + high) / 2;
			
			if (data[middle].compareTo(key) == 0)
			{
				return true;
			}
			if (data[middle].compareTo(key) < 0)
			{
				low = middle + 1;
			}
			if (data[middle].compareTo(key) > 0)
			{
				high = middle - 1;
			}
					
		}
		
		return false;
	}
}