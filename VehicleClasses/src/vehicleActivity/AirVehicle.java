package vehicleActivity;

public class AirVehicle extends Vehicle
{
	protected int maxAltitude = 10000;
	
	public AirVehicle()
	{
		super();
	}
	
	public AirVehicle(String color, int range, int minWeight, int maxWeight, int weight, int fuelType,int maxAltitude)
	{
		super(color, range, minWeight,maxWeight,weight,fuelType);
		if(maxAltitude >0)
		{
			this.maxAltitude = maxAltitude;
		}
	}
	
	public void setMaxAltitude(int maxAltitude)
	{
		if(maxAltitude >0)
		{
			this.maxAltitude = maxAltitude;
		}
	}
	
	public int getMaxAltitude()
	{
		return maxAltitude;
	}
	
	public String toString()
	{
		return super.toString() + ", " + maxAltitude + "m";
	}
}
