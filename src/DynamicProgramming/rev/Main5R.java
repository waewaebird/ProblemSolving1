package DynamicProgramming.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main5R {

    public static int solution(int n, int m, int[] coin) {
        int[] dy = new int[m+1];
        Arrays.fill(dy, Integer.MAX_VALUE);

        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j-coin[i]] + 1, dy[j]);// +1인 이유는 coin(1,2,5) 하나를 사용하는것
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = in.nextInt();
        }

        int m = in.nextInt();

        System.out.println(solution(n, m, coin));
    }
}
