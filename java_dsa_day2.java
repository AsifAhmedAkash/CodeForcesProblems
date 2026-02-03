import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class java_dsa_day2 {
    public static void main(String[] args) {
        // ArrayList<Integer> carvalue = new ArrayList<Integer>();

        // carvalue.add(10);
        // carvalue.add(12);
        // carvalue.add(20);

        // for (int i : carvalue) {
        // System.out.println(i);
        // }
        // array list

        LinkedList<String> cars = new LinkedList<String>();

        var cars1 = new LinkedList<String>();

        HashSet<String> cars2 = new HashSet<String>();
        cars2.add("volvo");
        cars2.add("volvo");

        System.out.println(cars2);
        if (cars2.contains("volvo")) {
            System.out.println("yes");
        }
    }
}
