package inter;

import java.util.Random;

public class Car implements Vehicle
{
	private String name;
	private String[]colors = {"Black", "White", "Red", "Yellow", "Blue", "Silver", "Orange", "Green", "Grey", "Purple", "Brown"};
	private int colorType;
	private int weight;
	protected Random random = new Random();
	
	public Car()
	{
		name = "no name";
		colorType=0;
		weight = 100;
	}
	
	public Car(String name, int colorType, int weight)
	{
		this.name = name;
		if(colorType <0 || colorType > colors.length)
		{
			this.colorType = random.nextInt(0, colors.length);
		}
		else
		{
			this.colorType = colorType;
		}
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void speed() 
	{
		System.out.println(name + " is going " + random.nextInt(100,501)/weight);
	}

	public void paint()
	{
		int oldColor = colorType;
		colorType = random.nextInt(0, colors.length);
		System.out.println(name + " changed colors from " + colors[oldColor] + " to " + colors[colorType]);
		
	}
}
