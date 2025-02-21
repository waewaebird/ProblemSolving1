package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main12RR {
    static int n;
    static int m;
    static int answer;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if(v == n) {
            answer++;
        } else {
            for (int i = 0; i <= n; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main12RR T = new Main12RR();

        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph[a][b] = 1;
        }

        ch[1] = 1;
        T.DFS(1);

        System.out.println(answer);

    }
}
