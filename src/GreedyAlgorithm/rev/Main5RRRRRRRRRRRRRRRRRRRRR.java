package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRRRRRRRRRRRRRRR {
    // 다익스트라 알고리즘
    static class Edge implements Comparable<Edge> {
        int v;
        int cost;

        public Edge(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        List<List<Edge>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Edge(b,c));
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>();

        dist[1] = 0;
        pq.offer(new Edge(1,0));

        while(!pq.isEmpty()) {
            Edge current = pq.poll();

            for(Edge e : list.get(current.v)) {
                if(dist[e.v] > current.cost + e.cost) {
                    dist[e.v] = current.cost + e.cost;
                    pq.offer(new Edge(e.v, dist[e.v]));
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
