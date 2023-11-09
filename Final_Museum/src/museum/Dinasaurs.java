package museum;

public class Dinasaurs extends Artifact
{
	protected String typeOfDinosaur = "type not known";
	protected String description = "no description available";
	protected String Year = "year unknown";
	public Dinasaurs(String nameOfThisArtifact)
	{
		super(nameOfThisArtifact);
	}
	public Dinasaurs(String nameOfThisArtifact, String typeOfDinasaur, String description, String year)
	{
		super(nameOfThisArtifact);
		typeOfDinosaur = typeOfDinasaur;
		this.description = description;
	}
	public String getTypeOfDinasaur() 
	{
		return typeOfDinosaur;
	}
	public void setTypeOfDinasaur(String typeOfDinasaur) 
	{
		typeOfDinosaur = typeOfDinasaur;
	}
	public String toString()
	{
		return (super.name + ". " + typeOfDinosaur + ". " + description + ", circa " + year);
	}
}
