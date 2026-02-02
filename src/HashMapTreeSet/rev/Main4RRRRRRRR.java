package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4RRRRRRRR {
    // 모든 아나그램 찾기
    public static int solution(String str, String s) {
        int answer = 0;
        Map<Character, Integer> m = new HashMap<>();
        for(char x : s.toCharArray()) {
            m.put(x, m.getOrDefault(x, 0 ) + 1);
        }

        Map<Character, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0 ) + 1);
            index++;

            if(index == s.length()) {
                if(m.equals(map)) {
                    answer++;
                }
                if(map.get(str.charAt(i-s.length() + 1)) > 1) {
                    map.put(str.charAt(i-s.length() + 1), map.get(str.charAt(i-s.length() + 1)) - 1);
                } else {
                    map.remove(str.charAt(i-s.length() + 1));
                }
                index--;
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
