import java.util.Scanner;

public class insomnia_cure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] torcers = new int[4]; // array of size 4
        int suffered_drags = 0;

        for (int i = 0; i < 4; i++) {
            torcers[i] = sc.nextInt(); // read each integer
        }

        int d = sc.nextInt();

        for (int i = 1; i <= d; i++) {
            for (int j = 0; j < torcers.length; j++) {
                if (i % torcers[j] == 0) {
                    suffered_drags++;
                    break;
                }
            }
        }

        System.out.println(suffered_drags);
        sc.close();
    }
}
