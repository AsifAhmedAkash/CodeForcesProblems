import java.util.Scanner;

public class i_love_username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int point = 0;
        int lowestNum = 0;
        int highestNum = 0;
        for (int i = 0; i < n; i++) {
            int new_num = scanner.nextInt();
            if (i == 0) {
                lowestNum = new_num;
                highestNum = new_num;
                point = 0;
            }

            if (new_num > highestNum) {
                highestNum = new_num;
                point++;
            } else if (new_num < lowestNum) {
                lowestNum = new_num;
                point++;
            }

        }

        System.out.println(point);
        scanner.close();
    }
}
