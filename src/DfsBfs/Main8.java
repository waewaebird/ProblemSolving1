package DfsBfs;

import java.util.Scanner;

public class Main8 {
    static int n;
    static int f;
    static int L;
    static int[] arr;


    public static void DFS(int v, int[] arr) {
        if(v == L+1) {
            return;
        } else {
            L++;


            DFS(v+1 , arr);
        }

    }


    public static void main(String[] args) {
        Main8 tree = new Main8();

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();

        arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = 1;
        }

        DFS(1, arr);
    }
}
