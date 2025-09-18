package StackQueue.rev;

import java.util.*;

public class Main8RRRRRRR {
    // 응급실
    public static Integer solution(int n, int m, int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);

            if(i == m) {
                queue.offer(arr[i] * -1);
            } else {
                queue.offer(arr[i]);
            }
        }


        int cnt = 0;
        while(!queue.isEmpty()) {
            int now = queue.poll();

            if(now == pq.peek() || now * -1 == pq.peek()) {
                pq.poll();
                cnt++;

                if(now < 0) {
                    break;
                }
            } else {
                queue.offer(now);
            }
        }

        return cnt;
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
