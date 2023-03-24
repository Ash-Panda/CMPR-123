public class usePointv2 // driver program
{
	public static void main(String[] args)
	{
		Pointv2 p = new Pointv2(5,5);
		Pointv2 p1 = new Pointv2(4,4);
		System.out.println("Point p: " + p); // implicitly calls p.toString()
		System.out.println("Point p1: " + p1);
		System.out.println("Move p1 to (2,2)... \n");
		p1.moveTo(2,2);
		System.out.println("Point p1 (after moveTo()): " + p1 + '\n');
	}
}