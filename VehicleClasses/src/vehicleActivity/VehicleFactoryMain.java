package vehicleActivity;


import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class VehicleFactoryMain 
{

	public static void main(String[] args) 
	{
		String fileName = "VehicleProductionInventory.txt";
		String currTime = ZonedDateTime.now( ZoneOffset.UTC ).format( DateTimeFormatter.ISO_INSTANT);
		MyFileManager factMan = new MyFileManager();
		ArrayList<Vehicle> factory = new ArrayList<Vehicle>();
		Random random = new Random();
		int listSize = random.nextInt(4,21);
		for(int i = 0; i < listSize;i++)
		{
			addRandomVehicle(factory);
		}
		
		factMan.clearFile(fileName);
		factMan.appendLine("Number of vehicles produced: " + listSize, fileName);
		factMan.appendLine("", fileName);
		factMan.appendLine("Date of Production: " + currTime, fileName);
		factMan.appendLine("", fileName);
		factMan.appendLine("--------------------------------------------------------------------", fileName);
		factMan.appendLine("", fileName);
		factMan.appendArray(factory, fileName);
	}

	public static String getRandomColor()
	{
		Random randColor = new Random();
		String[] colors = {"Black", "Blue", "Red", "Yellow", "Orange", "Green", "White", "Purple", "Brown", "Cyan", "Amber"};
		return colors[randColor.nextInt(colors.length)];
	
	}
	
	public static void addRandomVehicle(ArrayList<Vehicle> list)
	{
		Random randNum = new Random();
		switch(randNum.nextInt(4))
		{
			case 0: int minCarWeight = randNum.nextInt(0,101);
					int maxCarWeight = randNum.nextInt(1000, 10001);
					list.add(new Car(getRandomColor(), randNum.nextInt(50000), minCarWeight, maxCarWeight, 
							randNum.nextInt(minCarWeight,maxCarWeight+1) , randNum.nextInt(6), randNum.nextInt(1,5),randNum.nextInt(3,7), randNum.nextInt(5)));
					// String color, int minWeight, int maxWeight, int weight, int fuelType, int doors, int wheels, int bodyType
					break;
			case 1: int minTruckWeight = randNum.nextInt(500, 1001);
					int maxTruckWeight = randNum.nextInt(5000,50001);
					int minCargoSize = randNum.nextInt(50,101);
					int maxCargoSize = randNum.nextInt(minCargoSize+1, maxTruckWeight);
					//String color, int minWeight, int maxWeight, int weight, int fuelType, int doors, int wheels, int cargoSize, int maxSize, int minSize, int cargoType
					list.add(new Truck(getRandomColor(), randNum.nextInt(30000), minTruckWeight, maxTruckWeight, randNum.nextInt(minTruckWeight, maxTruckWeight+1),
							 randNum.nextInt(6), randNum.nextInt(2,5), randNum.nextInt(4,13), 
							 randNum.nextInt(minCargoSize, maxCargoSize+1), maxCargoSize, minCargoSize, randNum.nextInt(5)));
					break;
					
			case 2: int minBalloonWeight = randNum.nextInt(200);
					int maxBalloonWeight = randNum.nextInt(201,1001);
					//String color, int minWeight, int maxWeight, int weight, int fuelType,int maxAltitude, int gasType
					list.add(new Balloon(getRandomColor(), randNum.nextInt(90000), minBalloonWeight, maxBalloonWeight, 
							randNum.nextInt(minBalloonWeight, maxBalloonWeight+1), randNum.nextInt(6), randNum.nextInt(500,10000), randNum.nextInt(3)));
					break;
			case 3: int minGliderWeight = randNum.nextInt(300);
					int maxGliderWeight = randNum.nextInt(301, 800);
					//String color, int minWeight, int maxWeight, int weight, int fuelType,int maxAltitude, int wingSpan
					list.add(new Glider(getRandomColor(), randNum.nextInt(20000), minGliderWeight, maxGliderWeight,
							randNum.nextInt(minGliderWeight, maxGliderWeight+1), randNum.nextInt(6), randNum.nextInt(300,8000), randNum.nextInt(5,33)));
					break;
			default: break;			
		}
	}
}
