package zHackerRank._202506;

import java.util.*;

public class Main_20250630_1 {

    public static Integer solution(int n, String[] arr) {
        Map<Character, Integer> maps = new HashMap<>();

        for(String s : arr) {
            Set<Character> sets = new HashSet<>();
            for(Character x : s.toCharArray()) {
                sets.add(x);
            }

            for(Character x : sets) {
                maps.put(x , maps.getOrDefault(x, 0) + 1);
            }
        }

        int answer = 0;
        for(Character key : maps.keySet()) {
            if(maps.get(key) == arr.length) {
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        System.out.println(solution(n, arr));
    }
}
