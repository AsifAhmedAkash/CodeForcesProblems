// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class regestration_system {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         String[] names = new String[n];
//         String[] output = new String[n];

//         int increament = 0;

//         List<Integer> ok_list_int = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             names[i] = sc.next();

//         }

//         String temp = new String();

//         for (int i = 0; i < n; i++) {
//             // System.out.println("working on" + names[i]);
//             temp = names[i];
//             for (int j = 0; j < i; j++) {

//                 if (temp.equals(output[j])) {
//                     temp = names[i];
//                     increament++;
//                     temp = names[i] + increament;

//                 }

//             }

//             if (increament != 0) {
//                 output[i] = temp;
//                 increament = 0;
//             } else {
//                 output[i] = temp;
//                 ok_list_int.add(i);
//             }

//         }

//         for (int i = 0; i < ok_list_int.size(); i++) {
//             output[ok_list_int.get(i)] = "OK";
//         }

//         for (int i = 0; i < n; i++) {

//             System.out.println(output[i]);
//         }

//         sc.close();

//     }

// }

import java.util.HashMap;
import java.util.Scanner;

public class regestration_system{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String name = sc.next();

            if (map.containsKey(name)) {
                int count = map.get(name);
                System.out.println(name + count);
                map.put(name, count + 1);
            } else {
                System.out.println("OK");
                map.put(name, 1);
            }
        }

        sc.close();
    }
}
