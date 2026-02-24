import java.util.Scanner;

public class sum_of_round_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();
            int temp = n;
            int place = 1;
            int count = 0;
            int[] parts = new int[10]; // store round numbers

            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0) {
                    parts[count++] = digit * place;
                }
                temp /= 10;
                place *= 10;
            }

            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.print(parts[i] + " ");
            }
            System.out.println();
        }
    }
}
