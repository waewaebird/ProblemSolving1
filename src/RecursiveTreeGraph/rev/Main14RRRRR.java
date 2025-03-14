package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14RRRRR {
    static int n;
    static int m;
    static List<List<Integer>> graph;
    static int[] ch;
    static int[] dis;

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();

        ch[v] = 1;
        dis[v] = 0;

        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();

            for(int nv : graph.get(cv)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        dis = new int[n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        System.out.println(graph);
        BFS(1);

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }
}
