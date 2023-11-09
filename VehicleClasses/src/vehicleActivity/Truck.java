package vehicleActivity;

public class Truck extends LandVehicle
{
	protected int cargoSize = 1000;
	protected int maxSize = 10000;
	protected int minSize = 500;
	protected int cargoType = 0;
	protected String[] cargoTypes = {"openBed", "BoxTruck", "van", "miniVan", "dumpTruck"};
	
	public Truck()
	{
		super();
	}
	
	public Truck(String color, int range, int minWeight, int maxWeight, int weight, int fuelType, int doors, int wheels, int cargoSize, int maxSize, int minSize, int cargoType)
	{
		super(color, range, minWeight, maxWeight, weight, fuelType, doors, wheels);
		if(minSize < maxSize)
		{
			this.minSize = minSize;
		}
		if(maxSize > minSize)
		{
			this.maxSize = maxSize;
		}
		if(cargoSize >=minSize && cargoSize <= maxSize)
		{
			this.cargoSize = cargoSize;
		}
		if(cargoSize < minSize)
		{
			this.cargoSize = minSize;
		}
		if(cargoSize > maxSize)
		{
			this.cargoSize = maxSize;
		}
		if(cargoType >=0 && cargoType < cargoTypes.length)
		{
			this.cargoType = cargoType;
		}
	}
	
	public void setCargoSize(int cargoSize)
	{
		if(cargoSize >=minSize && cargoSize <= maxSize)
		{
			this.cargoSize = cargoSize;
		}
		if(cargoSize < minSize)
		{
			this.cargoSize = minSize;
		}
		if(cargoSize > maxSize)
		{
			this.cargoSize = maxSize;
		}
	}
	
	public void setMinWeight(int minSize)
	{
		if(minSize < maxSize)
		{
			this.minSize = minSize;
		}
	}
	
	public void setMaxWeight(int maxSize)
	{
		if(maxSize > minSize)
		{
			this.maxSize = maxSize;
		}
	}
	
	public void setCargoType(int cargoType)
	{
		if(cargoType >=0 && cargoType < cargoTypes.length)
		{
			this.cargoType = cargoType;
		}
	}
	
	public int getCargoSize()
	{
		return cargoSize;
	}
	
	public int getMaxSize()
	{
		return maxSize;
	}
	
	public int getMinSize()
	{
		return minSize;
	}
	
	public String getCargoType()
	{
		return cargoTypes[cargoType];
	}
	
	public String toString()
	{
		return "Truck - " + super.toString() + ", " + cargoSize + "Kg, " + maxSize + "Kg, " + minSize + "Kg, " + cargoTypes[cargoType];
	}
}
