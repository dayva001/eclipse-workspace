package vehicleActivity;

public class Car extends LandVehicle 
{
	protected String[] bodyTypes = {"sedan", "fastBack", "coupe", "convertible", "hatchBack"};
	protected int bodyType=4;
	
	public Car()
	{
		super();
	}
	
	public Car(String color, int range, int minWeight, int maxWeight, int weight, int fuelType, int doors, int wheels, int bodyType)
	{
		super(color, range, minWeight, maxWeight, weight, fuelType, doors, wheels);
		if(bodyType >=0 && bodyType < bodyTypes.length)
		{
			this.bodyType=bodyType;
		}
	}
	
	public void setBodyType(int bodyType)
	{
		if(bodyType >=0 && bodyType < bodyTypes.length)
		{
			this.bodyType=bodyType;
		}
	}
	
	public String getBodyType()
	{
		return bodyTypes[bodyType];
	}
	
	public String toString()
	{
		return "Car - " + super.toString() + ", " + getBodyType();
	}
}
