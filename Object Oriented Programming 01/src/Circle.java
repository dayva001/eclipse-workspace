
public class Circle
{
	private String color = "black";
	private double radius = 0.0;
	
	//Functions
	//#======================================================
	Circle(){}
	
	Circle(double rad, String clr)
	{
		radius = rad;
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
	
	public double radius()
	{
		return radius;
	}
	
	public void setRadius(double rad)
	{
		radius = rad;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
}
