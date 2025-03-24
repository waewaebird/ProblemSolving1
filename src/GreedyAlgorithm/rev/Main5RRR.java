package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRR {
    static class Dijk implements Comparable<Dijk>{
        int vex;
        int cost;

        public Dijk(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Dijk o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int n;
    static int m;
    static List<List<Dijk>> graph = new ArrayList<>();
    static int[] dis;

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

            graph.get(a).add(new Dijk(b,c));
        }

        PriorityQueue<Dijk> queue = new PriorityQueue<>();
        dis[1] = 0;
        queue.offer(new Dijk(1,0));

        while (!queue.isEmpty()) {
            Dijk temp = queue.poll();

            int now = temp.vex;
            int nowCost = temp.cost;

            if(dis[now] < nowCost) {
                continue;
            }

            for(Dijk d : graph.get(now)){
                if(dis[d.vex] > nowCost + d.cost) {
                    dis[d.vex] = nowCost + d.cost;
                    queue.offer(new Dijk(d.vex, nowCost + d.cost));
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dis[i]);
            }
        }


    }

}
