package DfsBfs.rev;

import java.util.Scanner;

public class Main6RRRR {
    static int n;
    static int m;
    static int[] arr;
    static int[] pm;
    static int[] ch;

    public static void DFS(int v) {
        if(v == m) {
            // pm 출력
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[v] = arr[i];
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

        pm = new int[m];

        DFS(0);
    }
}
