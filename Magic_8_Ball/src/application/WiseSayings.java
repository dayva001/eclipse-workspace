package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WiseSayings
{
	private static List<String> Sayings = new ArrayList<String>
	(Arrays.asList("As i see it, yes.",
				   "Better not tell you now.",
				   "Cannot predict now.",
				   "Concentrate and ask again.",
				   "Don't count on it",
				   " It is certain.",
				   "It is decidedly so.",
				   "   Most likely.",
				   "My reply is no",
				   "My sources say no.",
				   "Outlook not so good.",
				   "Reply hazy, try again.",
				   "Signs point to yes.",
				   "Very doubtful.",
				   "Without a doubt.",
				   "            Yes.",
				   "Yes - definitely.",
				   "You may rely on it."));
	private static Random random = new Random();
	
	public static String GetRandomSaying()
	{
		return(Sayings.get(random.nextInt(Sayings.size()-1)));
	}
	
}
