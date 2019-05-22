
public abstract class Shape
{
	String location;
	String color;
	
	public abstract void display();
	public abstract void fill();
	public abstract void undisplay();
	
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	
}
