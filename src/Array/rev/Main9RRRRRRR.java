package Array.rev;

import java.util.Scanner;

public class Main9RRRRRRR {
    // 격자판 최대합
    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;

        for (int i = 0; i < n; i++) {
            int ts1 = 0;
            int ts2 = 0;

            for (int j = 0; j < n; j++) {
                ts1 += arr[i][j];
                ts2 += arr[j][i];

                if(i == j) {
                    s3 += arr[i][j];
                }

                if(i + j == n-1) {
                   s4 += arr[i][j];
                }
            }

            s1 = Math.max(s1,ts1);
            s2 = Math.max(s2,ts2);
        }

        answer = Math.max(s1,s2);
        answer = Math.max(answer,s3);
        answer = Math.max(answer,s4);

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
