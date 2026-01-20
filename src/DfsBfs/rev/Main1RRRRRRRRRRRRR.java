package DfsBfs.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main1RRRRRRRRRRRRR {
    // 합이 같은 부분집합(DFS : 아마존 인터뷰)
    static int N;
    static int[] arr;
    static int max = 0;
    static String answer = "NO";
    public static void DFS(int v, int sum) {
        if(answer.equals("YES")) {
            return;
        }

        if(v == N) {
            if(sum * 2 == max) {
                answer = "YES";
            }
        } else {
            DFS(v+1, sum + arr[v]);
            DFS(v+1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        max = Arrays.stream(arr).sum();

        DFS(0,0);
        System.out.println(answer);
    }
}
