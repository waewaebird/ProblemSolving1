package zHackerRank._202506;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main_20250610_1 {
    // The Coin Change Problem
    public static BigDecimal solution(int n, int m, int[] arr) {
        BigDecimal dp[] = new BigDecimal[n+1]; //Can Coin Counts

        Arrays.sort(arr);
        Arrays.fill(dp, new BigDecimal(0));

        for(int x : arr) {
            if(x == 1) {
                Arrays.fill(dp, new BigDecimal(1));
                dp[0] = new BigDecimal(0);
                continue;
            } else {
                for (int i = x; i <= n; i++) {
                    if(i - x == 0) {
                        dp[i] = dp[i].add(new BigDecimal(1));
                    } else if(i - x > 0) {
                        if(dp[i-x].compareTo(new BigDecimal(1)) >= 0){
                            dp[i] = dp[i].add(dp[i-x]);
                        }
                    }
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
