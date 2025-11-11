package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4RRRRRR {
    public static int solution(String str, String s) {
        // 모든 아나그램 찾기
        Map<Character, Integer> M = new HashMap<>();
        for(char x : s.toCharArray()) {
            M.put(x, M.getOrDefault(x, 0) + 1);
        }

        int answer = 0;
        Map<Character, Integer> maps = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            maps.put(str.charAt(i), maps.getOrDefault(str.charAt(i),0) + 1);

            if(cnt == s.length()) {
                if(maps.equals(M)) {
                    answer++;
                }

                Character key = str.charAt(i - s.length() + 1);
                if(maps.get(key) == 1) {
                    maps.remove(key);
                } else {
                    maps.put(key, maps.get(key) - 1);
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
