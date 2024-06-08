
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashCensus {

    public static Map<String, String> createMap() {
        //Create a HashMap
        Map<String, String> map = new HashMap<>();
        map.put("Innil", "Gemflower");
        map.put("Galinndan", "Starflower");
        map.put("Aelar", "Moonwhisper");
        map.put("Paelias", "Diamonddew");
        map.put("Bethrynna", "Gemblossom");
        map.put("Keyleth", "Silverfrond");
        map.put("Faen", "Oakenheel");
        map.put("Bryn", "Goldpetal");
        map.put("Ara", "Xiloscient");
        map.put("Faen", "Silverfrond");
        return map;

    }

    public static int getSameLastNameCount(Map<String, String> map, String name) {
        //write your code here
        int result = 0;
        //Create an iterator from the result of entrySet().
        Iterator<Map.Entry <String, String>> iterator = map.entrySet().iterator();
        //Cycle through the interator
        while(iterator.hasNext()){
            Map.Entry <String, String> pair = iterator.next();
            //Compare the key value from the key,value pair to the
            //name passed in as a parameter.
            String key = pair.getKey();
            //If there is a match, increment result
            //and return result.
            if(key.equals(name)){
                result++;
            }
        }
        return result;
    }

    public static int getSameFirstNameCount(Map<String, String> map, String lastName) {
        //write your code here
        int result = 0;
        //Create an iterator from the result of entrySet().
        Iterator<Map.Entry <String, String>> iterator = map.entrySet().iterator();
        //Traverse the interator
        while(iterator.hasNext()){
            //Access each result set in the iterator
            Map.Entry <String, String> pair = iterator.next();
            String value = pair.getValue();
            //Compare the value of the result to the parameter passed in.
            //If there is a match increment result. Return result.
            if(value.equals(lastName)){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(getSameFirstNameCount(createMap(),"Silverfrond"));
        System.out.println(getSameLastNameCount(createMap(),"Ara"));

    }
}
/*

for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;
 */