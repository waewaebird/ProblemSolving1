package zProgrammers._202601;

import java.util.PriorityQueue;

class Solution_20260115_2 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int x : scoville) {
            pq.offer((long) x);
        }

        int level = 0;
        while(!pq.isEmpty()) {
            long now = pq.poll();
            if(now >= K) {
                break;
            }

            if(pq.size() == 0) {
                level = -1;
                break;
            }
            pq.offer(now + (pq.poll()*2));
            level++;
        }

        answer = level;
        return answer;
    }
}