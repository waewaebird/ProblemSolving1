package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRRRRRRRR {
    // 다익스트라 알고리즘
    static class Dijk implements Comparable<Dijk>{
        int v1;
        int cost;

        public Dijk(int v1, int cost) {
            this.v1 = v1;
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

        List<List<Dijk>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        int[] dist = new int[n+1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Dijk(b,c));
        }

        dist[1] = 0;
        Queue<Dijk> queue = new ArrayDeque<>();
        queue.offer(new Dijk(1,0));

        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Dijk current = queue.poll();

                for(Dijk obj : list.get(current.v1)) {
                    if(dist[obj.v1] > current.cost + obj.cost) {
                        dist[obj.v1] = current.cost + obj.cost;
                        queue.offer(new Dijk(obj.v1, dist[obj.v1]));
                    }
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
