public class Point
{
	public Point(double xx, double yy, double zz)
	{
		x = xx;
		y = yy;
		z = zz;
	}
	
	public double distance(Point p)
	{
		return Math.sqrt((x - p.x) * (x - p.x)
		+ (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
	}
	
	
	public Point(){}
	
	
	public String toString()
	{
		return "(" + x + ", " + y + ", " + z + ")";
	}	
	
	public boolean equals(Point p)
	{
		return this.x == p.x && this.y == p.y && this.z == p.z; 
	}	
	
	public double getDistance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) + Math.pow(z - p.z, 2));
    }
	
	protected double x, y, z;
}
