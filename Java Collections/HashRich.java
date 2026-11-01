
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashRich {

    static class WarriorInfo {
        int age;
        int strength;
        int felledEnemies;

        WarriorInfo(int age, int strength, int felledEnemies) {
            this.age = age;
            this.strength = strength;
            this.felledEnemies = felledEnemies;
        }
    }
   
    public static Map<String, WarriorInfo> createMap() {
        //Set up a hash map of key, value pairs.
        Map<String, WarriorInfo> warriors = new HashMap<>();
        warriors.put("Glorfindel", new WarriorInfo(1000, 75, 100));
        warriors.put("Celebrimbor", new WarriorInfo(5000, 500, 50));
        warriors.put("Eärendil ", new WarriorInfo(1000, 100, 10));
        warriors.put("Fëanor ", new WarriorInfo(1867, 12000, 0));
        warriors.put("Idril", new WarriorInfo(3204, 13000, 0));
        warriors.put("Elrohir", new WarriorInfo(7802, 3000, 14001));
        warriors.put("Elladanz", new WarriorInfo(1000, 1000, 89));
        warriors.put("Aredhel", new WarriorInfo(1000, 500, 778));
        return warriors;
    }
    public static void printMap(Map<String, WarriorInfo> map) {
        //Create and iterator from the map.
        Iterator<Map.Entry <String, WarriorInfo>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            //Traverse the iterator and print the value
            // of the key,value pair.
            Map.Entry <String, WarriorInfo> pair = iterator.next();
            System.out.print(pair.getKey() + " of "+ pair.getValue().age + 
            " " +"ages" +" slew " + pair.getValue().felledEnemies+ 
            " enemies in battle..." + "\n");
        }
    }
    public static void removeItemFromMap(Map<String, WarriorInfo> map) {
        //Create and iterator from the map.
        Iterator<Map.Entry <String, WarriorInfo>> iterator = map.entrySet().iterator();
        //Traverse the interator.
        while(iterator.hasNext()){
            //For each entry in the map compare the value to the
            //number 500. If it's less, remove that key,valure pair.
            Map.Entry <String, WarriorInfo> pair = iterator.next();
            Integer bodyCount = pair.getValue().felledEnemies;
            if(bodyCount < 500){
                iterator.remove();
            }
        }
        printMap(map);
    }
    

    public static void main(String[] args) {
       removeItemFromMap(createMap());
      // printMap(createMap());
    }
}
