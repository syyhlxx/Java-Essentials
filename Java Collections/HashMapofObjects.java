import java.util.HashMap;
import java.util.Map;
public class HashMapofObjects {

    public static void main(String[] args) {
        //Create a hash map and insert a series of different object sets.
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //Traverse each set in the map and print the value
        //of each key, value pair.
        for(Map.Entry<String,Object> pair: map.entrySet()){
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
