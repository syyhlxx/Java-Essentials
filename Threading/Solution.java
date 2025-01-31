package CodeSamples;


import java.util.List;
import java.util.Iterator;

public class Solution {
	
	 static long start;
     static long end ;
	 public static volatile int numSeconds =3;

	    public static void main(String[] args) throws InterruptedException {
	    	
	        RacingClock clock = new RacingClock(); 
	       
	        if(end - start >=3500) 
				clock.interrupt();
			
	    }

	    public static class RacingClock extends Thread {
	        public RacingClock() {
	            start();
	        }

	        public void run() {
	            //write your code here
	        	String iterations = new String(); // default size 16
	        	String addOn = "";
	        		
	        	long start = System.currentTimeMillis();
	        	
	        	while(numSeconds > 0) {
	  
	        		try {
						Thread.sleep(1000);// Triggers the need for a try catch.
						iterations = iterations.concat(" ").concat(Integer.toString(numSeconds));	
						numSeconds --;
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	}
	        	
	        	 end = System.currentTimeMillis();
	         
	        	 if(end - start >=3500) {
	        		 addOn += " Interrupted!";
	        	 }
	        	 else
	        		 addOn += " Go!";
	        	//If run time is of a certain time add the appropriate dialog tag.
	        	iterations += addOn;
	        	System.out.print(iterations);
	        }
	    }
		   
}



/*
 * 
	   public static byte threadCount = 3;
	    static List<Thread> threads = new ArrayList<>(threadCount);

	    public static void main(String[] args) throws InterruptedException {
	        initThreadsAndStart();
	        Thread.sleep(3000);
	        ourInterrupt();
	    }

	    public static void ourInterrupt() {
	        //write your code here
	    	Iterator<Thread> iterator = threads.iterator();
	    	while(iterator.hasNext())
	    	iterator.next().interrupt();
	    }

	    private static void initThreadsAndStart() {
	        Water water = new Water("water");
	        for (int i = 0; i < threadCount; i++) {
	            threads.add(new Thread(water, "#" + i));
	        }

	        for (int i = 0; i < threadCount; i++) {
	            threads.get(i).start();
	        }
	    }

	    public static class Water implements Runnable {
	        private String sharedResource;

	        public Water(String sharedResource) {
	            this.sharedResource = sharedResource;
	        }

	        public void run() {
	            //fix 2 variables
	           
	            String threadName = "";
	            boolean isCurrentThreadInterrupted = false;
	            Thread current = Thread.currentThread();
	            threadName = Thread.currentThread().getName();
	            isCurrentThreadInterrupted= Thread.currentThread().isInterrupted();
	            
	            
	            
	            try {
	                while (!isCurrentThreadInterrupted) {

	                    System.out.println("Object " + sharedResource + ", thread " + threadName);
	                    Thread.sleep(1000);
	                }
	            } catch (InterruptedException e) {
	            }
	        }
	    }

 */


/* private static boolean isCanceled = false;

public static void main(String[] args) throws InterruptedException {
       Thread t = new Thread(new TestThread());
       t.start();
       Thread.sleep(3000);
       ourInterrupt();
   }

   public static void ourInterrupt() {
     isCanceled = true;
   }

   public static class TestThread implements Runnable {
       public void run() {
           while (!isCanceled) {
               try {
                   System.out.println("he-he");
                   Thread.sleep(500);
               } catch (InterruptedException e) {
               }
           }
       }
   }*/

/*
 * 
	 public static void main(String[] args) throws IOException {
		  
	        
	        // Create and run thread
	        TestThread myTest = new TestThread();
	        myTest.start();
	        
	       
	        myTest.interrupt();
	       
	    }
	
	 public static class TestThread extends Thread{
		 
		 public void run() {
	        	
			 System.out.println(String.format("Am%s","ISam"));
	    }
		 
}
 */

/*
 * 
		  public static void main(String[] args) throws IOException {
			  
		        InputStreamReader in = new InputStreamReader(System.in);
		        BufferedReader reader = new BufferedReader(in);
		        
		        // Create and run thread
		        Stopwatch stopwatch = new Stopwatch();
		        stopwatch.start();
		        
		        // Read a string
		        reader.readLine();
		        stopwatch.interrupt();
		        
		        // Close streams
		        reader.close();
		        in.close();
		    }

		    public static class Stopwatch extends Thread {
		        private int seconds;

		        public void run() {
		        	
		        	Thread current = Thread.currentThread();
		        	
		            try {
		            	while (!current.isInterrupted())
		            	{
		            	Thread.sleep(1000);
		            	seconds++;
		            	}
		            } catch (InterruptedException e) {
		                System.out.println(seconds);
		            }
		        }
		    }
    

 */

//String.format("Hello %s, %d", "world", 42);

/* System.out.println(String.format("I%s","SamAm"));
 System.out.println(String.format("I%s","AmSam"));
 System.out.println(String.format("Sam%s","AmI"));
 System.out.println(String.format("Sam%s","IAm"));
 System.out.println(String.format("Am%s","SamI"));
 System.out.println(String.format("Am%s","ISam"));
*/
