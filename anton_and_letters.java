import java.util.Scanner;

public class anton_and_letters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        boolean[] lettersPresent = new boolean[26];

        // System.out.println(line);
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != '{' && line.charAt(i) != '}' && line.charAt(i) != ',' && line.charAt(i) != ' ') {
                lettersPresent[line.charAt(i) - 'a'] = true;
            }
        }

        int num_of_distinct_let = 0;

        for (int i = 0; i < lettersPresent.length; i++) {
            if (lettersPresent[i] == true) {
                num_of_distinct_let++;
            }
        }

        System.out.println(num_of_distinct_let);

        scanner.close();

    }
}