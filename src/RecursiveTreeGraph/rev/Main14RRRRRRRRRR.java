package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14RRRRRRRRRR {
    // 그래프 최단거리
    public static void solution(int n, int m, List<List<Integer>> list) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] dist = new int[n+1];

        queue.offer(1);
        dist[1] = 0;

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int now = queue.poll();

                if(dist[now] == 0) {
                    dist[now] = level;

                    for (int x : list.get(now)) {
                        queue.offer(x);
                    }
                }
            }
            level++;
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dist[i]);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.get(a).add(b);
        }

        solution(n,m,list);
    }
}
