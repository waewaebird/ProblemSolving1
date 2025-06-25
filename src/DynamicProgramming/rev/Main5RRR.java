package DynamicProgramming.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main5RRR {
    // 동전교환
    public static int solution(int n, int[] arr, int m) {
        int[] dy = new int[m+1];

        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j-arr[i]] + 1);
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        System.out.println(solution(n,arr,m));
    }
}
