public class UseSphere
{
	public static void main (String[] args)
	{
		
		ViSphere c = new ViSphere (new Point(1, 2, 3), 5);
		ViSphere k = new ViSphere (new Point(10, 20, 30), 5);
		
		System.out.println("Sphere c points: " + c.toString() + "\nSphere k points: " + k.toString());
		
		System.out.println("Comparing using \"==\": " + (c == k));
		System.out.println("comparing using \".equals()\": " + (c.equals(k)));
		System.out.println("the volume of sphere c: " + c.getVolume());
		System.out.println("the volume of sphere k: " + k.getVolume());
		
		if (c.intersects(k))
		{
			System.out.println("Both spheres intersects.");
		}
		else 
		{
			System.out.println("Both spheres dont intersect.");
		}
	}
}
