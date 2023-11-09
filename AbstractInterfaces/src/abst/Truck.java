package abst;

public class Truck extends Car
{
	public Truck()
	{
		super();
	}
	
	public Truck(String name, int colorType, int weight)
	{
		super(name,colorType,weight);
	}
	
	void drive()
	{
		System.out.println(getName() + " drove " + random.nextInt(100,1001) + " miles");
	}
}
