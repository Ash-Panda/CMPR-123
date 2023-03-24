public class Pointv2
{
	Pointv2() // default constructor, if parameters are not specified with key-word new
	{
		x = 0;
		y = 0;
	}
	
	Pointv2(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public void moveTo(int newX, int newY) // moveTo() is a mutator method
	{
		x = newX;
		y = newY;
	}
	
	// A better way to provide output -- think MVC; MVC => Model View Controller
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	public void setX(int newX) 
	{
		this.x = newX;
	}
	public void setY(int newY)
	{
		this.y = newY;
	}
	
	protected int x; // Data member
	protected int y; // Data member
}