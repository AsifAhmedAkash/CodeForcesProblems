import java.util.Scanner;

public class fox_and_snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] grid = new String[n];

        for (int i = 1; i <= n; i++) {
            grid[i - 1] = "";

            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    grid[i - 1] = grid[i - 1] + "#";
                }

            } else {
                if (i % 4 == 0) {
                    for (int j = 0; j < m; j++) {
                        if (j == 0) {

                            grid[i - 1] = grid[i - 1] + "#";
                        } else {
                            grid[i - 1] = grid[i - 1] + ".";
                        }
                    }
                } else {
                    for (int j = 0; j < m; j++) {
                        if (j == m - 1) {
                            grid[i - 1] = grid[i - 1] + "#";
                        } else {
                            grid[i - 1] = grid[i - 1] + ".";
                        }
                    }
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.println(grid[i]);
        }
        scanner.close();
    }
}
