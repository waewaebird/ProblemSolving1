package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250520_3 {
    // Angry Professor
    static List<String> answers = new ArrayList<>();

    public static void solution(int a, int k, int[] arr) {
        int temp = 0;
        for(int x : arr) {
            if(x < 1) {
                temp++;
            }
        }
        if(temp >= k) {
            answers.add("NO");
        } else {
            answers.add("YES");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int k = in.nextInt();

            int[] arr = new int[a];

            for (int j = 0; j < a; j++) {
                arr[j] = in.nextInt();
            }

            solution(a,k,arr);
        }

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
