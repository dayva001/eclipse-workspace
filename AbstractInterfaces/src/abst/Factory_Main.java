package abst;

public class Factory_Main {

	public static void main(String[] args)
	{
		Car car1 = new Car("Ford Taurus", 4, 15);
		car1.speed();
		car1.paint();
		Truck truck1 = new Truck("Toyota Hilux", 0, 30);
		truck1.speed();
		truck1.paint();
		truck1.drive();
	}

}
