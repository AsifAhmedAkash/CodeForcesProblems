import java.util.Scanner;

public class beautiful_year {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        while (true) {
            year++;
            String yearStr = Integer.toString(year);
            if (yearStr.charAt(0) != yearStr.charAt(1) &&
                    yearStr.charAt(0) != yearStr.charAt(2) &&
                    yearStr.charAt(0) != yearStr.charAt(3) &&
                    yearStr.charAt(1) != yearStr.charAt(2) &&
                    yearStr.charAt(1) != yearStr.charAt(3) &&
                    yearStr.charAt(2) != yearStr.charAt(3)) {
                System.out.println(year);
                break;
            }
        }
    }

}
