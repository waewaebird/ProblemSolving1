package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250821_1 {
    // Sansa and XOR
    public static Integer solution(int n, int[] arr) {
        int sum = 0;

        if(n % 2 != 0) {
            for (int i = 0; i < n; i = i + 2) {
                sum = sum ^ arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            answers.add(solution(n,arr));
        }

        for(int x : answers) {
            System.out.println(x);
        }
    }
}
