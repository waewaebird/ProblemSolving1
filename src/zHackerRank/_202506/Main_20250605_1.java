package zHackerRank._202506;

import java.util.*;

public class Main_20250605_1 {
    // Sherlock and Squares
    public static List<Integer> solution(List<int[]> answers) {
        List<Integer> answer = new ArrayList<>();

        for(int[] temp : answers) {
            double a = Math.ceil(Math.sqrt(temp[0]));
            double b = Math.floor(Math.sqrt(temp[1]));

            answer.add((int) (b-a+1));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<int[]> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            answers.add(new int[] {a,b});
        }

        for(int x : solution(answers)) {
            System.out.println(x);
        }
    }
}
