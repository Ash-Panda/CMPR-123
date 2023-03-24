public class Sphere
{

	
	public Sphere(Point cntr, double rad)
	{
		center = cntr;
		radius = rad;
	}
	
	public Sphere(){}
	
	public String toString()
	{
		return center.toString() + Double.toString(radius);
	}
	public boolean equals(Sphere p)
	{
		return this.center.equals(p.center) && this.radius == p.radius; 
	}
	
	public Point center;
	public double radius;
} 