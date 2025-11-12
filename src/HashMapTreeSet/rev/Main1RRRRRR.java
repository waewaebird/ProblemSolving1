package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1RRRRRR {
    // 학급 회장(해쉬)
    public static String solution(int n, String str) {
        Map<String , Integer> maps = new HashMap<>();
        for(char x : str.toCharArray()) {
            maps.put(String.valueOf(x), maps.getOrDefault(String.valueOf(x),0) + 1);
        }

        int max = 0;
        String answer = "";
        for(Map.Entry<String, Integer> entry : maps.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
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
