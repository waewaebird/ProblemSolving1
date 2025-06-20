package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2RRR {
    // 아나그램(해쉬)
    public static String solution(String str, String s) {
        Map<Character, Integer> maps1 = new HashMap<>();
        for(char x : str.toCharArray()) {
            maps1.put(x, maps1.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> maps2 = new HashMap<>();
        for(char x : s.toCharArray()) {
            maps2.put(x, maps2.getOrDefault(x, 0) + 1);
        }

        boolean flag = true;
        for(Character key : maps1.keySet()) {
            if(maps1.get(key) != maps2.get(key)) {
                flag = false;
                break;
            }
        }

        if(flag) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String s = in.next();

        System.out.println(solution(str,s));
    }
}
