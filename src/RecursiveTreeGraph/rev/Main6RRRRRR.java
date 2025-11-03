package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main6RRRRRR {
    // 부분집합 구하기(DFS)
    static int N;
    static int[] ch;

    public static void DFS(int v) {
        if(v == N+1) {
            for (int i = 1; i <= N; i++) {
                if(ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[v] = 1;
            DFS(v+1);
            ch[v] = 0;
            DFS(v+1);
       }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        ch = new int[N+1];

        DFS(1);
    }
}
