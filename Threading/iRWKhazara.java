package CodeSamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class iRWKhazara {

	//Set the number of threads to use.
    public static byte threadCount = 5;
    //Create a list of threads.
    static List<Thread> threadsList = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        //Create and initialize new threads. 
    	initThreadsAndStart();
    	//Sleep for three seconds...
        Thread.sleep(3000);
        //Interrupt each thread.
        ourInterrupt();
    }

    public static void ourInterrupt() {
        //Create iterator to traverse a list of threads.
    	Iterator<Thread> iterator = threadsList.iterator();
    	//Iterate through the list of threads.
    	while(iterator.hasNext())
    	//Interrupt each thread in the list.	
    	iterator.next().interrupt();
    }

    private static void initThreadsAndStart() {
    	//Create new class instance...
        NullifierCore Core = new NullifierCore("nullcore");
        
        for (int i = 0; i < threadCount; i++) {
        	//Pass instances of the class to the thread constructor
        	//while adding to the thread arraylist. Number of class
        	//instances is based on threadcount.
            threadsList.add(new Thread(Core, "designation" + " " +	i));
        }

        for (int i = 0; i < threadCount; i++) {
        	//Call the start method on each thread in the
        	//arraylist.
            threadsList.get(i).start();
        }
    }

    //If the class implements the Runnable interface, 
    //the thread can be run by passing an instance of the class 
    //to a Thread object's constructor and then calling the thread's start() method:
    public static class NullifierCore implements Runnable {
        private String sharedResource;

        public NullifierCore(String sharedResource) {
            this.sharedResource = sharedResource;
        }
        
        //Calling start on each thread runs this method for the individual thread.
        public void run() {
            //fix 2 variables
           
            String threadName = "";
            boolean isCurrentThreadInterrupted = false;
            Thread current = Thread.currentThread();
            
            //Get the name and status of each running thread.
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
}
