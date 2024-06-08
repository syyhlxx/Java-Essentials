
import java.util.*;
import java.time.Instant;
public class MeasureTime {
    //Measure the time it takes to create a list.
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        //Log the start time.
        long startTime = System.currentTimeMillis();
        //Create a list.
        insert10000(list);
        //Log the current time.
        long estimatedTime = System.currentTimeMillis() - startTime;

        return estimatedTime;
    }

    //Insert 1000 new objects into a list.
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
 }



