package zHackerRank._202507;

import java.util.*;

public class Main_20250702_1 {
    // Two Strings
    public static String solution(String a, String b) {
        Set<Character> sets = new HashSet<>();

        for(char x : a.toCharArray()) {
            sets.add(x);
        }

        for (char x : b.toCharArray()) {
            if(sets.contains(x)) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            String a = in.next();
            String b = in.next();

            answers.add(solution(a,b));
        }

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
