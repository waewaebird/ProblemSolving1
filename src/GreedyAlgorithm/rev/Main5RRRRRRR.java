package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRR {
    static class Dijk implements Comparable<Dijk> {
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

    public static void solution(int n, List<List<Dijk>> list) {
        int[] dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        PriorityQueue<Dijk> queue = new PriorityQueue<>();
        dis[1] = 0;
        queue.offer(new Dijk(1,0));

        while (!queue.isEmpty()) {
            Dijk temp = queue.poll();
            int nowVex = temp.vex;
            int nowCost = temp.cost;

            if(dis[nowVex] < nowCost) {
                continue;
            }

            for(Dijk obj : list.get(nowVex)) {
                if(dis[obj.vex] > obj.cost + nowCost ) {
                    dis[obj.vex] = obj.cost + nowCost;
                    queue.offer(new Dijk(obj.vex, dis[obj.vex]));
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if(dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dis[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<List<Dijk>> list = new ArrayList<>();

        for (int i = 0; i <= n ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Dijk(b,c));
        }

        solution(n, list);
    }
}
