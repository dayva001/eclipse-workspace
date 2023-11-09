package pq;

public class Yeti extends Cryptid{

	private double fangLength;
	
	public Yeti(String name, double fangLength)
	{
		this.name = name;
		this.fangLength = fangLength;
	}
	
	public void attack() 
	{
		System.out.println(name + " the Yeti attacks with their " + fangLength + " cm fangs!");
	}
	
	public String toString()
	{
		return (name + " the Yeti");
	}

}
