package DfsBfs.rev;

import java.util.Scanner;

public class Main6R {
    static int n;
    static int m;
    static int[] arr;
    static int[] ch;
    static int[] mo;

    public static void DFS(int v) {
        if(v == m) {
            for(int x : mo) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    mo[v] = arr[i];
                    DFS(v+1);
                    ch[i] = 0;
                }
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
        mo = new int[m];

        DFS(0);
    }
}
