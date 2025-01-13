package HashMapTreeSet;

import java.util.*;

public class Main2 {
    public static String solution1(String s1,  String s2) {
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        for(char x : s2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static String solution(String a,  String b) {
        Map<String, Integer> aa = new HashMap<>();
        Map<String, Integer> bb = new HashMap<>();

        for (char c : a.toCharArray()) {
            String s = String.valueOf(c);
            int temp = 1;
            if(aa.containsKey(s)) {
                temp = aa.get(s) + 1;
            }
            aa.put(s,temp);
        }

        for (char c : b.toCharArray()) {
            String s = String.valueOf(c);
            int temp = 1;
            if(bb.containsKey(s)) {
                temp = bb.get(s) + 1;
            }
            bb.put(s,temp);
        }

        for ( String key : aa.keySet() ) {
            if(aa.get(key) != bb.get(key)) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        System.out.println(solution(a,b));

    }
}
