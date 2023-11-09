
public class Square
{
	private String color = "black";
	private double side = 0.0;
	
	
	//Functions
	//#================================================================
	Square(){}
	
	Square(double s, String clr)
	{
		side = s;
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
	
	public double side()
	{
		return side;
	}
	
	public void setSide(double s)
	{
		side = s;
	}
	
	public double getArea()
	{
		return side * side;
	}
}
