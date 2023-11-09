package Generics;

import java.util.ArrayList;

public class GenericQueue<E>
{
	private ArrayList<E> queue = new ArrayList<E>();
	
	public int size() {
		return queue.size();
	}
	
	public void enqueue(E item) 
	{
		queue.add(item);
	}
	
	public E peek() 
	{ 
		if(!isEmpty())
		{
			return queue.get(0);
		}
		else
		{
			return null;
		}
	}
	
	public E dequeue()
	{
		E temp = queue.get(0);
		queue.remove(0);
		return temp;
	}
	
	public Boolean contains(E item)
	{
		for(E e:queue)
		{
			if(e.equals(item))
			{
				return true;
			}
		}
		return false;
		
	}
	
	public Boolean isEmpty()
	{
		return queue.size()==0;
	}
	
	public String toString()
	{
		return queue.toString();
	}
}
