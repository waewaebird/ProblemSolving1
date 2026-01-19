package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1RRRRRRRRR {
    // 학급 회장(해쉬)
    public static String solution(int n, String str) {
        Map<Character, Integer> map = new HashMap<>();

        int max = 0;
        String answer = "";
        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if(map.get(x) > max) {
                answer = String.valueOf(x);
                max = map.get(x);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        System.out.println(solution(n,str));
    }
}
