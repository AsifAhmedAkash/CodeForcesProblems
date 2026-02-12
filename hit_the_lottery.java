import java.util.Scanner;

public class hit_the_lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int no_of_bills = 0;
        int money_remaining = money;

        while (money_remaining > 0) {
            if (money_remaining < 5) {
                no_of_bills += money_remaining;

                break;
            } else if (money_remaining < 10) {
                no_of_bills += money_remaining / 5;
                money_remaining = money_remaining % 5;

            } else if (money_remaining < 20) {
                no_of_bills += money_remaining / 10;
                money_remaining = money_remaining % 10;

            } else if (money_remaining < 100) {
                no_of_bills += money_remaining / 20;
                money_remaining = money_remaining % 20;

            } else {
                no_of_bills += money_remaining / 100;
                money_remaining = money_remaining % 100;

            }
        }
        sc.close();

        System.out.println(no_of_bills);

    }
}