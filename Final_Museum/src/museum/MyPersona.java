package museum;

import java.util.ArrayList;
import java.util.Random;

public class MyPersona {

	//You must customize this to include your information for grading information, and fun quotes
	
	public final String name = "Darius Ayvazian";
	public final String myEmail = "dayvazi2@calstatela.edu";
	
	private ArrayList<String> sayings = new ArrayList<String>();
	
	public MyPersona() {
		// things that you might say at a Fair or whatever
		sayings.add("I wonder where everyone is getting those lemonades");
		sayings.add("Hello there");
		sayings.add("The cake is a lie");
		sayings.add("Well butter my butt and call me a biscuit");
		sayings.add("I don't think that bolt was supposed to come off");
		sayings.add("Where did Jason go?");
		sayings.add("Wow");
		sayings.add("Huh");
		
		// keep going, need at least 5
	}
	
	public String getRandomSaying() {
		Random rndx = new Random();
		int sayNum = rndx.nextInt(sayings.size());
		return sayings.get(sayNum);
	}
		
	public ArrayList<String> getSayingList(){
		return sayings;
	}

	public String getName() {
		return name;
	}

	public String getMyEmail() {
		return myEmail;
	}
}
