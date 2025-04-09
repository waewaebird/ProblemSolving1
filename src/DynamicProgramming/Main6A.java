package DynamicProgramming;

import java.util.Scanner;

public class Main6A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] dy = new int[m+1]; //시간으로 얻을수 있는 최대 점수

        for (int i = 0; i < n; i++) {
            int ps = in.nextInt();
            int pt = in.nextInt();

            for (int j = m; j >= pt ; j--) {
                dy[j] = Math.max(dy[j], dy[j-pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }
}
