package HashMapTreeSet;

import java.util.*;

public class Main1 {
    public static char solution1(int n,  String s) {
        char answer= ' ';
        Map<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1); //key가 없을때를 대비
        }

        System.out.println(map.containsKey('A')); //true false
        System.out.println(map.size()); //key의 갯수
        System.out.println(map.remove('A'));

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            //key값 전부 탐색
            //System.out.println( key + " " + map.get(key));
            if(map.get(key) > max) {
                max = map.get(key);
                answer=key;
            }
        }

        return answer;
    }

    public static String solution(int n,  String s) {
        String answer = "";
        int number = 0;

        for(char c : s.toCharArray()) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i) == c) {
                    cnt++;
                }
            }
            if(cnt > number) {
                answer = String.valueOf(c);
                number = cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(solution1(n,s));

    }
}
