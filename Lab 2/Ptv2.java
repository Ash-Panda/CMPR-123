public class Ptv2 extends Pointv2
{
	public Ptv2()
	{
		super(0,0);
	}

		public Ptv2(int a, int b)
	{
		super(a,b);
	}
	
		private double square(int k)
	{
		return k*k;
	}
	
	public double distance(Pointv2 p)
	{
		double dist = Math.sqrt( square(x - p.x) + square(y - p.y) ); // p.x and p.y are permitted w/protected
		return dist;
	}
}