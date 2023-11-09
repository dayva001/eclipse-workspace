
public class Rectangle
{
	private String color = "black";
	private double length = 1.0;
	private double width = 1.0;
	
	
	//Functions
	//#========================================================================
	Rectangle(){}
	
	Rectangle(double l, double w, String clr)
	{
		length = l;
		width = w;
		color = clr;
	}
	
	public String color()
	{
		return color;
	}
	
	public void setColor(String clr)
	{
		color = clr;
	}
	
	public double length()
	{
		return length;
	}
	
	public double width()
	{
		return width;
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public double getPerimeter()
	{
		return length*2 + width*2;
	}
	
}
