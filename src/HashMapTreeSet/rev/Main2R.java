package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2R {
    public static String solution(String a, String b) {
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        for(char x : a.toCharArray()) {
            am.put(x, am.getOrDefault(x,0) + 1);
        }

        for(char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x,0) + 1);
        }

        if(am.equals(bm)) {
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
