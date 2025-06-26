package zHackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250626_1 {
    // Game of Thrones - I
    public static String solution(String str) {
        Map<Character,Integer> maps = new HashMap<>();

        for(char x : str.toCharArray()) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }

        int sum = 0;
        for(Character key : maps.keySet()) {
            if(maps.get(key) % 2 != 0) {
                sum++;
            }
        }

        if(sum > 1) {
            return "NO";
        } else {
            return "YES";
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
