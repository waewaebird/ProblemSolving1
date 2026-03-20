package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRRRRRRRRRRRRRRRRRR {
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

        int N = in.nextInt();
        int M = in.nextInt();

        List<List<Dijk>> list = new ArrayList<>();
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Dijk(b,c));
        }

        PriorityQueue<Dijk> pq = new PriorityQueue<>();
        pq.offer(new Dijk(1,0));

        while(!pq.isEmpty()) {
            Dijk current = pq.poll();

            if(dist[current.v] > current.cost) {
                dist[current.v] = current.cost;

                for(Dijk obj : list.get(current.v)) {
                    if(dist[obj.v] > obj.cost + current.cost) {
                        pq.offer(new Dijk(obj.v, obj.cost + current.cost));
                    }
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dist[i]);
            }
        }
    }
}
