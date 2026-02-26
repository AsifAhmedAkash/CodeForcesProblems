import java.util.Scanner;

public class b_taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        int[] groupSizes = new int[t];

        for (int i = 0; i < t; i++) {
            groupSizes[i] = scanner.nextInt();

        }

        int[] sortedGroupSizes = getNumsOfGroups(groupSizes);

        int taxiCount = 0;

        if (sortedGroupSizes[3] > 0) {
            taxiCount += sortedGroupSizes[3];
        }
        if (sortedGroupSizes[2] > 0) {
            taxiCount += sortedGroupSizes[2];
            sortedGroupSizes[0] -= sortedGroupSizes[2];
        }

        taxiCount += sortedGroupSizes[1] / 2;
        if (sortedGroupSizes[1] % 2 == 1) {
            taxiCount += 1;
            sortedGroupSizes[0] -= Math.min(2, sortedGroupSizes[0]);
        }

        if (sortedGroupSizes[0] > 0) {
            taxiCount += (sortedGroupSizes[0] + 3) / 4;
        }

        System.out.println(taxiCount);

    }

    public static int[] getNumsOfGroups(int[] arr) {
        int[] temp = new int[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp[0]++;
            } else if (arr[i] == 2) {
                temp[1]++;
            } else if (arr[i] == 3) {
                temp[2]++;
            } else if (arr[i] == 4) {
                temp[3]++;
            }
        }

        return temp; // return the sorted array
    }

}
