package zHackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250610_2 {
    // Game of Stones
    static int[] move = {2,3,5};

    // 7 8 14 15 21 22
    public static int[] soulution(int max) {
        int[] dp = new int[max+1];

        Arrays.fill(dp, 1);
        for (int i = 1; i <= max ; i++) {
            if(i == 1) {
                dp[i] = 2;
            } else if(i == 7 || i == 8) {
                dp[i] = 2;
            } else {
                if(i > 7 && dp[i - 7] == 2) {
                    dp[i] = 2;
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            max = Math.max(max, arr[i]);
        }

        int dp[] = soulution(max);

        for(int x : arr) {
            if(dp[x] == 1) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
