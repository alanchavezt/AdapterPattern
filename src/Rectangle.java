
public class Rectangle extends Shape
{

	@Override
	public void display()
	{
		System.out.println("Displaying Rectangle");
		System.out.println("Location: " + this.location + " Color: " + this.color);
	}

	@Override
	public void fill()
	{
		System.out.println("\nFilling Rectangle...");	
	}

	@Override
	public void undisplay()
	{
		System.out.println("Hidding Rectangle");
		System.out.println("Location: " + this.location + " Color: " + this.color);
	}

}
