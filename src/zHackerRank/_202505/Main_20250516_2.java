package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250516_2 {
    // Electronics Shop
    public static int solution(int b, int[] ks, int[] us) {
        int answer = -1;
        for(int x1 : ks) {
            for(int x2 : us) {
                int sum = x1 + x2;

                if(sum <= b) {
                    answer = Math.max(answer,sum);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b = in.nextInt();

        int n = in.nextInt();
        int[] ks = new int[n];

        int m = in.nextInt();
        int[] us = new int[m];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            ks[i] = a;

        }

        for (int i = 0; i < m; i++) {
            int aa = in.nextInt();
            us[i] = aa;
        }

        System.out.println(solution(b, ks,us));
    }
}
