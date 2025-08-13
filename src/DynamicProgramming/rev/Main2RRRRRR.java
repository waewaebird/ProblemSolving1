package DynamicProgramming.rev;

import java.util.Scanner;

public class Main2RRRRRR {
    // 돌다리 건너기
    public static Integer solution(int n) {
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
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
