package DfsBfs.rev;

import java.util.Scanner;

public class Main6RRR {
    static int n;
    static int m;
    static int[] arr;
    static int[] perm;
    static int[] ch;

    public static void DFS(int v) {
        if(v == m) {
            for(int x : perm) {
                System.out.print(x + " ");
            }
            System.out.println();

        } else {
            for (int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    perm[v] = arr[i];
                    ch[i] = 1;
                    DFS(v+1);
                    ch[i] =0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n];
        perm = new int[m];

        ch = new int[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0);
    }
}
/*
3 2
3 6 9
* */