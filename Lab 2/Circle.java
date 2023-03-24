import java.util.Random;

public class Circle
{
	 public Circle()
	{
		radius = 1;
		center = new Pointv2(0, 0);
	}
	 
	 public Circle(int theX, int theY, int r)
	{
		Random rnd = new Random();
		radius = r;
		center = new Pointv2(theX, theY);
	}
	 
	public void moveTo(int newX, int newY)
	{
		center.setX(newX);
		center.setY(newY);
	}
	  
	 public String toString()
	{
		return center.toString() + Integer.toString(radius);
	}
	
	public int getRadius()
	{
		return radius;
	}
	public Pointv2 getCenter() {
	return center;
	}
	
	public boolean equals(Circle c)
	{
		return this.radius == c.radius;
	}
	 

	/*public void grow(double growth)
	{
		// To be completed by student… (not needed for this lab)
	}*/
	private Pointv2 center;
	protected int radius;
}