package zProgrammers._202512;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution_20251230_1 {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);

            if(i == location) {
                queue.offer(priorities[i] * -1);
            } else {
                queue.offer(priorities[i]);
            }
        }

        int answer = 0;

        int level = 0;
        while(!queue.isEmpty()) {
            if(answer > 0) {
                break;
            }

            int now = queue.poll();

            int peek = pq.peek();
            if(peek == now || peek == now * -1) {
                level++;

                if(now < 0) {
                    answer = level;
                }
                pq.poll();
            } else {
                queue.offer(now);
            }
        }

        return answer;
    }
}