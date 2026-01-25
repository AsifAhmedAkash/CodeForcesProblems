import java.util.Scanner;

public class helpful_maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // reads from keyboard

        String input = sc.nextLine();

        // System.out.println(input);

        String[] numbers = input.split("\\+");

        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(numbers[i]);
        // }

        int[] nums = new int[numbers.length];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
            if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 2) {
                count2++;
            } else if (nums[i] == 3) {
                count3++;
            }
        }

        String result = "";
        for (int i = 0; i < count1; i++) {
            result += "1+";
        }
        for (int i = 0; i < count2; i++) {
            result += "2+";
        }
        for (int i = 0; i < count3; i++) {
            result += "3+";
        }

        System.out.println(result.substring(0, result.length() - 1));

        sc.close();

    }
}
