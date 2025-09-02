package zHackerRank._202508;

import java.util.*;

public class Main_20250801_1 {
    // A Chessboard Game
    public static String solution(int a, int b) {
        if((a%4 == 1 || a%4 == 2) && (b%4 == 1 || b%4 == 2)) {
            return "Second";
        } else {
            return "First";
        }
    }

    public static void main(String[] args) {

        List<String> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            answers.add(solution(a,b));
        }

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
