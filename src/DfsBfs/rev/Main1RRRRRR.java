package DfsBfs.rev;

import java.util.Scanner;

public class Main1RRRRRR {
    // 합이 같은 부분집합(DFS : 아마존 인터뷰)
    static int N;
    static int[] arr;
    static int total;
    static String answer = "NO";

    public static void DFS(int v, int sum) {
        if(answer.equals("YES")) {
            return;
        }

        if(total - sum == sum) {
            answer = "YES";
        }
        if(v == N) {
            return;
        } else {
            DFS(v + 1, sum + arr[v]);
            DFS(v + 1, sum);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }

        DFS(0,0);

        System.out.println(answer);
    }

}
