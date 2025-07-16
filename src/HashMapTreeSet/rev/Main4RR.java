package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main4RR {
    // 모든 아나그램 찾기
    public static Integer solution(String str1, String str2) {
        int answer = 0;

        Map<Character, Integer> map2 = new HashMap<>();
        for(char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> map1 = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(cnt == str2.length()) {
                if(map1.get(str1.charAt(i-str2.length())) > 1) {
                    map1.put(str1.charAt(i-str2.length()), map1.get(str1.charAt(i-str2.length())) -1);
                } else {
                    map1.remove(str1.charAt(i-str2.length()));
                }
                cnt--;
            }
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);

            if(map2.equals(map1)) {
                answer++;
            }
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        System.out.println(solution(str1,str2));
    }
}
