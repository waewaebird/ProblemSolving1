package StackQueue.rev;

import java.util.*;

public class Main8RRRRRRRR {
    // 응급실
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if(i == m) {
                queue.offer(arr[i] * -1);
            } else {
                queue.offer(arr[i]);
            }
            pq.offer(arr[i]);
        }

        while(!queue.isEmpty()) {
            int now = queue.poll();

            if(now == pq.peek() || now*-1 == pq.peek()) {
                pq.poll();
                answer++;
                if(now < 0) {
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
