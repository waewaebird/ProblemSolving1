package DynamicProgramming.rev;

import java.util.Scanner;

public class Main1RRRRRRR {
    // 계단오르기
    public static Integer solution(int n) {
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;

        for (int i = 5; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
