package zHackerRank._202506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250617_2 {
    // Manasa and Stones
    public static List<Integer> solution(int n, int a, int b) {
        List<Integer> answers = new ArrayList<>();

        // 1 & 90 b-a
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int min = 0;
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            min += a;
            max += b;
        }

        int number = b-a;

        if(b-a == 0) {
            answers.add(max);
        } else {
            for (int i = min; i <= max; i = i+number) {
                answers.add(i);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        List<List<Integer>> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            answers.add(solution(n,a,b));
        }

        for(List<Integer> x: answers) {
            for(Integer temp : x) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
