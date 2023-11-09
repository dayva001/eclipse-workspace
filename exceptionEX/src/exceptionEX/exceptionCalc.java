package exceptionEX;



public class exceptionCalc
{

		  /** Main method */
		  public static void main(String[] args) {
		  // Check number of strings passed
		  if (args.length != 3) {
		  System.out.println(
		  "Usage: java Calculator operand1 operator operand2");
		  System.exit(1);
		  }
		  checkInput(args);
		 // The result of the operation
		 int result = 0;
		
		 // Determine the operator
		 switch (args[1].charAt(0)) {
		 case '+': result = Integer.parseInt(args[0]) +
		 Integer.parseInt(args[2]);
		 break;
		 case '−': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
		 break;
		 case '.': result = Integer.parseInt(args[0]) *
		 Integer.parseInt(args[2]);
		 break;
		 case '/': result = Integer.parseInt(args[0]) /
		 Integer.parseInt(args[2]);
		 }
		
		 // Display result
		 System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
		 }
		  
		 public static void checkInput(String[] args)
		 {
			  int x, y;
			  try 
			  {
				  x = Integer.parseInt(args[0]);
			  }
			  catch(NumberFormatException ex )
			  {
				  System.out.println("Wrong Input " + args[0]);
				  System.exit(0);
			  }
			  try
			  {
				  y = Integer.parseInt(args[2]);
			  }
			  catch(NumberFormatException ex)
			  {
				  System.out.println("Wrong Input " + args[2]);
				  System.exit(1);
			  }
		 }
}
