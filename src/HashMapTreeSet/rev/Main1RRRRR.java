package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1RRRRR {
    public static Character solution(int n, String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Character answer = 0;
        int max = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                answer = entry.getKey();
                max = entry.getValue();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        System.out.println(solution(n, str));
    }
}
