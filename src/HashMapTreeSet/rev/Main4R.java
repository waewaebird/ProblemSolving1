package HashMapTreeSet.rev;

import java.util.*;

public class Main4R {
    // 모든 아나그램 찾기
    public static Integer solution(String S, String T) {
        int answer = 0;
        Map<Character, Integer> mapt = new HashMap<>();
        for(char x: T.toCharArray()) {
            mapt.put(x, mapt.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> maps = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            maps.put(S.charAt(i), maps.getOrDefault(S.charAt(i), + 0) + 1);

            if(i >= T.length() -1) {
                if(maps.equals(mapt)) {
                    answer++;
                }

                if(maps.get(S.charAt(i - (T.length() - 1))) > 1 ) {
                    maps.put(S.charAt(i - (T.length() - 1)), maps.get(S.charAt(i - (T.length() - 1))) -1);
                } else {
                    maps.remove(S.charAt(i - (T.length() - 1)));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.next();
        String T = in.next();

        System.out.println(solution(S,T));
    }
}
