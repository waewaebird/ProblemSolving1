package zHackerRank._202506;

import java.util.*;

public class Main_20250627_1 {
    // Permuting Two Arrays
    public static String solution(int n, int k, Integer[] as, Integer[] bs) {
        Arrays.sort(as);
        Arrays.sort(bs, Collections.reverseOrder());

        String answer = "YES";

        for (int i = 0; i < n; i++) {
            if(as[i] + bs[i] < k) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int q= in.nextInt();

        for (int i = 0; i < q; i++) {
            int n = in.nextInt();

            Integer[] as = new Integer[n];
            Integer[] bs = new Integer[n];

            int k = in.nextInt();

            for (int j = 0; j < n; j++) {
                as[j] = in.nextInt();
            }

            for (int j = 0; j < n; j++) {
                bs[j] = in.nextInt();
            }

            String temp = solution(n,k,as,bs);

            answers.add(temp);
        }

        for(String x : answers) {
            System.out.println(x);
        }


    }
}
