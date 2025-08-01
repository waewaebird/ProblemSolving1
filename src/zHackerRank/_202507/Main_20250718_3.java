package zHackerRank._202507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250718_3 {
    // Tower Breakers
    public static Integer solution(int n, int m) {
        if(m == 1) {
            return 2;
        } else {
            if(n%2 == 0) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();

            answers.add(solution(n,m));
        }

        for(int x : answers) {
            System.out.println(x);
        }
    }
}
