package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4RRRRRRR {
    // 모든 아나그램 찾기
    public static int solution(String str, String s) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> maps = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            cnt++;

            char key = str.charAt(i);
            maps.put(key, maps.getOrDefault(key , 0) + 1);

            if(cnt == s.length()) {
                cnt--;

                if(maps.equals(map)) {
                    answer++;
                }

                if(maps.get(str.charAt(i-s.length()+1)) > 1) {
                    maps.put(str.charAt(i-s.length()+1), maps.get(str.charAt(i-s.length()+1)) -1);
                } else {
                    maps.remove(str.charAt(i-s.length()+1));
                }
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
