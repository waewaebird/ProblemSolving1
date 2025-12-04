package DynamicProgramming.rev;

import java.util.Scanner;

public class Main1RRRRRRRRRRRR {
    // 계단오르기
    public static int solution(int n) {
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
