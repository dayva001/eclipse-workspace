package Generics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenericTests {

	public static void main(String[] args)
	{
		Random random = new Random();
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<20;i++)
		{
			arr.add(random.nextInt(100));
		}
		System.out.println("Testing getLargest()");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		System.out.println(arr);
		System.out.println("Largest int in the array = " + getLargest(arr));
		
		GenericQueue<Double> queue = new GenericQueue<Double>();
		System.out.println("");
		System.out.println("Testing GenericQueue");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		System.out.println("Queue is empty: " + queue.isEmpty());
		for(int i=0;i<20;i++)
		{
			queue.enqueue(random.nextInt(10000)/100.0);
		}
		Double rand = random.nextInt(10000)/100.0;
		System.out.println(queue);
		System.out.println("Queue size: " + queue.size());
		System.out.println("Queue is empty: " + queue.isEmpty());
		System.out.println("Filling queue");
		System.out.println("First element of queue: " + queue.peek());
		System.out.println("Queue contains " + rand + ": " + queue.contains(rand));
		System.out.println("Enqueued " + rand);
		queue.enqueue(rand);
		System.out.println("Queue contains " + rand + ": " + queue.contains(rand));
		System.out.println("Dequeud " + queue.dequeue());
		
		System.out.println(queue);
	}

	
	public static <E extends Comparable <E>> E getLargest(List<E> theList)
	{
		E largest = theList.get(0);
		for (E e: theList)
		if(e.compareTo(largest) > 0) largest = e;
		return largest;
	}
	
}
