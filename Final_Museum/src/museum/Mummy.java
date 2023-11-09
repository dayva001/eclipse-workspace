package museum;

public class Mummy extends Artifact implements Cursed {

	protected String nameOfPerson = "name unknown";
	protected boolean isCursed = false;
	protected boolean magicProtection = true;
	protected String description = "no description available";
	protected String year = "unknown year";
	//Constructors
	
	 public Mummy(String nameOfThisArtifact)
	 {
		 super(nameOfThisArtifact);
	 }
     public Mummy(String nameOfThisArtifact, String nameOfPerson, boolean isCursed, boolean magicProtection,
             String description, String fromYear) 
     {
    	 super(nameOfThisArtifact);
    	 this.nameOfPerson = nameOfPerson;
    	 this.isCursed = isCursed;
    	 this.magicProtection = magicProtection;
    	 this.description = description;
    	 year = fromYear;
    	 
    	 
     }
     
     //Setters and Getters
     
     public void setNameOfPerson(String nameOfPerson)
     {
    	 this.nameOfPerson = nameOfPerson;
     }
     public String getNameOfPerson() 
     {
    	 return nameOfPerson;
     }
     public String toString()
     {
    	 if(isCursed && !magicProtection)
    	 {
    		 return nameOfPerson + ", the " + super.getNameOfArtifact() + " springs to life and lunges towards you.";
    	 }
    	 if(isCursed && magicProtection)
    	 {
    		 return "The " + super.getNameOfArtifact() + " begins to rumble, but a magical force prevents it from going further";
    	 }
    	 else
    	 {
    		 return (super.name + ". " + nameOfPerson + ". " + description + ", circa " + year);
     
    	 }
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
