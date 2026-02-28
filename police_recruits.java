import java.util.Scanner;

public class police_recruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number_of_criminals = 0;
        int number_of_police = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x == -1) {
                if (number_of_police > 0) {
                    number_of_police--;
                } else {
                    number_of_criminals++;
                }
            } else {
                number_of_police += x;
            }
        }

        System.out.println(number_of_criminals);
    }
}
