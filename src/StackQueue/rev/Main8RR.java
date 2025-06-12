package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main8RR {
    // 응급실
    public static int solution(int n, int m, int[] arr) {
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if(i == m) {
                queue.offer(arr[i] * -1);
            } else {
                queue.offer(arr[i]);
            }

        }

        int answer = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < len; i++) {
                int temp = queue.poll();
                max = Math.max(Math.abs(temp), max);
                queue.offer(temp);
            }

            int current = queue.poll();

            if(current == max || Math.abs(current) == max) {
                answer++;

                if(current < 0) {
                    break;
                }

            } else {
                queue.offer(current);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }
}
