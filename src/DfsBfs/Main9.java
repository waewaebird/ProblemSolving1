package DfsBfs;

import java.util.Scanner;

public class Main9 {
    static int n;
    static int m;
    static int[] combi;

    public static void DFS(int v, int s) {
        if(v == m) {
            for(int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n ; i++) {
                combi[v] = i;
                DFS(v+1, i+1); //i 가닥으로 뽑은 값
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        combi = new int[m];

        DFS(0,1);
    }
}
