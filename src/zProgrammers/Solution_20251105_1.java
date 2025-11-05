package zProgrammers;

import java.util.*;

class Solution_20251105_1 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> big = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> small = new PriorityQueue<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(String x : operations) {
            String[] temp = x.split(" ");
            if(temp[0].equals("I")) {
                map.put(Integer.valueOf(temp[1]), map.getOrDefault(Integer.valueOf(temp[1]), 0) + 1);
                big.offer(Integer.valueOf(temp[1]));
                small.offer(Integer.valueOf(temp[1]));
            } else {
                //D
                int key = 0;
                if(temp[1].equals("1")) {
                   if(!big.isEmpty()) {
                        key = big.poll();
                   }
                   small.remove(key);
                } else {
                    if(!small.isEmpty()) {
                        key = small.poll();
                    }
                   big.remove(key);
                }

                if(map.get(key) != null) {
                    if(map.get(key) == 1) {
                        map.remove(key);
                    } else{
                        map.put(key, map.get(key) -1);
                    }
                }
            }
        }

        int[] answer = new int[2];
        if(map.size() > 0) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                max = Math.max(max, entry.getKey());
                min = Math.min(min, entry.getKey());
            }
            answer[0] = max;
            answer[1] = min;
        }

        return answer;
    }
}