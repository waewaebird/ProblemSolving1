package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250522_1 {
    // Minimum Distances
    public static int solution(int n, int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    min = Math.min(min, Math.abs(j - i));
                }
            }
        }

        if(min == Integer.MAX_VALUE) {
            min = -1;
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
