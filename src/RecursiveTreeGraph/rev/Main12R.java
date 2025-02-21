package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main12R {
    //그래프에서 경로는 한번 방분한곳은 다시 가면 안됨.

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if(v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n ; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main12R T = new Main12R();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a= in.nextInt();
            int b= in.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        T.DFS(1); //정점번호 1번이 매게변수로 넘어감.
        System.out.println(answer);
    }
}
