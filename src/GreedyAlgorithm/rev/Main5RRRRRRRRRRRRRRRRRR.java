package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRRRRRRRRRRRR {
    // 다익스트라 알고리즘
    static class Dijk implements Comparable<Dijk> {
        int v;
        int cost;

        public Dijk(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Dijk o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        List<List<Dijk>> list = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Dijk(b,c));
        }

        PriorityQueue<Dijk> queue = new PriorityQueue<>();
        dist[1] = 0;
        queue.offer(new Dijk(1,0));

        while(!queue.isEmpty()) {
            Dijk current = queue.poll();

            if(dist[current.v] < current.cost) {
                continue;
            }

            for(Dijk d : list.get(current.v)) {
                if(dist[d.v] > d.cost + current.cost) {
                    dist[d.v] = d.cost + current.cost;
                    queue.offer(new Dijk(d.v, dist[d.v]));
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
