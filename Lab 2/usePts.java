import java.util.Random;

public class usePts
{
	public static void main(String[] args)
	{
		Random rnd = new Random();
		
		Pointv2[] points = new Pointv2[10];
		double biggestDistance = 0;
		
		for (int i = 0; i < 5; i++)
			points[i] = new Pointv2(rnd.nextInt(11), rnd.nextInt(11));
		for (int i = 5; i < 10; i++)
			points[i] = new Ptv2(rnd.nextInt(11), rnd.nextInt(11));
		for (int i = 0; i < points.length; i++)
			System.out.println(points[i]);
		
		Ptv2 origin = new Ptv2(0,0);
		
		double[] distance = new double[10];
		distance[0] = origin.distance(points[0]);
		
		int indexPoint = 0;
		for (int i = 1; i < 10; i++)	
			distance[i] = origin.distance(points[i]);
		
		for (int i = 0; i < 10; i++)
		{
			if ( distance[i] > biggestDistance)
			{
				biggestDistance = distance[i];
				indexPoint = i;
			}
		}
		System.out.println("The farthest point is: " + biggestDistance + "\nThe points index: " + indexPoint);
		
		
	}
}