import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class InterfaceTestMain {

	public static void main(String[] args) 
	{
		Random random = new Random();
		ArrayList<Money> moneyList1 = new ArrayList<Money>();
		ArrayList<Money> moneyList2 = new ArrayList<Money>();
		ArrayList<Time> timeList1 = new ArrayList<Time>();
		ArrayList<Time> timeList2 = new ArrayList<Time>();
		
		for(int i = 0; i < 5; i++)
		{
			moneyList1.add(new Money(random.nextDouble(-400.0, 500.0)));
			moneyList2.add(new Money(random.nextDouble(-20.0, 300.0)));
			timeList1.add(new Time(random.nextInt(-23,24), random.nextInt(-60,60), random.nextInt(-60,60)));
			timeList2.add(new Time(random.nextInt(0,24), random.nextInt(0,60), random.nextInt(0,60)));
		}
		Collections.shuffle(moneyList1);
		Collections.shuffle(moneyList2);
		Collections.shuffle(timeList1);
		Collections.shuffle(timeList2);

		System.out.println("Shuffled all 4 lists");
		System.out.println( "Money List 1 = " + moneyList1);
		System.out.println( "Money List 2 = " + moneyList2);
		System.out.println( "Time List 1 = " + timeList1);
		System.out.println( "Time List 2 = " + timeList2);
		System.out.println( "-------------------------------------------------------------------");
		System.out.println("Adding the money lists together and the time lists together");
		
		ArrayList<Money> moneyList3 = new ArrayList<Money>();
		for(int i = 0; i < 5; i++)
		{
			moneyList3.add(moneyList1.get(i).add(moneyList2.get(i)));
		}
		System.out.println("Money List 1+2 = " + moneyList3);
		
		ArrayList<Time> timeList3 = new ArrayList<Time>();
		for(int i = 0; i < 5; i++)
		{
			timeList3.add(timeList1.get(i).add(timeList2.get(i)));
		}
		System.out.println("Time List 1+2 = " + timeList3);
		
		ArrayList<Money> moneyList4 = new ArrayList<Money>();
		for(int i = 0; i < 5; i++)
		{
			moneyList4.add(moneyList1.get(i).subtract(moneyList2.get(i)));
		}
		System.out.println("Money List 1-2 = " + moneyList3);
		
		ArrayList<Time> timeList4 = new ArrayList<Time>();
		for(int i = 0; i < 5; i++)
		{
			timeList4.add(timeList1.get(i).subtract(timeList2.get(i)));
		}
		System.out.println("Time List 1-2 = " + timeList3);
		
		Collections.sort(moneyList3);
		Collections.sort(moneyList4);
		Collections.sort(timeList3);
		Collections.sort(timeList4);
		System.out.println( "-------------------------------------------------------------------");
		System.out.println("Sorted the lists");
		
		System.out.println("Sorted Added Money = " + moneyList3);
		System.out.println("Sorted Added Time = " + timeList3);
		System.out.println("Sorted Subtracted Money = " + moneyList4);
		System.out.println("Sorted Subtracted Time = " + timeList4);
		
		
	}
}


