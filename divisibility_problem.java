import java.util.ArrayList;
import java.util.Scanner;

public class divisibility_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();

        ArrayList<test_cases_data> cases = new ArrayList<>();

        for (int i = 0; i < test_cases; i++) {
            int input_Dividend = scanner.nextInt();
            int input_Divisor = scanner.nextInt();

            test_cases_data indivisual_case = new test_cases_data(input_Dividend, input_Divisor);

            cases.add(indivisual_case);
        }

        scanner.close();

        for (test_cases_data c : cases) {
            System.out.println(c.getAns());
        }
    }

    static class test_cases_data {
        int dividend;
        int divisor;

        test_cases_data(int _divident, int _divisor) {
            dividend = _divident;
            divisor = _divisor;
        }

        int getAns() {
            int reminder = dividend % divisor;
            return (reminder == 0) ? 0 : divisor - reminder;
        }

    }

}
