
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class InsertionsDeletions {

    public static void main(String[] args) {

    // ArrayList
    ArrayList <String>arrayList = new ArrayList<String>();
    insert10000(arrayList);
    get10000(arrayList);
    set10000(arrayList);
    remove10000(arrayList);

    // LinkedList
    LinkedList<String> linkedList = new <String> LinkedList();
    insert10000(linkedList);
    get10000(linkedList);
    set10000(linkedList);
    remove10000(linkedList);
}

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            //Insert objects into the list.
            list.add(0, new Object());
        }
    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            //Retrieve objects from the list.
            list.get(5000);
        }
    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            //Replace object within a list.
            list.set(5000, new Object());
        }
    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            if (list.isEmpty()) {
                return;
            }
            //Remove object from a list.
            list.remove(0);
        }
    }
}

