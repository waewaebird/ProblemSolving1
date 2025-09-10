package Array.rev;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main9RRRR {
    // 격자판 최대합
    public static Integer solution(int n, int[][] arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    sum3 += arr[i][j];
                }


                if(i + j == n-1) {
                    sum4 += arr[i][j];
                }
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            pq.offer(sum1);
            pq.offer(sum2);
        }

        pq.offer(sum4);
        pq.offer(sum3);


        answer = pq.poll();
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
