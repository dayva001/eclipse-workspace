
public class MyLinkedList<T>
{
	private MyNode<T> first;
	private MyNode<T> last;
	
	public MyLinkedList()
	{
		first=last;
	}
	public MyLinkedList(T t)
	{
		first = new MyNode<T>(t);
		last = first;
	}
	
	public void add(T t)
	{
		MyNode<T> newNode = new MyNode<T>(t);
		if(first==null)
		{
			first = last = newNode;
		}
		last.setNext(newNode);
		last = newNode;
	}
	
	public T getFirst()
	{
		return first.getT();
	}
	
	public T getLast()
	{
		return last.getT();
	}
	
	public void printList()
	{
		MyNode<T> tNode = first;
		while(tNode!=null)
		{
			System.out.println(tNode.getT());
			tNode=tNode.getNext();
		}
	}
	
	public Boolean inList(T t)
	{		
		MyNode<T> tNode = first;
		while(tNode!=null)
		{
			if(tNode.getT().equals(t))
			{
				return true;
			}
			tNode=tNode.getNext();
		}
		return false;
	}


}
