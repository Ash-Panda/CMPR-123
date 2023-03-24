public class ECirlce extends Cirlces
{
	public ECircle()
	{
		x = 0;
		y = 0;
		raduis = 1;
	}
		
	public ECircle(int getX, int getY, getRaduis)
	{
		raduis = getRaduis;
		x = getX;
		y = getY;
	}
	public Circles(int getX, int getY, getRaduis)
	{
		Cx = getX;
		Cy = gety;
		Craduis = getRaduis;
	}
	
	public double distance()
	{
		double dist = Math.sqrt( square(x - Cx) + square(y - Cy) ); // p.x and p.y are permitted w/protected
		return dist;
		
protected int raduis;
protected int x;
protected int y;
protected int Craduis;
protected int Cx;
protected int Cy;
}