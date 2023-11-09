package pq;

abstract class Cryptid implements Comparable<Cryptid>
{
	protected String name;
	
	public abstract void attack();
	
	public int compareTo(Cryptid other)
	{
		return name.compareTo(other.name);
	}
}
