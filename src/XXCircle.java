
public class XXCircle
{
	String location;
	String color;
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	
	public void setItsColor(String color)
	{
		this.color = color;
	}
	
	public void displayIt()
	{
		System.out.println("Displaying Circle");
		System.out.println("Location: " + this.location + " Color: " + this.color);	
	}
	
	public void fillIt()
	{
		System.out.println("\nFilling Circle...");
	}
	
	public void undisplayIt()
	{
		System.out.println("Hidding Circle");
		System.out.println("Location: " + this.location + " Color: " + this.color);
	}

}
