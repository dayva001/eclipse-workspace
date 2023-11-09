package lab_1;

import java.util.Random;

public abstract class Animal {

            Random r = new Random();

            double health = 1.0;       // if health reaches 0, the Animal dies

            double accuracy;         // probability (0 to 1) that an attack by this Animal hits its target.

            double power;             // amount of damage (0 to 1) done by a successful attack by this Animal

            String name;

            public boolean isAlive(){

            // write code here to return true if the Animal's health is a positive number, otherwise false               
            	return health > 0;
            	
            }

            // receiveInjury() is run when this animal is the victim of a successful attack

            public void receiveInjury(double d){            

                        // write code here to do the following:

                        // reduce this Animal's health by d, the parameter

                        // print a message about the damage

                        // print a message if the Animal is now dead                    

                        // otherwise, print a message showing the Animal's current health
            health -= d;
            
            System.out.println(d+ "damage taken");
            
            if(!isAlive())
            {
            	System.out.println(name + " is dead");
            	
            }
            
            else
            {
            	System.out.println(name + "has " + health + " health");
            }
            
            }

            public void attack(Animal target){

                        //  write code here to do the following:

                        // print a message indicating whom this Animal is attacking (name of the other Animal)

                        //  get a random double between 0 and 1

                        //  if the random double is less than accuracy, the attack succeeds.  In that case,

                        // call receiveInjury(power) on target.  The argument is *this* Animal's power.

                        //  otherwise, the attack fails.  Print a message indicating that the attack missed.
            	
            			System.out.println(name + " is attacking " + target.getName());
            			if(r.nextDouble(1) < accuracy)
            			{
            				target.receiveInjury(power);
            				
            			
            			}
            			else
            			{
            				System.out.println(name + "'s attack on " + target.getName() + " missed");
            			}
            }           

            public String getName()
            {
            	return name;
            }

}