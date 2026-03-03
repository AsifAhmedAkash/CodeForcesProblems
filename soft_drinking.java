import java.util.Scanner;

public class soft_drinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int total_frnds = k * l;
        int toasts = (int) Math.floor((double) total_frnds / nl);
        int limes = c * d;
        int salt = (int) Math.floor((double) p / np);

        System.out.println(min(toasts, limes, salt) / n);

    }

    public static int min(int _toasts, int _limes, int _salt) {
        if (_toasts < _limes) {
            if (_toasts < _salt) {
                return _toasts;
            } else {
                return _salt;
            }
        } else {
            if (_limes < _salt) {
                return _limes;
            } else {
                return _salt;
            }
        }
    }
}
