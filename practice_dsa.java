import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class practice_dsa {

    public static void main(String[] args) {
        // System.out.println("Hello, DSA!");

        // ArrayList<String> list = new ArrayList<>();
        // list.add("Data");
        // list.add("Structures");
        // list.add("Algorithms");

        // System.out.println(list);

        // hashset

        // HashSet<String> set = new HashSet<>();
        // set.add("Data");
        // set.add("Structures");
        // set.add("Data"); // Duplicate, will not be added

        // System.out.println(set);

        // hashmap

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Data", 1);
        map.put("Structures", 2);
        map.put("Algorithms", 3);
        map.put("Data", 5);

        // System.out.println(map);

        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(10);
        // numbers.add(20);
        // numbers.add(30);

        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            // Integer number = iterator.next();
            System.out.println(iterator.next());
        }
    }
}
