import java.util.Random;

public class useCircle
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int radius = r.nextInt(11);
		Circle c = new Circle(5, 10, radius);
		Circle k = new Circle();

		String centerC = c.getCenter().toString();
		String centerK = k.getCenter().toString();
		double radiusC = c.getRadius();
		double radiusK = k.getRadius();
		double areaC = 3.14 * radiusC*radiusC;
		double areaK = 3.14 * radiusK*radiusK;

		if (areaC > areaK)
		{
			System.out.println("Circle c is bigger then circle k. With cicrcle c having the center of " + centerC +
			 " with a radius of " + radiusC + " and with an area of " + areaC + " and circle k having the center of " + centerK + 
			 " with a radius of " + radiusK + " and with an area of " + areaK + ".");
		}
		else if (areaK > areaC)
		{
			System.out.println("Circle k is bigger then circle c. With cicrcle c having the center of " + centerC +
			 " with a radius of " + radiusC + " and with an area of " + areaC + " and circle k having the center of " + centerK + 
			 " with a radius of " + radiusK + " and with an area of " + areaK + ".");
		}
		else if (k.equals(c))
		{
			System.out.println("Circle c and circle k are the same size. With cicrcle c having the center of " + centerC +
			 " with a radius of " + radiusC + " and with an area of " + areaC + " and circle k having the center of " + centerK + 
			 " with a radius of " + radiusK + " and with an area of " + areaK + ".");
		}
		else 
		{
			System.out.println("Something went wrong.");
		}
		
		
		
		
		
		// do comparison, i.e. which circle is largest
		// output larger value
	}
}