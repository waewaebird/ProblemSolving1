package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250523_2 {
    // Service Lane
    public static List<Integer> solution(int n, int t, int[] width, List<int[]> cases) {
        List<Integer> answers = new ArrayList<>();

        for(int[] temp : cases) {
            int a = temp[0];
            int b = temp[1];

            int min = Integer.MAX_VALUE;
            for (int i = a; i <= b; i++) {
                min = Math.min(min, width[i]);
            }

            answers.add(min);
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = in.nextInt();

        List<int[]> cases = new ArrayList<>();

        int[] width = new int[n];
        for (int i = 0; i < n; i++) {
            width[i] = in.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            cases.add(new int[] {a,b});
        }

        for(int x : solution(n,t,width,cases)) {
            System.out.println(x);
        }
    }

}
