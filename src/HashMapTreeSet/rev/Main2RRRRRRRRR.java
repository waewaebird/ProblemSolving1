package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2RRRRRRRRR {
    // 아나그램(해쉬)
    public static String solution(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        for(char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x,0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for(char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        if(map1.equals(map2)) {
            return "YES";
        } else {
            return "NO";
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        System.out.println(solution(str1,str2));
    }
}
