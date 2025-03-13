package DfsBfs.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main5R {
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int sum, int n, int m, int[] arr, int cnt) {
        if(cnt >= answer) {
            return;
        }

        if(sum >= m) {
            if(sum == m) {
                answer = Math.min(answer, cnt);
            }
            return;
        } else {
            for (int i = n-1; i >= 0; i--) {
                DFS(sum + arr[i], n, m, arr, cnt+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        Arrays.sort(arr);

        DFS(0,n,m,arr,0);
        System.out.println(answer);
    }
}
