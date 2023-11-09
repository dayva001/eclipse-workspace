package museum;

public abstract class Artifact 
{
	protected String name;
	protected String description="";
	protected String year = "";
	
	public Artifact(String name)
	{
		this.name = name;
	}
	
	public String getNameOfArtifact()
	{
		return name;
	}
	public void setNameOfArtifact(String nameOfArtifact)
	{
		name = nameOfArtifact;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getWhatYear()
	{
		return year;
	}
	public void setWhatYear(String thatYear)
	{
		year = thatYear;
	}
	public String toString()
	{
		return (name + ", " + description + ", " + year);
	}
	
}
