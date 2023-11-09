
public class MyNode<T> 
{
	//variables
	private T t;
	private MyNode<T> next;
	
	//constructor
	public MyNode(T t, MyNode<T> next)
	{
		this.t = t;
		this.next = next;
	}
	
	public MyNode(T t)
	{
		this.t = t;
	}
	
	//setters and getters
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public MyNode<T> getNext() {
		return next;
	}
	public void setNext(MyNode<T> next) {
		this.next = next;
	}
}
