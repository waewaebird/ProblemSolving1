package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250715_1 {
    // Organizing Containers of Balls
    public static String solution(int n, List<List<Integer>> list) {
        List<Long> a1 = new ArrayList<>();
        List<Long> a2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Long sum1 = 0L;
            Long sum2 = 0L;
            for (int j = 0; j < n; j++) {
                sum1 += list.get(j).get(i);
                sum2 += list.get(i).get(j);
            }
            a1.add(sum1);
            a2.add(sum2);
        }


        a1.sort(null);
        a2.sort(null);

        if(a1.equals(a2)) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            List<List<Integer>> list = new ArrayList<>();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList<>();

                for (int k = 0; k < n; k++) {
                    temp.add(in.nextInt());
                }
                list.add(temp);
            }
            answers.add(solution(n,list));
        }

        for(String x : answers) {
            System.out.println(x);
        }

    }
}
