package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14RRRRRRRRR {
    // 그래프 최단거리
    static int N;
    static int M;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] dist;
    static int[] ch;

    public static void BFS(int v) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(v);

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int now = queue.poll();

                if(ch[now] == 0) {
                    ch[now] = 1;
                    dist[now] = level;
                    for(Integer x : list.get(now)) {
                        queue.offer(x);
                    }
                }
            }

            level++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        dist = new int[N+1];
        ch = new int[N+1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.get(a).add(b);
        }

        BFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }


}
