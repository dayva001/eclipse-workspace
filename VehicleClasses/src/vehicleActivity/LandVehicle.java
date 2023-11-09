package vehicleActivity;

public class LandVehicle extends Vehicle
{
	int numWheels =4;
	int numDoors =4;
	
	public LandVehicle()
	{
		super();
	}
	
	public LandVehicle(String color, int range, int minWeight, int maxWeight, int weight, int fuelType, int doors, int wheels)
	{
		super(color, range, minWeight, maxWeight, weight, fuelType);
		numDoors = doors;
		numWheels = wheels;
	}
	
	public void setNumWheels(int numWheels)
	{
		this.numWheels=numWheels;
	}
	
	public void setNumDoors(int numDoors)
	{
		this.numDoors = numDoors;
	}
	
	public int getNumWheels()
	{
		return numWheels;
	}
	
	public int getNumDoors()
	{
		return numDoors;
	}
	
	public String toString()
	{
		return super.toString() + ", " + numWheels + "-wheels, " + numDoors + "-doors";
	}
}
