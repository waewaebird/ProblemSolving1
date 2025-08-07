package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRRRRR {
    // 다익스트라 알고리즘
    static class DIjk implements Comparable<DIjk>{
        int v;
        int cost;

        public DIjk(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }


        @Override
        public int compareTo(DIjk o) {
            return Integer.compare(this.cost , o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int v = in.nextInt();

        List<List<DIjk>> list = new ArrayList<>();

        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < v; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new DIjk(b,c));
        }

        dist[1] = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);

        while(!queue.isEmpty()) {
            int nowVex = queue.poll();

            for(DIjk d : list.get(nowVex)) {
                int nextVex = d.v;
                int cost = d.cost;

                if(dist[nextVex] > dist[nowVex] + cost) {
                    queue.offer(nextVex);
                    dist[nextVex] = dist[nowVex] + cost;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dist[i]);
            }
        }
    }
}
