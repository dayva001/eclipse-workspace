package pq;

public class Bigfoot extends Cryptid
{
	
	int shoeSize;
	
	public Bigfoot(String name, int shoeSize)
	{
		this.name = name;
		this.shoeSize = shoeSize;
	}
	
	public void attack()
	{
		System.out.println(name + " the Bigfoot stomps with their size " + shoeSize + " feet!");	
	}

	public String toString()
	{
		return (name + " the Bigfoot");
	}
	
}
