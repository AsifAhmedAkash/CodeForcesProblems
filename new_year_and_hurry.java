import java.util.Scanner;

public class new_year_and_hurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int min_remaining = 240 - k;
        int solved = 0;
        for (int i = 1; i <= n; i++) {
            if (min_remaining >= 5 * i) {
                min_remaining -= 5 * i;
                solved++;
            } else {
                break;
            }
            // System.out.println(i);
        }

        System.out.println(solved);

        scanner.close();
    }
}
