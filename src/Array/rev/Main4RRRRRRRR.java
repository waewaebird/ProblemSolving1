package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4RRRRRRRR {
    // 피보나치 수열
    public static List<Integer> solution(int n) {
        List<Integer> answers = new ArrayList<>();

        answers.add(1);
        answers.add(1);

        for (int i = 2; i < n; i++) {
            int number =answers.get(i-2) + answers.get(i-1);
            answers.add(number);
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Integer> answer = solution(n);

        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
