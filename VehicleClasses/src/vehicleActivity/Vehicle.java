package vehicleActivity;

public class Vehicle
{
	protected String color = "black";
	protected int weight =10000;
	protected int range = 450;
	protected int maxWeight = 1000000;
	protected int minWeight = 1000;
	protected String[] fuelTypes = {"animal-powered", "gas", "electric", "diesel", "kerosene", "methane"};
	protected int fuelType = 2;
	public Vehicle()
	{
	}
	public Vehicle(String color, int range, int minWeight, int maxWeight, int weight, int fuelType)
	{
		this.color = color;
		if(minWeight < maxWeight)
		{
			this.minWeight = minWeight;
		}
		if(maxWeight > minWeight)
		{
			this.maxWeight = maxWeight;
		}
		if(weight >=minWeight && weight <= maxWeight)
		{
			this.weight = weight;
		}
		if(weight < minWeight)
		{
			this.weight = minWeight;
		}
		if(weight > maxWeight)
		{
			this.weight = maxWeight;
		}
		if(fuelType >=0 && fuelType < fuelTypes.length)
		{
			this.fuelType=fuelType;
		}
		if(range>0)
		{
			this.range = range;
		}
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setRange(int range)
	{
		if(range>0)
		{
			this.range = range;
		}
	}
	public void setMinWeight(int minWeight)
	{
		if(minWeight < maxWeight)
		{
			this.minWeight = minWeight;
		}
	}
	
	public void setMaxWeight(int maxWeight)
	{
		if(maxWeight > minWeight)
		{
			this.maxWeight = maxWeight;
		}
	}
	
	public void setWeight(int weight)
	{
		if(weight >=minWeight && weight <= maxWeight)
		{
			this.weight = weight;
		}
	}
	
	public void setFuelType(int fuelType)
	{
		if(fuelType >=0 && fuelType < fuelTypes.length)
		{
			this.fuelType=fuelType;
		}
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getRange()
	{
		return range;
	}
	
	public int getMinWeight()
	{
		return minWeight;
	}
	
	public int getMaxWeight()
	{
		return maxWeight;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public String getFuelType()
	{
		return fuelTypes[fuelType];
	}
	
	public String toString()
	{
		return (color + ", " +range + "Km, " + minWeight  + "Kg, " + maxWeight + "Kg, " + weight + "Kg, " + fuelTypes[fuelType]);
	}
}
