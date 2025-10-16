package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4RRRRR {
    // 모든 아나그램 찾기
    public static int solution(String str, String s) {
        int answer = 0;

        Map<Character, Integer> smap = new HashMap<>();
        for (char x : s.toCharArray()) {
            smap.put(x, smap.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> strmap = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            strmap.put(str.charAt(i) , strmap.getOrDefault(str.charAt(i), 0) + 1);

            if(cnt == s.length()) {
                if(smap.equals(strmap)) {
                    answer++;
                }

                if(strmap.get(str.charAt(i-s.length() + 1)) > 1) {
                    strmap.put(str.charAt(i-s.length() + 1), strmap.get(str.charAt(i-s.length() + 1)) - 1);
                } else {
                    strmap.remove(str.charAt(i-s.length() + 1));
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
