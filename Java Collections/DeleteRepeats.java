import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeleteRepeats {

    public static Map<String, String> createMap() {
        //Set up a hash map of key, value pairs.
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "Tauriel");
        map.put("Johnson", "Thranduil");
        map.put("Williams", "Legolas");
        map.put("Brown", "Thranduil");
        map.put("Jones", "Glorfildel");
        map.put("Garcia", "Finwe");
        map.put("Miller", "Emily");
        map.put("Davis", "Thranduil");
        map.put("Rodriguez", "Echthelion");
        map.put("Martinez", "Thranduil");

    return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //Create two copies of the input parameter "map."
        Map<String, String> iMapCopy = new HashMap<>(map);
        Map<String, String> mapCopy = new HashMap<>(map);

        //Create an iterator from mapCopy.
        Iterator<Map.Entry<String, String>> mapCopyiterator =
                mapCopy.entrySet().iterator();

        //removeItemFromMapByValue(map,pair.getValue());
        //Iterato over iMapCopy using a for loop
        for (Map.Entry<String, String> iEntry : iMapCopy.entrySet()) {
            //System.out.println(iEntry.toString());
            //Use a while loop to traverse the mapCopyIterator.
            while (mapCopyiterator.hasNext()) {
                Map.Entry<String, String> pairCopy = mapCopyiterator.next();

                //System.out.println(pairCopy.toString());
                //System.out.println(iEntry.getValue().toString());

                //Compart the value of each key,value pair from the two
                //maps, if they match remove the matching pair.
               if (pairCopy.getValue().equals(iEntry.getValue())) {
                   removeItemFromMapByValue(map, pairCopy.getValue());
               }
            }
        }
         printMap(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        //Create a copy of the map passed in as a parameter.
        Map<String, String> copy = new HashMap<>(map);
        //Iterate through the map pairs "value" parameter which is the second
        //in the key, value pair, compare the value to that passed in
        //as a parameter.
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            //If a value in the map matches that passed in as a parameter
            // remove that key, value pair.
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
    public static void printMap(Map<String, String> map) {
        //Create an iterator over the sets in the hashmap.
        Iterator<Map.Entry <String, String>> iterator = map.entrySet().iterator();
       //Iterate through each set in the map.
        while(iterator.hasNext()){
            //Store the value of each "next" in the variable pair.
            Map.Entry <String, String> pair = iterator.next();
            //Print the value of each key,value pair.
            System.out.println(pair.getValue());
            //System.out.println(pair.getKey());
        }
    }

    public static void main(String[] args) {
      // printMap(createMap());
       removeFirstNameDuplicates(createMap());
    }
}
/*

public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if(value < 500)
               iterator.remove();
        }

 */

/*
 Map<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
 */