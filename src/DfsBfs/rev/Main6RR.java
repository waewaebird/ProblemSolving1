package DfsBfs.rev;

import java.util.Scanner;
/*
3 2
3 6 9
*/

public class Main6RR {
    static int n;
    static int m;
    static int[] arr;
    static int[] perm;
    static int[] ch;

    public static void DFS(int level) {
        if(level == m) {
            for(int x : perm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(ch[i] ==0) {
                    ch[i] = 1;
                    perm[level] = arr[i];
                    DFS(level+1);
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
        perm = new int[m];
        ch = new int[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0);
    }
}
