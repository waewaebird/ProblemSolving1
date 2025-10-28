package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRR {
    // 최대점수 구하기(냅색 알고리즘)
    // N이 작은편이라면 DFS, 크면 DP
    // M이 지나치게 크면 DP는 힘듬
    public static int solution(int n, int m, List<int[]> list) {
        int answer = 0;

        int[] dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= list.get(i)[1]; j--) {
                dp[j] = Math.max(dp[j], list.get(i)[0] + dp[j-list.get(i)[1]]);
            }
        }

        Arrays.sort(dp);

        return dp[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new int[] {a,b});
        }

        System.out.println(solution(n,m,list));
    }
}
