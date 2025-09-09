package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2RRRRRR {
    // 아나그램(해쉬)
    public static String solution(String s1, String s2) {
        Map<Character, Integer> m1 = new HashMap<>();
        for(char x : s1.toCharArray()) {
            m1.put(x, m1.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> m2 = new HashMap<>();
        for(char x : s2.toCharArray()) {
            m2.put(x, m2.getOrDefault(x, 0) + 1);
        }

        if(m1.equals(m2)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        System.out.println(solution(s1,s2));
    }
}
