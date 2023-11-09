package museum;

public class MedievalArmor extends Artifact implements Cursed{

	protected String originalOwner = "Unknown Owner";
	protected boolean isCursed = false;
	protected boolean magicProtection = true;
	protected String description = "no description available";
	protected String Year = "unknown year";
	protected String armorType = "unknown armor type";

	//Constructors
	 public MedievalArmor(String nameOfThisArtifact) 
	    {
	    	super(nameOfThisArtifact);
	    }
	 
	    public MedievalArmor(String nameOfThisArtifact, String originalOwner, boolean isCursed,
	            boolean magicProtection, String description, String fromYear, String armorType) 
	    {
	    	super(nameOfThisArtifact);
	    	this.originalOwner = originalOwner;
	    	this.isCursed = isCursed;
	    	this.magicProtection = magicProtection;
	    	this.description = description;
	    	year = fromYear;
	    	this.armorType = armorType;
	    }
	    
	//Setters & Getters
	    
	    public String getArmorType() 
	    {
	    	return armorType;
	    }
	    public void setArmorType(String armorType) 
	    {
	    	this.armorType = armorType;
	    }
	    public String getOriginalOwner() 
	    {
	    	return originalOwner;
	    }
	    public void setOriginalOwner(String originalOwner) 
	    {
	    	this.originalOwner = originalOwner;
	    }
	    public String toString()
	    {
	    	 if(isCursed && !magicProtection)
	    	 {
	    		 return "The " + super.name + " flies up into the air and comes crashing down violently.";
	    	 }
	    	 if(isCursed && magicProtection)
	    	 {
	    		 return "The " + super.getNameOfArtifact() + " begins to rumble, but a magical force prevents it from going further";
	    	 }
	    	return (super.name + ". " + armorType + ", owned by " + originalOwner + ". " + description + ", circa " + year);
	    }

	    
	public void applyMagicSeal()
	{
		magicProtection = true;
	}

	public void removeMagicSeal() 
	{
		magicProtection = false;
	}

	public boolean checkMagicSeal() 
	{
		return magicProtection;
	}

	public boolean getIsCursed() 
	{
		return isCursed;
	}

	public void setIsCursed(boolean x) 
	{
		isCursed = x;
	}

}
