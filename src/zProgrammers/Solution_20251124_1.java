package zProgrammers;

import java.util.HashMap;
import java.util.Map;

class Solution_20251124_1 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();

        int n = name.length;
        for (int i = 0; i < n; i++) {
            map.put(name[i] , yearning[i]);
        }

        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                String temp = photo[i][j];

                if(map.get(temp) != null) {
                    sum += map.get(temp);
                }
            }

            answer[i] = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251124_1 s = new Solution_20251124_1();

        System.out.println(s.solution(new String[] {"may", "kein", "kain", "radi"}, new int[] {5, 10, 1, 3},new String[][] {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}}));
    }
}