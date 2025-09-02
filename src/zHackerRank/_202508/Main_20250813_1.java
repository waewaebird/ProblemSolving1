package zHackerRank._202508;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250813_1 {
    // Sherlock and the Valid String
    public static String solution(String str) {
        Map<Character, Integer> maps = new HashMap<>();
        for(char x : str.toCharArray()) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }

        Map<Integer, Integer> mi = new HashMap<>();

        for(Integer values : maps.values()) {
            mi.put(values, mi.getOrDefault(values, 0) + 1);
        }

        String answer = "";

        if(mi.size() == 1) {
            answer = "YES";
        } else if(mi.size() == 2) {
            int index1 = 0;
            int index2 = 0;

            boolean flag = false;
            for(Map.Entry<Integer, Integer> entry : mi.entrySet()) {
                if(entry.getValue() == 1) {
                    flag = true;
                    index1 = entry.getKey();
                } else {
                    index2 = entry.getKey();
                }
            }

            if(flag && Math.abs(index1 - index2) == 1 || index1 == 1) {
                answer = "YES";
            } else {
                answer = "NO";
            }
        } else {
            int cnt = 0;

            int index1 = 0;
            int index2 = 0;

            for(Map.Entry<Integer, Integer> entry : mi.entrySet()) {
                if(entry.getValue() > 1) {
                    cnt++;
                    index1 = entry.getKey();
                } else {
                    index2 = entry.getKey();
                }
            }

            if(cnt > 1) {
                answer = "NO";
            } else {
                if(Math.abs(index1 - index2) > 1) {
                    answer = "NO";
                } else {
                    if(mi.size() == 2) {
                        answer = "YES";
                    } else {
                        answer = "NO";
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
