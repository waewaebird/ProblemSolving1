package XTest;

import java.util.Scanner;

public class Main4 {
    //합이 같은 부분집합
    static int N;
    static int[] arr;
    static int total;
    static boolean flag = true;

    public static void DFS(int v, int sum) {
        if(flag == false) {
            return;
        }

        if(total - sum == sum) {
            System.out.println("YES");
            flag = false;
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

        if(flag == true) {
            System.out.println("NO");
        }

    }
}
