import java.util.Scanner;

public class the_new_year_meeting_frnds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(arr); // sort the positions
        int meetingPoint = arr[1]; // median
        int distance = Math.abs(meetingPoint - arr[0])
                + Math.abs(meetingPoint - arr[1])
                + Math.abs(meetingPoint - arr[2]);

        System.out.println(distance);
    }

}
