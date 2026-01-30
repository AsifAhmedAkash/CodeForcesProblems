import java.util.Scanner;

public class queue_at_the_school {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String s = scanner.next();

        for (int time = 0; time < t; time++) {
            StringBuilder newS = new StringBuilder(s);
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B' && i + 1 < n && s.charAt(i + 1) == 'G') {
                    newS.setCharAt(i, 'G');
                    newS.setCharAt(i + 1, 'B');
                    i++; // Skip the next position as it's already processed
                }
            }
            s = newS.toString();
        }

        System.out.println(s);

        scanner.close();
    }
}
