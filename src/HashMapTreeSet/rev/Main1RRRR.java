package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1RRRR {
    // 학급 회장(해쉬)
    public static String solution(int n, String str) {
        Map<Character, Integer> maps = new HashMap<>();

        for(char x : str.toCharArray()) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }

        String answer = "";

        int temp = 0;
        for(Character key : maps.keySet()) {
            if(maps.get(key) > temp) {
                temp = maps.get(key);
                answer = String.valueOf(key);
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
