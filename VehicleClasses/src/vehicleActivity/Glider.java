package vehicleActivity;

public class Glider extends AirVehicle
{
	int wingSpan = 12;
	
	public Glider()
	{
		super();
	}
	
	public Glider(String color, int range, int minWeight, int maxWeight, int weight, int fuelType,int maxAltitude, int wingSpan)
	{
		super(color, range, minWeight, maxWeight, weight, fuelType, maxAltitude);
		
		if(wingSpan >0)
		{
			this.wingSpan = wingSpan;
		}
	}
	
	public void setWingSpan(int wingSpan)
	{
		if(wingSpan >0)
		{
			this.wingSpan = wingSpan;
		}
	}
	
	public int getWingSpan()
	{
		return wingSpan;
	}
	
	public String toString()
	{
		return "Glider - " +  super.toString() + ", " + wingSpan + "m";
	}
}
