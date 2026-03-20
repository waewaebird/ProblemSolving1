package zProgrammers;

import java.util.Arrays;

class Solution_20260320_3 {
    public int solution(int n, int[] money) {
        //Arrays.sort(money);

        int answer = 0;

        int[] dp = new int[n+1];


        for (int i = 0; i < money.length; i++) {
            for (int j = money[i]; j <= n ; j++) {
                if(dp[j - money[i]] > 0) {
                    dp[j] = dp[j-money[i]] + dp[j];
                }
            }

            for (int j = money[i]; j <= n; j = j + money[i]) {
                dp[j]++;
            }

        }

        answer = dp[n];

        return answer %  1000000007;
    }

    public static void main(String[] args) {
        Solution_20260320_3 s = new Solution_20260320_3();

        System.out.println(s.solution(8, new int[] {2,5})); // 3
    }
}
