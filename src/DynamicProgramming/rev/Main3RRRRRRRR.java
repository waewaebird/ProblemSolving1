package DynamicProgramming.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main3RRRRRRRR {
    // 최대 부분 증가수열
    public static Integer solution(int n, int[] arr) {
        Integer answer = 0;

        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for (int i = 1; i < n ; i++) {
            for (int j = i; j >= 0; j--) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(dp[i], answer);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
