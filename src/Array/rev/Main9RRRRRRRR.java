package Array.rev;

import java.util.Scanner;

public class Main9RRRRRRRR {
    // 격자판 최대합
    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 0; i < n; i++) {
            int sum11 = 0;
            int sum22 = 0;

            for (int j = 0; j < n; j++) {
                if(i == j) {
                    sum3 += arr[i][j];
                }

                if(i+j == n) {
                    sum4 += arr[i][j];
                }

                sum11 += arr[i][j];
                sum22 += arr[j][i];

            }

            sum1 = Math.max(sum1, sum11);
            sum2 = Math.max(sum2, sum22);
        }


        answer = Math.max(sum1, sum2);
        answer = Math.max(answer, sum3);
        answer = Math.max(answer, sum4);

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
