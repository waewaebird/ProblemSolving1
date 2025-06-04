package zHackerRank._202505;

import java.util.*;

public class Main_20250520_5 {
    // Save the Prisoner!
    public static int solution(int n, int m, int s) {
        int temp = m-(n-s+1);

        if(temp % n == 0) {
            return n;
        } else {
            if(temp % n >= 0) {
                return temp % n;
            } else {
                return n + (temp % n);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();

            int solution = solution(n,m,s);

            answers.add(solution);
        }

        for(int x : answers) {
            System.out.println(x);
        }

    }
}
