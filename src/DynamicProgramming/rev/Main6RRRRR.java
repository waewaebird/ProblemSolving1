package DynamicProgramming.rev;

import java.util.Scanner;

public class Main6RRRRR {
    // 최대점수 구하기(냅색 알고리즘)
    static class Test {
        int point;
        int time;

        public Test(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }

    public static Integer solution(int n, int m, Test[] arr) {
        int[] dp = new int[m+1];

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= arr[i].time; j--) {
                dp[j] = Math.max(dp[j], dp[j-arr[i].time] + arr[i].point);
            }
        }

        return dp[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Test[] arr = new Test[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[i] = new Test(a,b);
        }

        System.out.println(solution(n,m,arr));
    }
}
