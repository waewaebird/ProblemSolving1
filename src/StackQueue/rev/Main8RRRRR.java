package StackQueue.rev;

import java.util.*;

public class Main8RRRRR {
    // 응급실
    public static Integer solution(int n, int m, int[] arr){
        Deque<Integer> sample = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            if(i == m) {
                sample.offer(temp * -1);
            } else {
                sample.offer(temp);
            }
            pq.offer(temp);
        }

        int cnt = 0;
        while(!sample.isEmpty()) {
            int max = pq.peek();

            int now = sample.poll();
            if(max == now || max == now * -1) {
                pq.poll();
                cnt++;

                if(max == now * -1) {
                    break;
                }
            } else {
                sample.offer(now);
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
