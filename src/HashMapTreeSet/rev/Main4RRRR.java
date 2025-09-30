package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4RRRR {
    // 모든 아나그램 찾기
    public static int solution(String str, String s) {
        int answer = 0;
        Map<Character, Integer> maps = new HashMap<>();
        for(char x : s.toCharArray()) {
            maps.put(x, maps.getOrDefault(x , 0) + 1);
        }

        Map<Character, Integer> m = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            m.put(str.charAt(i), m.getOrDefault(str.charAt(i), 0 ) + 1);

            if(cnt == s.length()) {
                if(maps.equals(m)) {
                    answer++;
                }

                if(m.get(str.charAt(i-s.length() + 1)) > 1) {
                    m.put(str.charAt(i-s.length() + 1) , m.get(str.charAt(i-s.length() + 1)) -1);
                } else {
                    m.remove(str.charAt(i-s.length() + 1));
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
