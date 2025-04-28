package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1RR {
    // 학급 회장
    public static String solution(int n, String s){
        String answer = "";

        Map<Character, Integer> map = new HashMap<>();

        for(char x: s.toCharArray()) {
            map.put(x,map.getOrDefault(x,0) + 1);
        }

        int max = 0;
        for(Map.Entry<Character, Integer> entry :map.entrySet()) {
            if(entry.getValue() > max) {
                answer = entry.getKey().toString();
                max = entry.getValue();
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
