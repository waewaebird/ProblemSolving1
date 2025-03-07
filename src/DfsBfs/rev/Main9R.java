package DfsBfs.rev;

import java.util.Scanner;

public class Main9R {
    static int[] combi;


    public static void DFS(int level, int start, int n, int m) {
        if(level == m) {
            for(int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = start ; i <= n; i++) {
                combi[level] = i;
                DFS(level+1, i+1, n, m);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        combi = new int[m];

        DFS(0,1, n, m);
    }
}
