package HashMapTreeSet.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1RRRRRRRR {
    // 학급 회장(해쉬)
    public static String solution(int n, String str){
        Map<Character, Integer> maps = new HashMap<>();
        int max = 0;

        for(char x : str.toCharArray()) {
            maps.put(x, maps.getOrDefault(x,0)+1);
        }

        String answer = "";
        for(Map.Entry<Character, Integer> entry : maps.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey().toString();
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
