package pq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PQ<E extends Comparable <? super E>>
{
	List<E> priorityQueue = new ArrayList<E>();
	
	public void insert(E item)
	{
		int current=size();
		priorityQueue.add(item);
		while(priorityQueue.get(current).compareTo(priorityQueue.get(parent(current))) < 0)
		{
			Collections.swap(priorityQueue, current, parent(current));
			current = parent(current);
        }
	}
	
	private int parent(int i)
	{
		return i/2;
	}
	
	private int left(int i)
	{
		return i*2;
	}
	
	private int right(int i)
	{
		return (i*2)+1;
		
	}
	
	public int size()
	{
		return priorityQueue.size();
	}
	
    private boolean isLeaf(int i)
    {
 
        if ( i> (size() / 2) || size()==0) {
            return true;
        }
 
        return false;
    }
	
	private void minHeapify(int i)
	{
		int l = left(i);
		int r = right(i);
		int smallest=i;
		if(!isLeaf(i))
		{
			if ((l <size()) && priorityQueue.get(l).compareTo(priorityQueue.get(i)) < 0)
			{
				smallest=l;
			}
			if(r < size() && priorityQueue.get(r).compareTo(priorityQueue.get(smallest)) < 0 )
			{
				smallest=r;
			}
			if(smallest!=i)
			{
				Collections.swap(priorityQueue, i, smallest);
				minHeapify(smallest);
			}
			
		}
	}
	
	public E min()
	{
		return priorityQueue.get(0);
	}

	public E removeMin()
	{
		E min = priorityQueue.get(0);
		Collections.swap(priorityQueue, 0, size()-1);
		priorityQueue.remove(size()-1);
		minHeapify(0);
		return min;
		
	}
	
	public Boolean isEmpty()
	{
		return size()==0;
	}
	
	public String toString()
	{
		return priorityQueue.toString();
	}
}
