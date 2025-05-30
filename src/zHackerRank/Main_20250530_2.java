package zHackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250530_2 {
    // Minimum Absolute Difference in an Array
    public static int solution(int n, int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            min = Math.min(min, Math.abs(arr[i-1] - arr[i]));
        }
        return min;
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
