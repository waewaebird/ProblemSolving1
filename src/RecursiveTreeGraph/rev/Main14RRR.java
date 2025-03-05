package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main14RRR {
    static int n;
    static int m;
    static int[][] graph;
    static int ch[];
    static int level[];

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();

        ch[v] = 1;
        level[v] = 0;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int i = 1; i <= n; i++) {
                if(graph[cv][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    queue.offer(i);
                    level[i] = level[cv] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];
        level = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a= in.nextInt();
            int b= in.nextInt();

            graph[a][b] = 1;
        }

        BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + level[i]);
        }
    }
}
