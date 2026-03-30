import java.util.Scanner;

public class sereja_and_dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int firstIndex = 0;
        int lastIndex = n - 1;
        int Sereja_points = 0;
        int Dima_points = 0;
        boolean isSerejasTurn = true;

        for (int i = 0; i < n; i++) {
            int new_subtracted_index = check_bigger_num(cards, firstIndex, lastIndex);
            if (firstIndex == new_subtracted_index) {
                firstIndex++;
            } else {
                lastIndex--;
            }
            if (isSerejasTurn) {
                Sereja_points += cards[new_subtracted_index];
                isSerejasTurn = false;
            } else {
                Dima_points += cards[new_subtracted_index];
                isSerejasTurn = true;
            }

        }

        System.out.println(Sereja_points + " " + Dima_points);

        sc.close();
    }

    // returns index num
    public static int check_bigger_num(int[] cards, int firstindex, int lastindex) {
        if (cards[firstindex] > cards[lastindex]) {
            return firstindex;
        } else {
            return lastindex;
        }
        // return 0;
    }
}
