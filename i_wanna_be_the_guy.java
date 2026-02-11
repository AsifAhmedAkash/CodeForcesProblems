import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class i_wanna_be_the_guy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_levels = sc.nextInt();

        boolean[] level_result = new boolean[num_of_levels];

        int levels_only_p_can_pass = sc.nextInt();
        for (int i = 0; i < levels_only_p_can_pass; i++) {
            int level_to_check = sc.nextInt();
            level_result[level_to_check - 1] = true;
        }

        int levels_only_q_can_pass = sc.nextInt();
        for (int i = 0; i < levels_only_q_can_pass; i++) {
            int level_to_check = sc.nextInt();
            level_result[level_to_check - 1] = true;

        }

        for (int i = 0; i < num_of_levels; i++) {
            if (level_result[i] == false) {
                System.out.println("Oh, my keyboard!");
                break;
            } else if (i == num_of_levels - 1) {
                System.out.println("I become the guy.");
            }
        }

        sc.close();
    }
}
