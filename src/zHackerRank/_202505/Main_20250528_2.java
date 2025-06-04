package zHackerRank._202505;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250528_2 {
    // HackerRank in a String!
    public static List<String> solution(int n, String[] arr) {
        List<String> answers = new ArrayList<>();
        String s = "hackerrank";
        for (String temp : arr) {
            String answer = "";
            int cnt = 0;
            for(char x : temp.toLowerCase().toCharArray()) {
                if(x == s.charAt(cnt)) {
                    answer += x;
                    cnt++;
                }

                if(cnt == s.length()) {
                    break;
                }
            }
            if(answer.equals(s)) {
                answers.add("YES");
            } else {
                answers.add("NO");
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        for(String x : solution(n,arr)) {
            System.out.println(x);
        }
    }
}
