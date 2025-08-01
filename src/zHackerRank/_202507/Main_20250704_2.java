package zHackerRank._202507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250704_2 {
    // Knapsack
    public static Integer solution(int n, int k, int[] arr) {
        int[] dp = new int[k+1];

        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= k ; j++) {
                if(j == arr[i]) {
                    dp[j] = 1;
                } else {
                    if(dp[j-arr[i]] > 0) {
                        dp[j] = dp[j-arr[i]] + 1;
                    }
                }
            }
        }

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i <= k; i++) {
            if(dp[i] > 0) {
                answer = Math.max(i, answer);
            }
        }

        if(answer == Integer.MIN_VALUE) {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            Integer result = solution(n,k,arr);
            answers.add(result);
        }

        for(int x : answers) {
            System.out.println(x);
        }
    }
}
