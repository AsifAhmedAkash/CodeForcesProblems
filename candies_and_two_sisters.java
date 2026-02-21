import java.util.Scanner;

public class candies_and_two_sisters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int candies = scanner.nextInt();

            if (candies % 2 == 0) {
                System.out.println((candies / 2) - 1);
            } else {
                System.out.println((candies - 1) / 2);
            }
        }
        scanner.close();
    }
}
