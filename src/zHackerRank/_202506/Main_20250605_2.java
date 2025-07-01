package zHackerRank._202506;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_20250605_2 {
    // Pangrams

    public static String solution(String str) {
        Set<Character> st = new HashSet<>();

        for(char x : str.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(x)) {
                st.add(x);
            }
        }

        if(st.size() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));

    }
}
