package exam;

import java.lang.Thread.State;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class CrimeWave {
    Random r = new Random();
    
    // create the priority queue for the crimes here.  Call it crimes.
    Queue<Crime> crimes = new PriorityQueue<Crime>();
        
    Integer committed = 0;
    Integer solved = 0;

    public void meanStreets() {
        Detective d1 = new Detective("d1");
        Detective d2 = new Detective("d2");
        Criminal c1 = new Criminal("c1");
        Criminal c2 = new Criminal("c2");

        // create and start the threads (one per criminal and one per detective) here
        Thread thread1 = new Thread(d1);
        Thread thread2 = new Thread(d2);
        Thread thread3 = new Thread(c1);
        Thread thread4 = new Thread(c2);
        
        thread3.start();
        thread4.start();
        thread1.start();
        thread2.start();



    // write a while loop here that continues as long as at least one of the criminals is
    // still in business (ie, which the thread for the criminal is not terminated).  If the
    // loop condition is true, use Thread.sleep to wait 200 milliseconds before checking again 
        while(thread3.getState() != State.TERMINATED || thread4.getState() != State.TERMINATED || !crimes.isEmpty()) {
	        	try { Thread.sleep(200);
	        	} catch (InterruptedException e) {
	        	e.printStackTrace();
	        	}
        	}
        System.out.println("committed: " + committed);
        System.out.println("solved: " + solved);
    }

    public void commitCrime(Crime c) {
    	crimes.add(c);
        committed++;
    }

    public synchronized void solveCrimes(String name) {
    	do
    	{
	        try {
	            while (crimes.isEmpty())
	            {
	                Thread.sleep(25);
	            }
	            int s = crimes.remove().getSeverity();
	            
	            solved++;
	            System.out.println(name + " solves a crime of seriousness " + s);
	            Thread.sleep(60);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
    	}
    	while(!crimes.isEmpty());
    }

    public static void main(String[] args) {
        CrimeWave c = new CrimeWave();
        c.meanStreets();
        System.exit(0);
    }

    private class Crime implements Comparable<Crime> {

    	protected int severity;
    	
    	public Crime(int s)
    	{
    		severity=s;
    	}
    	
    	public int getSeverity()
    	{
    		return severity;
    	}

		@Override
		public int compareTo(CrimeWave.Crime o) {
			return (severity - o.severity);
		}

    }

    private class Criminal implements Runnable {
        String name;

        private Criminal(String nameIn) {
            name = nameIn;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(r.nextInt(100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int s = (r.nextInt(5));
                Crime c = new Crime(s);
                System.out.println(name + " commits a crime of seriousness "
                        + s);
                
                commitCrime(c);
                
            }
        }

    }

    private class Detective implements Runnable {

        private String name;
        
        public Detective(String name)
        {
        	this.name = name;
        }
        
		@Override
		public void run() {
	          solveCrimes(name);
        }

    }
}