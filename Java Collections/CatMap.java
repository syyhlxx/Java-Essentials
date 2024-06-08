import java.util.HashMap;
import java.util.Map;

public class CatMap {

    public static void main(String[] args) throws Exception {
        String[] catsArray = new String[]{"cooper", "missy", "oreo", "tiger", "lulu",
                "tucker", "jasmine", "jackson", "murphy", "pepper"};

        Map<String, Cat> map = addCatsToMap(catsArray);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //int len = 0;
        Map<String, Cat> map = new HashMap<String, Cat>();
        for (int i = 0, len = cats.length; i < len; i++) {
            Cat kitty = new Cat(cats[i]);
            map.put(cats[i],kitty);
        }
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
