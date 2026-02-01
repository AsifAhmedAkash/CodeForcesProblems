import java.util.Scanner;

public class chat_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String target = "hello";
        int j = 0;
        // char currentCharTarget = s.charAt(j);

        // // System.out.print(s);
        // if (s.length() < 5) {
        // System.out.print("NO");
        // } else {
        // for (char c : s.toCharArray()) {
        // if (currentCharTarget == c) {
        // if (j == s.toCharArray().length) {
        // System.out.print("YES");
        // break;
        // } else {
        // j++;
        // }

        // currentCharTarget = s.charAt(j);

        // }

        // }
        // System.out.print("NO");
        // }

        for (int i = 0; i < s.length(); i++) {
            if (j < target.length() && s.charAt(i) == target.charAt(j)) {
                j++; // move to next character in "hello"
            }
        }

        if (j == target.length()) {
            System.out.println("YES"); // "hello" found as subsequence
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
