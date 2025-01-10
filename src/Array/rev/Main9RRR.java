package Array.rev;

import java.util.*;

public class Main9RRR {
    public static int solution(int n, int[][] arr) {
        List<Integer> answers = new ArrayList<>();
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
                if(i == j) {
                    sum3 += arr[i][j];
                }

                if(j == n - i - 1) {
                    sum4 += arr[i][j];
                }
            }
            answers.add(sum1);
            answers.add(sum2);
        }
        answers.add(sum3);
        answers.add(sum4);


        return Collections.max(answers);
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
        System.out.println(solution(n, arr));
    }
}
