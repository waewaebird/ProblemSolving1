package DfsBfs.rev;

import java.util.Scanner;

public class Main4R {
    static int n;
    static int m;
    static int[] arr;

    public static void DFS(int v) {
        if(v == m) {
            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                arr[v] = i;
                DFS(v+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[m];

        DFS(0);
    }
}
