package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRRRRRRR {
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

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Dijk(b,c));
        }

        int start = 1;
        dist[start] = 0;

        PriorityQueue<Dijk> pq = new PriorityQueue<>();
        pq.offer(new Dijk(1,0));

        while(!pq.isEmpty()) {
            Dijk nows = pq.poll();

            if(nows.cost > dist[nows.v]) {
                continue;
            }


            for(Dijk obj : list.get(nows.v)) {
                if(dist[obj.v] > nows.cost + obj.cost) {
                    dist[obj.v] = nows.cost + obj.cost;
                    pq.offer(new Dijk(obj.v , dist[obj.v]));
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
