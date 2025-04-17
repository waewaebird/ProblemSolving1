package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRR {
    //다익스트라
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

    static int N;
    static int M;
    static int[] dis;
    static List<List<Dijk>> graph = new ArrayList<>();

    public static void solution(int v) {
        PriorityQueue<Dijk> queue = new PriorityQueue<>();
        queue.offer(new Dijk(v,0));
        dis[v] = 0;

        while (!queue.isEmpty()) {
            Dijk dijk = queue.poll();

            int now = dijk.vex;
            int nowCost = dijk.cost;

            if(dis[now] < nowCost) {
                continue;
            }

            for(Dijk obj : graph.get(now)) {
                if(dis[obj.vex] > obj.cost + nowCost) {
                    dis[obj.vex] = obj.cost + nowCost;
                    queue.offer(new Dijk(obj.vex,dis[obj.vex]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        dis = new int[N+1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new Dijk(b,c));
        }

        solution(1);

        for (int i = 2; i <= N ; i++) {
            if(dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dis[i]);
            }
        }
    }
}
