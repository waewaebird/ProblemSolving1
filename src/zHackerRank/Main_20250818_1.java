package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250818_1 {
    // Sherlock and The Beast
    public static String solution(int n) {
        if(n >= 3) {
            StringBuilder temp = new StringBuilder("");

            int number1 = n/3;

            boolean isFive = false;

            for (int i = number1; i >= 0; i--) {
                if(isFive) {
                    break;
                }
                if(((n - (i * 3)) % 5) == 0) {
                    for (int j = 0; j < i*3; j++) {
                        temp.append("5");
                    }

                    isFive = true;
                }
            }

            int cnt = n - temp.toString().length();

            if(cnt % 5 == 0) {
                if(cnt > 0) {
                    for (int i = 0; i < cnt; i++) {
                        temp.append("3");
                    }
                }
            } else {
                temp = new StringBuilder("-1");
            }

            return temp.toString();
        } else {
            return String.valueOf(-1);
        }
    }


    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            answers.add(solution(n));
        }

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
