package StackQueue.rev;

import java.util.*;

public class Main8RRR {
    // 응급실
    public static int solution(int n, int m, int[] arr) {
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if(i == m) {
                queue.offer(arr[i] * -1);
            } else {
                queue.offer(arr[i]);
            }
            pq.offer(arr[i]);
        }

        boolean flag = false;
        int answer = 0;
        while(!queue.isEmpty()) {
            if(flag) {
                break;
            }
            int max = pq.poll();

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int temp = queue.poll();

                if(max == temp || max == Math.abs(temp)) {
                    answer++;

                    if(temp < 0) {
                        flag = true;
                    }

                    break;
                } else {
                    queue.offer(temp);
                }
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
