package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1R {
    public static String solution(int n,String s) {
        Map<String, Integer> map = new HashMap<>();

        for(char x : s.toCharArray()) {
            map.put(Character.toString(x), map.getOrDefault(Character.toString(x), 0) + 1);
        }

        String answer = "";
        int cnt = 0;

        for (String key : map.keySet()) {
            if(map.get(key) > cnt) {
                answer = key;
                cnt = map.get(key);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(solution(n,s));
    }
}
