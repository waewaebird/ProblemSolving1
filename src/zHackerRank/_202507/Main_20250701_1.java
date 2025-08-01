package zHackerRank._202507;

import java.util.*;

public class Main_20250701_1 {
    // Happy Ladybugs
    public static String solution(int n, String arr) {
        Map<Character, Integer> maps = new HashMap<>();

        for (int i = 0; i < n; i++) {
            maps.put(arr.charAt(i), maps.getOrDefault(arr.charAt(i), 0) + 1);
        }

        for(char key : maps.keySet()) {
            if(key == '_' && maps.get(key) == arr.length()) {
                return "YES";
            }

            if(key != '_' && maps.get(key) == 1) {
                return "NO";
            }
        }

        if(maps.get('_') == null) {
            for (int i = 1; i < n; i++) {
                if(arr.charAt(i) != arr.charAt(i-1)) {
                    if(i < n - 1) {
                        if(arr.charAt(i) != arr.charAt(i+1)) {
                            return "NO";
                        }
                    }
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            String arr = in.next();

            answers.add(solution(n,arr));
        }

        for(String s : answers) {
            System.out.println(s);
        }
    }
}
