import java.util.Scanner;

public class again_twenty_five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if (n == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(5);
        } else {
            System.out.println(25);
        }

        scanner.close();
    }
}
