package zProgrammers;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution_20250930_3 {
    public long solution(long n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char x : String.valueOf(n).toCharArray()) {
            String xx = String.valueOf(x);
            pq.offer(Integer.valueOf(xx));
        }
        String temp = "";
        while(!pq.isEmpty()) {
            temp += pq.poll();
        }
        return Long.valueOf(temp);
    }
}