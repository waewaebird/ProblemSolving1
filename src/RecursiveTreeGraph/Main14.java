package RecursiveTreeGraph;

import java.util.*;

public class Main14 {
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;

        queue.offer(v);
        while(!queue.isEmpty()) {
            int currntVertex = queue.poll();
            for (int nextVertex : graph.get(currntVertex)) {
                if(ch[nextVertex] == 0) {
                    ch[nextVertex] = 1;
                    queue.offer(nextVertex);
                    dis[nextVertex] = dis[currntVertex] + 1;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main14 T = new Main14();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n+1];
        dis = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();

            graph.get(a).add(b);
        }

        T.BFS(1);
        
        //출력부분
        for(int i = 2 ; i <= n ; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
