package zHackerRank;

import java.util.*;

public class Main_20250627_2 {
    // Anagram
    public static Integer solution(String s) {
        Map<Character, Integer> amap = new HashMap<>();
        Map<Character, Integer> bmap = new HashMap<>();

        if(s.length() % 2 != 0) {
            return -1;
        } else {
            int mid = s.length() / 2;

            String a = s.substring(0, mid);
            for(Character x : a.toCharArray()) {
                amap.put(x, amap.getOrDefault(x , 0) + 1);
            }

            String b = s.substring(mid, s.length());
            for(Character x : b.toCharArray()) {
                bmap.put(x, bmap.getOrDefault(x , 0) + 1);
            }
        }


        Integer answer = 0;
        for(Character key : amap.keySet()) {
            if(bmap.get(key) == null) {
                answer += amap.get(key);
            } else {
                answer += Math.abs(amap.get(key) - bmap.get(key));

                if(amap.get(key) < bmap.get(key)) {
                    answer = answer - (bmap.get(key) - amap.get(key));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> answers = new ArrayList<>();

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String s = in.next();

            answers.add(solution(s));
        }

        for(Integer x : answers) {
            System.out.println(x);
        }
    }
}
