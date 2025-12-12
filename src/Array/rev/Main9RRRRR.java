package Array.rev;

import java.util.Scanner;

public class Main9RRRRR {
    // 격자판 최대합
    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;

        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];

                if(i == j) {
                    s3 += arr[i][j];
                } else if(i + j == n-1) {
                    s4 += arr[i][j];
                }
            }

            s1 = Math.max(s1, sum1);
            s2 = Math.max(s2, sum2);
        }

        int t1 = Math.max(s1,s2);
        int t2 = Math.max(s3,s4);

        answer = Math.max(t1,t2);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n,arr));
    }
}
