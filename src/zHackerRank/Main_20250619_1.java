package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250619_1 {
    // Alternating Characters
    public static int solution(String str) {
        int answer = 0;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            String str = in.next();
            int answer = solution(str);
            answers.add(answer);
        }

        for(Integer x : answers) {
            System.out.println(x);
        }

    }
}
