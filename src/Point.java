
public class Point extends Shape
{

	@Override
	public void display()
	{
		System.out.println("Displaying Point");
		System.out.println("Location: " + this.location + " Color: " + this.color);
	}

	@Override
	public void fill()
	{
		System.out.println("\nFilling Point...");
	}

	@Override
	public void undisplay()
	{
		System.out.println("Hidding Point");
		System.out.println("Location: " + this.location + " Color: " + this.color);
	}
	

}
