package zHackerRank._202507;

import java.util.*;

public class Main_20250711_2 {
    // String Construction
    public static Integer solution(String str) {
        Set<Character> sets = new HashSet<>();

        for(char x : str.toCharArray()) {
            sets.add(x);
        }

        return sets.size();
    }

    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String str = in.next();
            answers.add(solution(str));
        }

        for(Integer x : answers){
            System.out.println(x);
        }
    }
}
