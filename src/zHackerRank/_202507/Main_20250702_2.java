package zHackerRank._202507;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250702_2 {
    // Find the Median
    public static int solution(int n, int[] arr) {
        Arrays.sort(arr);

        return arr[n/2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
