package DfsBfs.rev;

import java.util.Scanner;

public class Main9RRRR {
    static int n;
    static int m;
    static int[] arr;
    static int[] combi;
    static int[] ch;

    public static void DFS(int v, int start) {
        if(v == m) {
            // pm 출력
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = start ; i < n ; i++) {
                combi[v] = arr[i];
                DFS(v+1, i+1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        ch = new int[n];

        combi = new int[m];

        DFS(0,0);
    }
}
