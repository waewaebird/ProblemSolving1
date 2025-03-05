package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14RRRR {
    static int n;
    static int m;
    static int[][] graphA;
    static List<List<Integer>> graphB;
    static int[] dis;
    static int[] ch;

    public static void BFSA(int v) {
        Queue<Integer> queue = new LinkedList<>();

        ch[v] = 1;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int i = 1; i <= n ; i++) {
                if(graphA[cv][i] == 1 && ch[i] == 0) {
                    ch[i] =  1;
                    queue.offer(i);
                    dis[i] = dis[cv] + 1;
                }
            }
        }
    }

    public static void BFSB(int v) {
        Queue<Integer> queue = new LinkedList<>();

        ch[v] = 1;
        queue.offer(v);

        while(!queue.isEmpty()) {
            int cv = queue.poll();
            for(Integer nv : graphB.get(cv)) {
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

        graphA = new int[n+1][n+1];
        graphB = new ArrayList<>();

        ch = new int[n+1];
        dis = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graphB.add(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graphA[a][b] = 1;
            graphB.get(a).add(b);
        }

        BFSA(1);
        //BFSB(1);


        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
