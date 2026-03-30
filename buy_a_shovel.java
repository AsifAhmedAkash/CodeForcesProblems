import java.util.Scanner;

public class buy_a_shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int i = 1;

        for (i = 1; i <= 10; i++) {
            if ((k * i) % 10 == 0 || (k * i - r) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(i);
        sc.close();
    }
}
