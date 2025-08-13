package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4RRR {
    // 모든 아나그램 찾기
    public static Integer solution(String str, String s) {
        int answer = 0;

        Map<Character, Integer> ss = new HashMap<>();
        for(char x : s.toCharArray()) {
            ss.put(x, ss.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> sm = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            sm.put(str.charAt(i), sm.getOrDefault(str.charAt(i), 0) + 1);

            if(cnt == s.length()) {
                if(sm.equals(ss)) {
                    answer++;
                }

                if(sm.get(str.charAt(i - s.length() + 1)) > 1) {
                    sm.put(str.charAt(i - s.length() + 1), sm.get(str.charAt(i - s.length() + 1)) - 1);
                } else {
                    sm.remove(str.charAt(i - s.length() + 1));
                }
                cnt--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String s = in.next();

        System.out.println(solution(str,s));
    }
}
