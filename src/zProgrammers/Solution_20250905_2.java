package zProgrammers;

import java.math.BigDecimal;
import java.util.*;

class Solution_20250905_2 {
    // 숫자 짝꿍
    public String solution(String X, String Y) {
        String answer = "";

        Map<Integer, BigDecimal> am = new HashMap<>();
        Map<Integer, BigDecimal> bm = new HashMap<>();

        for (char x : X.toCharArray()) {
            am.put(Integer.parseInt(String.valueOf(x)), am.getOrDefault(Integer.parseInt(String.valueOf(x)), BigDecimal.ZERO).add(BigDecimal.ONE));
        }

        for (char x : Y.toCharArray()) {
            bm.put(Integer.parseInt(String.valueOf(x)), bm.getOrDefault(Integer.parseInt(String.valueOf(x)), BigDecimal.ZERO).add(BigDecimal.ONE));
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(Integer key : am.keySet()) {
            if(bm.get(key) != null) {
                BigDecimal len = BigDecimal.ZERO;

                int compareResult = am.get(key).compareTo(bm.get(key));

                if(compareResult < 0) {
                    len = am.get(key);
                } else {
                    len = bm.get(key);
                }
                BigDecimal cnt = BigDecimal.ZERO;
                while(cnt.compareTo(len) < 0) {
                    queue.offer(key);
                    cnt = cnt.add(BigDecimal.ONE);
                }
            }
        }

        StringBuilder sb = new StringBuilder("");

        if(queue.size() > 0) {
            while (!queue.isEmpty()) {
                sb.append(queue.poll());
            }
            answer = sb.toString();

            if(answer.length() > 1 && answer.charAt(0) == '0'){
                answer = "0";
            }

        } else {
            answer = "-1";
        }
        return answer;
    }

/*    public static void main(String[] args) {
        zProgrammers.Solution s = new zProgrammers.Solution();
        s.solution("100", "203045");
    }*/
}