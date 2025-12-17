package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main6RRRRRRRR {
    // 부분집합 구하기(DFS)
    static int N;
    static int[] ch;

    public static void DFS(int v) {
        if(v > N) {
            for (int i = 1; i <= N; i++) {
                if(ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            if(ch[v] == 0) {
                ch[v] = 1;
                DFS(v+1);
                ch[v] = 0;
                DFS(v+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        ch = new int[N+1];

        DFS(1);
    }
}
