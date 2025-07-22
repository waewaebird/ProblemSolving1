package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRRRR {
    // 다익스트라 알고리즘
    static class Dijk implements Comparable<Dijk>{
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

    static int N;
    static int M;
    static List<List<Dijk>> list = new ArrayList<>();

    public static void solution() {
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Deque<Dijk> queue = new ArrayDeque<>();


        PriorityQueue<Dijk> pq = new PriorityQueue<>();
        pq.offer(new Dijk(1,0));
        dist[0] = 0;

        while (!queue.isEmpty()) {
            Dijk temp = pq.poll();

            for(Dijk object : list.get(temp.v)) {
                if(dist[object.v] > temp.cost + object.cost) {
                    dist[object.v] =  temp.cost + object.cost;
                    pq.offer(new Dijk(object.v, dist[object.v]));
                }
            }
        }

        for (int i = 2; i <= N ; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dist[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Dijk(b,c));
        }

        solution();
    }
}
