package vehicleActivity;

public class Balloon extends AirVehicle
{
	protected int gasType =0;
	protected String[] buoyantGasses = {"hot-air", "helium", "hydrogen"};
	
	public Balloon()
	{
		super();
	}
	
	public Balloon(String color, int range, int minWeight, int maxWeight, int weight, int fuelType,int maxAltitude, int gasType)
	{
		super(color, range, minWeight, maxWeight, weight, fuelType, maxAltitude);
		
		if(gasType >=0 && gasType < buoyantGasses.length)
		{
			this.gasType= gasType;
		}
	}
	
	public void setBuoyantGas(int gasType)
	{
		if(gasType >=0 && gasType < buoyantGasses.length)
		{
			this.gasType= gasType;
		}
	}
	
	public String getBuoyantGas()
	{
		return buoyantGasses[gasType];
	}
	
	public String toString()
	{
		return "Balloon - " +  super.toString() + ", " + buoyantGasses[gasType];
	}
}
