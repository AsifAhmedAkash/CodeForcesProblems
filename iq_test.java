import java.util.Scanner;

public class iq_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        int evenIndex = -1;
        int oddIndex = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
                evenIndex = i + 1; // Store 1-based index
            } else {
                oddCount++;
                oddIndex = i + 1; // Store 1-based index
            }
        }

        if (evenCount == 1) {
            System.out.println(evenIndex);
        } else {
            System.out.println(oddIndex);
        }
    }
}
