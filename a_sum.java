import java.util.Scanner;

public class a_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (highestValue(a, b, c) == a) {
                if (b + c == a) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (highestValue(a, b, c) == b) {
                if (a + c == b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (a + b == c) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

    public static int highestValue(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
