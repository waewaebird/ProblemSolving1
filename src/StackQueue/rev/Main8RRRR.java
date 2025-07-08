package StackQueue.rev;

import java.util.*;

public class Main8RRRR {
    // 응급실
    public static Integer solution(int n, int m, int[] arr) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer> queue = new ArrayDeque<>();

        int number = 0;
        for (int i = 0; i < n; i++) {
            if(i == m) {
                queue.offer(arr[i] * -1);
                number = arr[i];
            } else {
                queue.offer(arr[i]);
            }
            pq.offer(arr[i]);
        }

        int answer = 0;
        while(!queue.isEmpty()) {
            int max = pq.peek();
            int now = queue.poll();

            if(max == now || max == now * -1) {
                pq.poll();
                answer++;

                if(now * -1 == number) {
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
