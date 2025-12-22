package StackQueue.rev;

import java.util.*;

public class Main8RRRRRRRRRR {
    // 응급실
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;

        Queue<Integer> queue = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);

            if(i == m) {
                queue.offer(arr[i] *-1);
            } else {
                queue.offer(arr[i]);
            }
        }

        int cnt = 1;
        while(!pq.isEmpty()) {
            int now = pq.poll();

            while(true) {
                int qn = queue.poll();

                if(now == qn || now == qn*-1) {
                    if(now == qn*-1) {
                        answer = cnt;
                    }
                    break;
                } else {
                    queue.offer(qn);
                }
            }

            cnt++;

            if(answer > 0) {
                break;
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
