package zHackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250708_1 {
    // Closest Numbers
    public static void solution(int n, int[] arr) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i] - arr[i-1]);
        }

        for (int i = 1; i < n; i++) {
            if(arr[i] - arr[i-1] == min) {
                System.out.print(arr[i-1] + " " + arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        solution(n,arr);
    }
}
