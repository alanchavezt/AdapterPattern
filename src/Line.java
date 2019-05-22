
public class Line extends Shape
{

	@Override
	public void display()
	{
		System.out.println("Displaying Line");
		System.out.println("Location: " + this.location + " Color: " + this.color);	
	}

	@Override
	public void fill()
	{
		System.out.println("\nFilling Line...");	
	}

	@Override
	public void undisplay()
	{
		System.out.println("Hidding Line");
		System.out.println("Location: " + this.location + " Color: " + this.color);
	}

}
