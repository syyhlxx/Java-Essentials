import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HashDate {

    public static Map<String, Date> createMap() throws ParseException {
        //Initialize a SimpleDateFormat object, create a hashmap.
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();

        //Fill the hashmap with objects.
       try{
        map.put("Jeff", dateFormat.parse("JUN 1 2012"));
        map.put("Steve", dateFormat.parse("JUL 1 2012"));
        map.put("Mark", dateFormat.parse("AUG 1 2012"));
        map.put("Logan", dateFormat.parse("FEB 1 2012"));
        map.put("Collin", dateFormat.parse("APR 1 2012"));
        map.put("Mike", dateFormat.parse("JUL 1 2012"));
        map.put("Olaf", dateFormat.parse("JAN 1 2012"));
        map.put("Ray", dateFormat.parse("OCT 1 2012"));
        map.put("North", dateFormat.parse("NOV 1 2012"));
        map.put("West", dateFormat.parse("DEC 1 2012"));

       }

    catch (Exception e){
    }
        return map;
    }

    public static void printMap(Map<String, Date> map) {
        //Create an iterator out the hashmap passed in as a parameter.
        Iterator<Map.Entry <String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            //Traverse the iterator and print the value of the key,value pair
            //from objects in the hashmap.
            Map.Entry <String, Date> pair = iterator.next();
            System.out.println(pair.getValue());
            System.out.println(pair.getKey());
        }
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //Create an iterator out the hashmap passed in as a parameter.
        Iterator<Map.Entry <String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            //Traverse the iterator
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            System.out.println(date.toString());
            //Compare the month abbreviation to the value of the key/value pair.
            if(date.toString().contains("JUN")||date.toString().contains("JUL")
                    ||date.toString().contains("AUG"))
                //If there is a match remove that object.
                iterator.remove();
        }
        printMap(map);
    }

    public static void main(String[] args) throws ParseException {

        removeAllSummerPeople(createMap());
    }
}
