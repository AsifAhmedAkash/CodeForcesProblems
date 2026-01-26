import java.util.Scanner;

public class anton_and_danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String text = sc.next();

        int anton = 0;
        int danik = 0;
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);

            if (ch == 'A') {
                anton++;

            } else if (ch == 'D') {
                danik++;
            }
        }
        if (anton > danik) {
            System.out.println("Anton");
        } else if (danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        sc.close();
    }
}
