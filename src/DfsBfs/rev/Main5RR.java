package DfsBfs.rev;

import java.util.Scanner;

public class Main5RR {
    static int n;
    static int[] arr;
    static int m;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int sum) {
        if(v > answer) {
            return;
        }

        if(sum >= m) {
            if(sum == m) {
                answer = Math.min(answer, v);
            }
            return;
        } else {
            for (int i =n-1; i >= 0; i--) {
                DFS(v+1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        m = in.nextInt();

        //Arrays.sort(arr);

        DFS(0,0);

        System.out.println(answer);
    }
}
