import java.util.Arrays;
import java.util.Scanner;

public class twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCoins = sc.nextInt();

        int[] coinsWithValue = new int[numberOfCoins];
        int sumOfCoins = 0;
        for (int i = 0; i < numberOfCoins; i++) {
            coinsWithValue[i] = sc.nextInt();
            sumOfCoins += coinsWithValue[i];
        }
        Arrays.sort(coinsWithValue);
        // for (int i = 0; i < numberOfCoins; i++) {
        // System.err.println(coinsWithValue[i]);
        // }

        int numOfCoins = 0;
        int currentCoinValue = 0;
        int i = numberOfCoins - 1;
        while (currentCoinValue <= sumOfCoins / 2) {
            currentCoinValue += coinsWithValue[i];
            numOfCoins++;
            i--;

            if (i < 0) {
                break;
            }

            System.out.println("num of coins " + numOfCoins);
            System.out.println("value " + currentCoinValue);
            System.out.println("id" + i);

            System.out.println("-----");
        }

        System.out.println(numOfCoins);

        sc.close();
    }
}
