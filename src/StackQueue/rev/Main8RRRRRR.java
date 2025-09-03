package StackQueue.rev;

import java.util.*;

public class Main8RRRRRR {
    // 응급실
    public static Integer solution(int n, int m, int[] arr) {
        int answer = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if(i == m) {
                num = arr[i] * -1;
            }
            queue.offer(num);
            pq.offer(arr[i]);
        }

        int cnt = 0;
        while(!queue.isEmpty()) {
            int first = pq.peek();
            int polls = queue.poll();
            if(first == polls || first == Math.abs(polls)) {
                cnt++;
                if(polls < 0) {
                    answer = cnt;
                    break;
                }
                pq.poll();
            } else {
                queue.offer(polls);
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
