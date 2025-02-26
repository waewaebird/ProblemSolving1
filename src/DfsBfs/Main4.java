package DfsBfs;

import java.util.Scanner;

public class Main4 {
    static int[] pm;
    static int n;
    static int m;

    public static void DFS(int L) {
        if(L == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = 1; i<= n; i++) { //n가닥 호출
                pm[L] = i;//
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pm = new int[m];
        DFS(0);
    }
}
