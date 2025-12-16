package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRRRRR {
    // 최대점수 구하기(냅색 알고리즘)
    static class Test {
        int point;
        int time;

        public Test(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }

    public static int solution(int n, int m, List<Test> list) {
        int[] dp = new int[m+1];

        // 0 1 2 3 4 5  6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= list.get(i).time ; j--) {
                dp[j] = Math.max(dp[j], list.get(i).point + dp[j - list.get(i).time]);
            }
        }

        Arrays.sort(dp);

        return dp[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<Test> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Test(a,b));
        }

        System.out.println(solution(n,m,list));
    }
}
