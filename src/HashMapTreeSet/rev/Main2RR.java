package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2RR {
    public static String solution(String a, String b) {
        Map<Character, Integer> aMap = new HashMap<>();
        for(char x : a.toCharArray()) {
            aMap.put(x, aMap.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> bMap = new HashMap<>();
        for(char x : b.toCharArray()) {
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }

        if(aMap.equals(bMap)) {
            return "YES";
        } else {
            return "NO";
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        System.out.println(solution(a,b));

    }
}
