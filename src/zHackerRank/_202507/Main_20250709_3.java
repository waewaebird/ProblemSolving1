package zHackerRank._202507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250709_3 {
    // Modified Kaprekar Numbers
    public static List<Integer> solution(int p, int q) {
        List<Integer> answers = new ArrayList<>();

        for (int i = p; i <= q; i++) {

            Long temp =  ((long)i * i);
            String strs = String.valueOf(temp);

            if(strs.equals("1")) {
                answers.add(1);
                continue;
            }

            if(temp == 10 || temp == 100 || temp == 1000 || temp == 10000 || temp == 100000 || temp == 1000000 || temp == 10000000 || temp == 100000000 || temp == 1000000000 || temp == 10000000000L || temp == 100000000000L || temp == 1000000000000L) {
                continue;
            }

            if(strs.length() % 2 == 0) {
                String one = strs.substring(0, strs.length() / 2);
                String two = strs.substring(strs.length() / 2, strs.length());

                if(i == Integer.valueOf(one) + Integer.valueOf(two)) {
                    answers.add(i);
                }
            } else {
                String one = strs.substring(0, strs.length() / 2);
                String two = strs.substring(strs.length() / 2, strs.length());

                if(one.equals("")) {
                    one = "0";
                }

                if(two.equals("")) {
                    two = "0";
                }

                if(i == Integer.valueOf(one) + Integer.valueOf(two)) {
                    answers.add(i);
                    continue;
                }

                one = strs.substring(0, strs.length() / 2 +1);
                two = strs.substring(strs.length() / 2 +1, strs.length());

                if(one.equals("")) {
                    one = "0";
                }

                if(two.equals("")) {
                    two = "0";
                }

                if(i == Integer.valueOf(one) + Integer.valueOf(two)) {
                    answers.add(i);
                }
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p = in.nextInt();
        int q = in.nextInt();

        List<Integer> answers = solution(p,q);

        if(answers.size() > 0) {
            for(Integer x : solution(p,q)) {
                System.out.print(x + " ");
            }
        } else {
            System.out.print("INVALID RANGE");
        }
    }
}
