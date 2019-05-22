
public class AdapterTestDrive
{
	public static void main(String[] args)
	{	
		Line line = new Line();
		line.setLocation("0,1");
		line.setColor("Blue");
		line.getLocation();
		line.fill();
		line.display();
		line.undisplay();
		
		Point point = new Point();
		point.setLocation("1,1");
		point.setColor("Red");
		point.getLocation();
		point.fill();
		point.display();
		point.undisplay();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLocation("4,4");
		rectangle.setColor("Yellow");
		rectangle.getLocation();
		rectangle.fill();
		rectangle.display();
		rectangle.undisplay();
		
		XXCircle xxCircle = new XXCircle();
		XXCircleAdapter xxCircleAdapter = new XXCircleAdapter(xxCircle);
		xxCircleAdapter.setLocation("7,7");
		xxCircleAdapter.setColor("Green");
		xxCircleAdapter.getLocation();
		xxCircleAdapter.fill();
		xxCircleAdapter.display();
		xxCircleAdapter.undisplay();
	}
}
