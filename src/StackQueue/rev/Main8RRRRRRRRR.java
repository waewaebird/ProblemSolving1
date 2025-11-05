package StackQueue.rev;

import java.util.*;

public class Main8RRRRRRRRR {
    // 응급실
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int v = arr[i];
            if(i == m) {
                v = v * -1;
            }
            pq.offer(Math.abs(v));
            queue.offer(v);
        }


        while(!queue.isEmpty()) {
            int pqNow = pq.peek();

            int queueNow = queue.poll();
            if(pqNow == queueNow || pqNow == queueNow * -1) {
                pq.poll();
                answer++;

                if(queueNow < 0) {
                    break;
                }
            } else {
                queue.offer(queueNow);
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
