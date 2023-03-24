import java.util.Arrays;

public class duplicate
{
	public static void main(String[] args)
	{
		int[] array = new int[] {1,1,1,1,2,3,4,5,6,6,7,8,8,9};
		
		for	(int i = 0; i < array.length; i++)
		{
			for(int x = i+1 ; x < array.length; x++)
			{
				if ( array[i] == array[x])
				{
					array.remove(x);
				}
			}	
		}
	}
}