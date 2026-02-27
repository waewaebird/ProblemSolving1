package StackQueue.rev;

import java.util.*;

public class Main8RRRRRRRRRRR {
    // 응급실
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if(i == m) {
                queue.offer(arr[i] * -1);
            } else {
                queue.offer(arr[i]);
            }
            pq.offer(arr[i]);
        }

        int cnt = 0;
        while(!queue.isEmpty()) {
            int now = queue.poll();

            if(now == pq.peek() || now * -1 == pq.peek()) {
                int pqNow = pq.poll();
                cnt++;

                if(now < 0) {
                    answer = cnt;
                    break;
                }

            } else {
                queue.offer(now);
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

