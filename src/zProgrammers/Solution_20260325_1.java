package zProgrammers;

import java.util.*;

class Solution_20260325_1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int index = 0;
        for(int x : score) {
            if(pq.size() < k) {
                pq.offer(x);
                answer[index] = pq.peek();
            } else {
                if(x > pq.peek()) {
                    pq.offer(x);
                    while(pq.size() > k) {
                        answer[index] = pq.poll();
                    }
                    answer[index] = pq.peek();
                } else {
                    answer[index] = pq.peek();
                }
            }
            index++;
        }

        return answer;
    }
}