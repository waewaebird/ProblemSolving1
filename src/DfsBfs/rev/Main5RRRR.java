package DfsBfs.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main5RRRR {

    public static Integer soltuion(int n, int[] arr, int m) {
        int[] dp = new int[m+1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                dp[j] = Math.min(dp[j], dp[j- arr[i]] + 1);
            }
        }

        return dp[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        System.out.println(soltuion(n,arr,m));
    }
}
