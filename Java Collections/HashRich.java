
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashRich {
    public static Map<String, Integer> createMap() {
        //Set up a hash map of key, value pairs.
        Map<String, Integer> map = new HashMap<>();
        map.put("Smith", 1000);
        map.put("Johnson", 500);
        map.put("Williams", 100);
        map.put("Brown", 200);
        map.put("Jones", 300);
        map.put("Garcia", 12000);
        map.put("Miller", 13000);
        map.put("Davis", 3000);
        map.put("Rodriguez", 1000);
        map.put("Martinez", 500);
        return map;
    }
    public static void printMap(Map<String, Integer> map) {
        //Create and iterator from the map.
        Iterator<Map.Entry <String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            //Traverse the iterator and print the value
            // of the key,value pair.
            Map.Entry <String, Integer> pair = iterator.next();
            System.out.println(pair.getValue());
            // System.out.println(pair.getKey());
        }
    }
    public static void removeItemFromMap(Map<String, Integer> map) {
        //Create and iterator from the map.
        Iterator<Map.Entry <String, Integer>> iterator = map.entrySet().iterator();
        //Traverse the interator.
        while(iterator.hasNext()){
            //For each entry in the map compare the value to the
            //number 500. If it's less, remove that key,valure pair.
            Map.Entry <String, Integer> pair = iterator.next();
            Integer salary = pair.getValue();
            if(salary < 500){
                iterator.remove();
            }
        }
        printMap(map);
    }

    public static void main(String[] args) {
       removeItemFromMap(createMap());
    }
}
