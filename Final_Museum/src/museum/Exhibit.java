package museum;

import java.util.ArrayList;

public class Exhibit 
{
	public enum DisplayType {WALL, GLASSCASE, PEDISTAL, HANGFROMCELING};
	DisplayType display = DisplayType.WALL;
	protected ArrayList<Artifact> artifacts;
	public Exhibit()
	{
		artifacts = new ArrayList<Artifact>();
	}
	public Exhibit(DisplayType display, Artifact artifact) 
	{
		artifacts = new ArrayList<Artifact>();
		this.display = display;
		 artifacts.add(artifact);
		
	}
	public DisplayType getDisplayType()
	{
		return display;
	}
	public void setDisplayType(DisplayType type)
	{
		display = type;
	}
	public ArrayList getArtifactList() 
	{
		return artifacts;
	}
	public void addArtifact(Artifact newArt)
	{
		artifacts.add(newArt);
	}
	public String toString()
	{
		return display + ": " + artifacts.toString();
	}

}
