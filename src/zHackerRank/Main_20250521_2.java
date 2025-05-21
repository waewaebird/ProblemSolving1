package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main_20250521_2 {
    // Find Digits
    public static int solution(int number) {
        int answer = 0;
        String temp = String.valueOf(number);

        for(char x : temp.toCharArray()) {
            if(x == '0') {
                continue;
            }

            if(number % Integer.valueOf(String.valueOf(x)) == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            answers.add(solution(a));
        }

        for(int x: answers) {
            System.out.println(x);
        }

    }

}
