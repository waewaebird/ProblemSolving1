package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250718_2 {
    // Introduction to Nim Game
    // 사람이 설계한 것도 아닌데, 자연의 수학적 성질이 게임의 법칙과 딱 맞아떨어진다
    public static String solution(int n, int[] arr) {
        String answer = "Second";

        int xSum = 0;
        for(int x : arr) {
            xSum = xSum ^ x;
        }

        if(xSum > 0) {
            answer = "First";
        }

        return answer;
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            answers.add(solution(n, arr));
        }

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
