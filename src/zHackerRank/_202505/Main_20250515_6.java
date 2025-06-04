package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250515_6 {
    // The Hurdle Race
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();

            if(a > k) {
                answer = Math.max(a-k, answer);
            }
        }

        System.out.println(answer);
    }
}
