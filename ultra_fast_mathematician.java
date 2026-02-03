import java.util.Scanner;

public class ultra_fast_mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.next();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == num2.charAt(i)) {
                output.append("0");
            } else {
                output.append("1");
            }
        }

        System.out.println(output);
        sc.close();
    }
}
