public class ViSphere extends Sphere
{
	public ViSphere(Point cntr, double rad)
	{
	super (cntr, rad);
	}
	
	public double getVolume()
	{
		double volume = (4.0/3.0) * 3.14 * (radius) * (radius) * (radius);
		return volume;
	}
	
	public boolean intersects(ViSphere s)
	{
		return center.getDistance(s.center) < (radius + s.radius);
	}

}