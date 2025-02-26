package DfsBfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main5A {
    static int n, m, answer = Integer.MAX_VALUE;

    public static void DFS(int L, int sum, Integer[] arr) {
        if(sum > m) {
            return;
        }

        if(L >= answer) {
            return;
        }

        if(sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m=in.nextInt();
        DFS(0,0,arr);
        System.out.println(answer);
    }
}
