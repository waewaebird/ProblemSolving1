package zProgrammers;

import java.util.HashSet;
import java.util.Set;

class Solution_20251028_2 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Set<Character> sp = new HashSet<>();

        for(String s : spell) {
            sp.add(s.charAt(0));
        }

        for(String s : dic) {
            Set<Character> sets = new HashSet<>();
            for(char x : s.toCharArray()) {
                sets.add(x);
            }

            if(sp.equals(sets)) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251028_2 s = new Solution_20251028_2();
        System.out.println(s.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
    }
}