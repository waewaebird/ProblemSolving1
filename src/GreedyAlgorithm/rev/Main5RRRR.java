package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRR {
    static class Edge implements Comparable<Edge> {
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int n;
    static int m;
    static List<List<Edge>> graph = new ArrayList<>();
    static int[] dis;

    public static void solution(int v) {
        PriorityQueue<Edge> queue = new PriorityQueue<>();

        dis[v] = 0;
        queue.offer(new Edge(1,0));

        while (!queue.isEmpty()) {
            Edge temp = queue.poll();

            int nowVex = temp.vex;
            int nowCost = temp.cost;

            if(dis[nowVex] < nowCost) {
                continue;
            }

            for(Edge e : graph.get(nowVex)) {
                if(dis[e.vex] > nowCost + e.cost) {
                    dis[e.vex] = nowCost + e.cost;
                    queue.offer(new Edge(e.vex, nowCost + e.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new Edge(b,c));
        }

        solution(1);

        for (int i = 0; i < n; i++) {
            if(dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dis[i]);
            }
        }
    }
}
