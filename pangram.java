import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_char = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        String str = sc.nextLine();
        sc.close();

        boolean[] charList = new boolean[26];

        if (num_of_char < 26) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < str.length(); i++) {
                char c = Character.toLowerCase(str.charAt(i));
                if (c >= 'a' && c <= 'z') {
                    charList[c - 'a'] = true;
                }
            }

            boolean isPangram = true;
            for (int i = 0; i < 26; i++) {
                if (!charList[i]) {
                    isPangram = false;
                    break;
                }
            }

            System.out.println(isPangram ? "YES" : "NO");
        }
    }
}
