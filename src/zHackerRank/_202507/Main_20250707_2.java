package zHackerRank._202507;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250707_2 {
    // Making Anagrams
    public static Integer solution(String str1, String str2) {
        Integer answer = 0;

        Map<Character, Integer> maps1 = new HashMap<>();
        for(char x : str1.toCharArray()) {
            maps1.put(x, maps1.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> maps2 = new HashMap<>();
        for(char x : str2.toCharArray()) {
            maps2.put(x, maps2. getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : maps1.entrySet()) {
            if(!maps2.containsKey(entry.getKey().charValue())) {
                answer += entry.getValue();
            } else {
                if(maps1.get(entry.getKey().charValue()) != maps2.get(entry.getKey().charValue())){
                    answer = answer + Math.abs(maps1.get(entry.getKey().charValue()) - maps2.get(entry.getKey().charValue()));
                }
            }
        }

        for(Map.Entry<Character, Integer> entry : maps2.entrySet()) {
            if(!maps1.containsKey(entry.getKey().charValue())) {
                answer += entry.getValue();
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        System.out.println(solution(str1,str2));
    }
}
